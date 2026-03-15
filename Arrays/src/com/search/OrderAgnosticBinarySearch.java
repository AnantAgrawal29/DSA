package com.search;

public class OrderAgnosticBinarySearch {
    // OrderAgnostic - it means that we don't in which order(ascending or descending) array is sorted
    public static void main(String[] args) {
        int[] ar = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int target = 60;
        System.out.println(binarySearch(ar, target));
    }

    public static int binarySearch(int[] ar, int target) {
        int start = 0;
        int end = ar.length-1;
        int mid;

        if (ar.length == 0)
            return -1;

        // checking in which order is array sorted
        boolean isAsc = ar[start] < ar[end];

        while(start<=end)
        {
            mid = start + (end-start) / 2;
            if (target == ar[mid])
                return mid;
            if(isAsc)
            {
                if (target < ar[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else {
                if (target > ar[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
}


