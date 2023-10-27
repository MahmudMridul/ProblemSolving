﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSh.Random
{
    internal class RemoveFromArray
    {
        public int RemoveElement(int[] nums, int val)
        {
            int pointer = 0;
            for(int i = 0; i < nums.Length; ++i)
            {
                if (nums[i] != val)
                {
                    (nums[pointer], nums[i]) = (nums[i], nums[pointer]);
                    ++pointer;
                }
            }
            return pointer;
        }
    }
}
