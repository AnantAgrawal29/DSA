package com.problems.easy;

public class Prob1672 {
    public static int maximumWealth(int[][] accounts) {
        int maxSum = Integer.MIN_VALUE;
        for(int[] acc: accounts)
        {
            int sum = 0;
            for(int ac: acc)
                sum += ac;
            if(sum>maxSum)
                maxSum=sum;
        }
        return maxSum;
    }
}
