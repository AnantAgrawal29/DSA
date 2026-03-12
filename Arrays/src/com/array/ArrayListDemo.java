package com.array;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(3);
//        list.add(10);
//        list.add(20);
//        list.add(30); // can add more items than initial capacity ⬆️
//        list.add(40);
//        list.add(50);
//        list.add(60);

        //The ArrayList class has a regular array inside it. When an element is added, it is placed into the array.
        //If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.

//        System.out.println(list);
//        list.set(0,99); // updation of value on 0th index
//        System.out.println(list);
//        list.remove(2); // remove element at index 2
//        System.out.println(list);

        for (int i = 0; i <5 ; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);
        System.out.println(list.size()); // size of Array List
        Collections.sort(list); // sorting function of list
        System.out.println(list);

//        System.out.println(list[2]); can't access the elements like this
        System.out.println(list.get(2)); // for getting an element

        list.clear(); // clears the list
        System.out.println(list);
    }
}
