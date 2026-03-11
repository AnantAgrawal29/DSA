package com.anant;
import java.util.Scanner;

public class FunctionDemo {
    /** Calculates sum of two numbers */ // Docstring
    public static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = sc.nextInt();
        System.out.println("Sum = "+(n1+n2));
    }

    public static void sum(int n1, int n2){
        int sum = n1+n2;
        System.out.println("Sum = "+sum);
        {
            // Block Scope
        }
        // Method scope
        for(int x=0; x<1; x++){
            x++;
            // Loop Scope
        }
    }

    public static void main(String[] args) {
        sum();
        sum(10,20); // sum function overloading
    }
}
