package com.problems.easy;

public class Prob1470 {
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int a=0;
        for(int i=0; i<n; i++)
        {
            ans[a++] = nums[i];
            ans[a++] = nums[i+n];
        }
        return ans;
    }
}
