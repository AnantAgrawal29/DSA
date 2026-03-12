package com.array;
import java.util.Arrays;
import java.util.Scanner;
public class multidimarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] ar = new int[3][];
        // nothing wrong when column size is not mentioned because all rows and not columns are stored in heap memory

        int[][] arr = new int[3][3];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("\nEnter number for row "+ (i+1) + ":");
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nMultidimensional Array");
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
