/*
 *  TxMark 1.0.0.alpha-0-g0639c8a
 *
 *  Copyright (c) 2016 Aaron G. Daisley-Harrison
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
using Microsoft.VisualStudio.Text;
using System.Threading;

namespace TxMark.VisualStudioExtensions
{
    /// <summary>Three methods called by <see cref="BackgroundAnalyzer{I,R}"/>.</summary>
    internal interface IBackgroundWork<TInput, TResults>
    {
        /// <summary>Step 1: This is called on the UI thread to get pre-existing 
        /// data used by the analyzer (e.g. tokens).</summary>
        TInput GetInputSnapshot();
        /// <summary>Step 2: This is called in the Thread Pool to run a background 
        /// analysis procedure (e.g. parsing).</summary>
        /// <param name="input">The value returned by GetInputSnapshot()</param>
        /// <param name="cancelToken">The cancellation signal indicates that the 
        /// text buffer has changed since the operation started; aborting is 
        /// optional and if the method does abort, it should return null.</param>
        /// <remarks>Any thrown exception is traced out and ignored.</remarks>
        TResults DoWork(ITextSnapshot snapshot, TInput input, CancellationToken cancelToken);
        /// <summary>Step 3: This is called to notify the UI thread that Run() 
        /// succeeded, which is defined as whenever Run() does not return null or 
        /// throw an exception.</summary>
        void OnWorkDone(TResults results);
    }

}
