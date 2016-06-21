using System;
using System.Diagnostics;
using System.Threading;
using System.Threading.Tasks;
using System.Windows.Media;
using System.Windows.Threading;
using Microsoft.VisualStudio.Text;

namespace TxMark.VisualStudioExtensions
{

    /// <summary>Helper class for parsers or other analysis taggers that are too 
    /// slow to run synchronously. The <c>IBackgroundAnalyzerImpl.Run()</c> method 
    /// is called on a thread-pool thread to perform the analysis.</summary>
    /// <remarks>
    /// This class is designed for cases where the number of tags in a file is 
    /// manageable (e.g. one tag per line or less), as it does not use any memory-
    /// saving techniques.
    /// <para/>
    /// To create a background tagger, make a derived class that implements
    /// <c>Run()</c>, and write a factory class with MEF attributes that implements
    /// <c>ITaggerProvider</c>. This class accepts an optional <c>SyntaxClassifierForVS</c>
    /// which will will provide token information.</remarks>
    public class BackgroundWorker<TInput, TResults>
    {
        // Analysis logic
        IBackgroundWork<TInput, TResults> _work;
        // Visual Studio imports and text buffer
        protected ITextBuffer _buffer;
        // Timer that initiates _impl.Run() a certain amount of time after editing (default: 750ms)
        protected Lazy<DispatcherTimer> _runTimer;
        static TimeSpan TimerDelay = TimeSpan.FromMilliseconds(750);
        // Results of Run()
        protected TResults _results;
        // Set to null when we have not yet requested to start Run()
        CancellationTokenSource _ctsIfRunning;
        protected bool IsRunning { get { return _ctsIfRunning != null; } }

        internal BackgroundWorker(ITextBuffer buffer, IBackgroundWork<TInput, TResults> work, bool createTimerNow)
        {
            _buffer = buffer;
            _work = work;
            _buffer.Changed += OnTextBufferChanged;
            _runTimer = new Lazy<DispatcherTimer>(() =>
            {
                var timer = new DispatcherTimer(DispatcherPriority.Background)
                {
                    Interval = TimerDelay,
                    IsEnabled = true
                };
                timer.Tick += ParseTimerTick;
                return timer;
            });
            if (createTimerNow)
                AutoCreateTimer();
        }

        public void AutoCreateTimer()
        {
            var _ = _runTimer.Value;
        }

        protected void OnTextBufferChanged(object sender, TextContentChangedEventArgs e)
        {
            if (_runTimer.IsValueCreated)
                _runTimer.Value.Start();
            if (IsRunning)
                _ctsIfRunning.Cancel();
        }

        private void ParseTimerTick(object sender, EventArgs e)
        {
            if (!IsRunning)
            {
                _runTimer.Value.Stop();
                _ctsIfRunning = new CancellationTokenSource(); // IsRunning = true

                ITextSnapshot snapshot = _buffer.CurrentSnapshot;
                TInput input = _work.GetInputSnapshot();
                ThreadPool.QueueUserWorkItem(@null =>
                {
                    try
                    {
                        var results = _work.DoWork(snapshot, input, _ctsIfRunning.Token);
                        if (results != null)
                            _runTimer.Value.Dispatcher.Invoke(new Action<TResults>(OnWorkDone), results);
                    }
                    catch (Exception ex)
                    {
                        Trace.WriteLine($"Exception occurred in while working on: {_work.GetType().Name}");
                        Trace.WriteLine(ex.ToString());
                    }
                    finally
                    {
                        _ctsIfRunning = null; // set IsRunning = false
                    }
                });
            }
        }

        protected virtual void OnWorkDone(TResults results) // called on UI thread
        {
            _results = results;

            _work.OnWorkDone(results);

            if (_runTimer.Value.IsEnabled)
            { // Add a delay between successful runs
                _runTimer.Value.Stop();
                _runTimer.Value.Start();
            }
        }
    }


}
