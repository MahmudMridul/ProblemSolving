using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSh.Easy
{
    internal class HeightChecker_1051
    {
        public int HeightChecker(int[] heights)
        {
            int[] copy = (int[])heights.Clone();
            Array.Sort(copy);
            int count = 0;
            for (int i = 0; i < heights.Length; ++i)
            {
                if (heights[i] != copy[i]) ++count;
            }
            return count;
        }
    }
}
