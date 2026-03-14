package com.search;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch2D {

    // Time Complexity :
    // Best Case - O(1)
    // Average Case - O(n)
    // Worst Case - O(n)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] ar = {
                {23,18,9},
                {68,45,6,7,3},
                {34,26,18,19}
        };
        int target = 34;
        System.out.println(Arrays.toString(search(ar, target)));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(findNumbers(new int[]{23,1,456,1234}));
        System.out.println(count(12343424));
    }

    // Returning array from function
    public static int[] search(int[][] arr, int target)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
                if(arr[i][j] == target)
                    return new int[]{i,j};
        }
        return new int[]{-1};
    }

    public static int count(int n)
    {
        n = n < 0 ? n * -1 : n;
        return (int)(Math.log10(n))+1;
    }

    // LeetCode Question 1295
    public static int findNumbers(int[] nums) {
        int countNum=0;
        for(int num:nums)
            if(Integer.toString(num).length()%2==0) // or count method above
                countNum++;
        return countNum;
    }
}