package com.problems.medium;
// Kadane's Algorithm
// https://www.youtube.com/watch?v=AHZpyENo7k4
/*
    Kadane's Algorithm is an efficient, linear-time approach (Big O of N) used to solve the Maximum Subarray Sum problem. A subarray is a contiguous part of an array. The goal is to find the contiguous subarray that yields the highest possible sum.

    How it Works (Intuition)

    The algorithm iterates through the array while maintaining a running sum.
    The key logic is:
        * Add the current element to your running sum
        * Update the maximum found so far if the current sum is greater
        * Reset if negative: If the sum drops below zero, discard it and reset to zero,
         as carrying a negative sum will only reduce the potential of future subarrays.

    Complexity
        Time Complexity: Big O of N (the array is traversed in a single pass).
        Space Complexity: Big O of 1 (constant extra space is used).

    Finding the Subarray (Follow-up)
        If you need to print the actual subarray rather than just the sum,
        you can track the start and end indices
*/
public class MaxSubArray53 {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if (sum > max)
                max = sum;
            if (sum < 0)
                sum = 0;
        }
        return max;
    }
}
