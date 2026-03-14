package com.search;

public class BInarySearch {

    public static void main(String[] args) {
        int[] ar = {4, 10, 19, 45, 76, 230};
        int target = 76;
        System.out.println(search(ar, target));
    }

    public static int search(int[] ar, int target) {
        if (ar.length == 0)
            return -1;
        int start = 0;
        int end = ar.length;
        int mid;
        while (start <= end) {
            // find the middle element
//            mid = (start + end)/2; // might be possible that (start+end) exceeds the range of integers
            mid = start + (end-start) / 2;
            if (target == ar[mid])
                return mid;
            else if (target > ar[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
