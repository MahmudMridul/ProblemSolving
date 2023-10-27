using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSh.Random
{
    internal class RemoveDuplicatesFromSortedArray
    {
        public int RemoveDuplicates(int[] nums)
        {
            int pointer = 1;
            int lastSeen = nums[0];
            for(int i = 1; i < nums.Length; ++i)
            {
                if (nums[i] != lastSeen)
                {
                    nums[pointer] = nums[i];
                    ++pointer;
                    lastSeen = nums[i];
                }
            }
            return pointer;
        }
    }
}
