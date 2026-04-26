package com.problems.easy;

public class Prob1480 {
    public static int[] runningSum(int[] nums)
    {
        int acc = 0;
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            acc += nums[i];
            ans[i] = acc;
        }
        return ans;
    }
}
