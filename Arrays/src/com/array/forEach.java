package com.array;
import java.util.Scanner;
public class forEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];
        for (int i = 0; i <n.length ; i++) {
            System.out.print("Enter number: ");
            n[i] = sc.nextInt();
        }

        // for each loop
        for(int num:n){
            System.out.print(num+ " ");
        }
    }
}
