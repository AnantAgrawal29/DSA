package com.anant;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Grape","Orange","Watermelon" -> System.out.println("A juicy fruit");
            default -> System.out.println("No such fruit");
        }
    }
}
