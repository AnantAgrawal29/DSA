package com.anant;
import java.util.Scanner;

public class Chars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
//        System.out.println(ch);
        if(ch >='a' && ch<='z'){
            System.out.println("LowerCase");
        }
        else if(ch >='A' && ch<='Z'){
            System.out.println("UpperCase");
        }
    }
}
