package com.anant;

public class TypeConversion {
    public static void main(String[] args) {
        // type casting
        int a = (int)(65.67f);
        System.out.println(a);

        // automatic type promotion in the expression
        a = 257; // max you can put in byte is 256 or 0 as it does num % 256 in the result
        byte b = (byte)(a); // 1 as 257 % 256 = 1
        System.out.println(b);

        byte p = 40;
        byte q = 50;
        byte r = 100;
        // p*q = 2000 which exceeds byte size so it does automatic type promotion to int and then store it
        int s = (p*q)/r;
        System.out.println(s);

        // char code to int
        int ch = 'A';
        System.out.println(ch);

        /*Unicode is a universal character encoding standard that assigns a unique numeric value (code point)
        to virtually every character, symbol, and script used in modern and historical languages worldwide*/
        System.out.println("नमस्ते"); // Java supports unicode values
    }
}
