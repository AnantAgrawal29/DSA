package com.anant;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.println("Hi, " + name);

//        float p = 34.432f; // default for decimal is double so to store it in float we use 'f' at end
//        double d = 34.2;
//        long large = 342434243243424L;
    }
}