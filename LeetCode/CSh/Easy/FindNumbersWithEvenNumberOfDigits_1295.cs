using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSh.Easy
{
    internal class FindNumbersWithEvenNumberOfDigits_1295
    {
        public int FindNumbers(int[] nums)
        {
            return nums.Count(num => num.ToString().Length % 2 == 0);
        }


    }
}
