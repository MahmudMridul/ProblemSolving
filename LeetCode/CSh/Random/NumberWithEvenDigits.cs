using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSh.Random
{
    internal class NumberWithEvenDigits
    {
        public int FindNumbers(int[] nums)
        {
            return nums.Count(num => num.ToString().Length % 2 == 0);
        }

        public int[] SortedSquares(int[] nums)
        {
            return nums.Select(num => num * num).ToArray();
        }
    }
}
