package com.problems;

public class Prob1929 {
    public static int[] getConcatenation(int[] nums)
    {
        int n = nums.length;
        int[] ans = new int[(n*2)];
        for(int i=0; i<ans.length; i++)
        {
            if(i<n)
                ans[i] = nums[i];
            else
                ans[i] = nums[i%n];

        }
        return ans;
    }
}
