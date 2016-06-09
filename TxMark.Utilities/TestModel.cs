using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.Utilities
{
    public class TestModel
    {
        public bool IsFirstBranch
        {
            get
            {
                return true;
            }
        }
        public bool IsSecondBranch
        {
            get
            {
                return true;
            }
        }
        public bool IsThirdBranch
        {
            get
            {
                return true;
            }
        }
        public string[] array
        {
            get
            {
                return new string[] { "one", "two", "three", "four", "five", "six" };
            }
        }

        public string CalendarService
        {
            get
            {
                return "MyOwnBloodyCalendarService";
            }
        }
        public string Link
        {
            get
            {
                return "http://daisley-harrison.com/nowhere";
            }
        }
    }
}
