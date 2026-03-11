package com.anant;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range of Fibonacci: ");
        int n = sc.nextInt();
        int a=0,b=1,c;
        System.out.print(a+" "+b);
        for(int i=3; i<=n; i++)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
