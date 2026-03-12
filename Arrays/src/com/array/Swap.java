package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = {1,25,3,14};
        System.out.println(Arrays.toString(ar));
        swap(ar,1,3);
        System.out.println(Arrays.toString(ar));
        int m = max(ar,0,ar.length);
        System.out.println(m==-1?"Wrong Arguments":m);
        reverse(ar);
    }
    public static void swap(int[] ar, int i, int j)
    {
        int t = ar[i];
        ar[i] = ar[j];
        ar[j] = t;
    }

    public static void reverse(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int max(int[] ar,int start, int end)
    {
        if(start > end || start < 0 || ar==null)
            return -1;
        else if(start == end)
            return ar[start];
        else
        {
            int max = ar[start];
            for (int i = start + 1; i < end; i++)
            {
                if (ar[i] > max)
                    max = ar[i];
            }
            return max;
        }
    }
}
