import Example.NestedClass.Outer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;
        System.out.println(new Solution().subarraysDivByK(nums, k));
    }
}

class Solution {
    public int count;
    public int k;
    public int[] nums;

    public int subarraysDivByK(int[] nums, int d) {
        this.nums = nums;
        this.k = d;
        getAllSubArray(0, 0);
        return count;
    }

    public void getAllSubArray(int index, int sum) {
        if(index == nums.length) {
            System.out.println(sum);
        }
        else {
            getAllSubArray(index + 1, sum + nums[index]);
            getAllSubArray(index + 1, sum);
        }
    }
}