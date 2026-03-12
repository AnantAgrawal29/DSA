package com.anant;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArLi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <ArrayList<Integer>> list = new ArrayList<>(3);

        // initialization - very important
        for (int i = 0; i <5 ; i++) {
            list.add(new ArrayList<>(3));
        }
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);
    }
}
