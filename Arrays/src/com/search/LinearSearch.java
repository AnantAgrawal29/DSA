package com.search;

import java.util.Scanner;

public class LinearSearch {

    // Time Complexity :
    // Best Case - O(1)
    // Average Case - O(n)
    // Worst Case - O(n)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Integer array search
        int[] ar = {10, 230, 4, 19, 76, 45};
        int target = 230;
        int index = search(ar, target);
        System.out.println(index == -1 ? "Not Found" : "Found at index " + index);

        // String search in string array
        String[] arr = {"hi", "hello","some", "off"};
        String t = "hi";
        if(search(arr, t)!=-1)
            System.out.println("hi is present");
        else
            System.out.println("hi is not present");

        // Character search in string
        System.out.println("Enter String:");
        String str = sc.next();
        System.out.println();
        System.out.println("Enter character to be found:");
        char tar = sc.next().trim().charAt(0);

        if(search(str, tar) || str.indexOf(tar)!=-1)
            System.out.println("Found u");
        else
            System.out.println("Not found");

    }

    public static int search(int[] ar, int target)
    {
        if(ar.length == 0)
            return -1;
        for (int i=0; i<ar.length; i++) {
            if(target == ar[i])
                return i;
        }
        return -1;
    }

    public static int search(String[] ar, String target)
    {
        if(ar.length == 0)
            return -1;
        for (int i=0; i<ar.length; i++) {
            if(target.equals(ar[i]))
                return i;
        }
        return -1;
    }

    public static boolean search(String str, char target)
    {
        if(str.isEmpty()) // can also use str.length() == 0
            return false;
        for (int i=0; i<str.length(); i++) {
            if(target == str.charAt(i))
                return true;
        }
        for (char ch: str.toCharArray()) {
            if(target == ch)
                return true;
        }
        return false;
    }

}
