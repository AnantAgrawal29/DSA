package com.problems.easy;

public class Prob1389 {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for(int i=0;i<nums.length;i++)
            target[i]=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(target[index[i]]!=-1)
                shift(target,index[i]);
            target[index[i]] = nums[i];
        }
        return target;
    }

    public static void shift(int[] ar, int index)
    {
        for(int i=ar.length-2; i>=index; i--)
            ar[i+1] = ar[i];
    }
}
