package com.problems;

public class Prob1365Imp {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] output = new int[nums.length];
        // since the numbers are between 0 and 100 (constraint given)
        int[] count = new int[101];

//        What this loop does - creates a frequency array
//        It counts how many times each number appears in the array.
//        Because the problem states that numbers are between 0 and 100, the code creates:
//        nums = [8,1,2,2,3]
//        After this loop:
//        count[1] = 1
//        count[2] = 2
//        count[3] = 1
//        count[8] = 1

        for (int num : nums)
            count[num]++;

//        This loop converts the frequency array into a prefix sum array.
//                What prefix sum means here
//        After this loop:
//        count[i] = number of elements ≤ i
//        So instead of storing how many times a number appears, it stores how many numbers are less than or equal to that value.

//        Example
//        Before prefix sum:
//        count[1] = 1
//        count[2] = 2
//        count[3] = 1
//        count[8] = 1

//        After prefix sum:
//        count[1] = 0
//        count[2] = 1
//        count[3] = 2
//        count[4] = 0
//        count[5] = 0
//        count[8] = 3

        for (int i = 1; i <= 100; i++)
            count[i] += count[i - 1];

//        This loop calculates the final result.
//        The problem asks:
//        How many numbers are strictly smaller than the current number
//        If the current number is x, we want:
//        how many numbers < x
//        But from the prefix array we know:
//        count[x] = numbers ≤ x
//        So:  numbers < x = count[x-1]

        for (int i = 0; i < nums.length; i++)
            output[i] = nums[i] == 0 ? 0 : count[nums[i] - 1];
        return output;
    }
}
