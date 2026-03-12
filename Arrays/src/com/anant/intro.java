package com.anant;
import java.util.*;
public class intro {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
//        int n;
//        System.out.print("Enter size: ");
//        n = sc.nextInt();

        // Dynamic Memory Allocation (DMA)
        // Stack Memory - function call and reference variables go in this - (compile time)
        // Heap Memory - Actual object or value of reference variable is stored in this - (runtime)
        // Array in C++ -> continuous memory allocation
        // Array in Java -> may not be continuous -> depends on jvm
        // array object are in heap
        // heap objects are not continuous
        // dma during runtime

//        int[] rollNo; // declaration of array, rollNo is getting defined in stack
//        rollNo= new int[n]; // actually here object is being created in the memory (heap)
        // new is used to create an object

        int[] rollNo2 = {10,20,30}; // making array with predefined value
        System.out.println(rollNo2.length); // array length
//        System.out.println(rollNo2[rollNo2.length]); // array index out of bounds exception

//        for(int x=0; x<rollNo.length; x++) {
//            System.out.print("Enter number " + (x + 1) + ": ");
//            int i = sc.nextInt();
//            rollNo[x] = i;
//        }

//        System.out.println(Arrays.toString(rollNo));
        System.out.println(Arrays.toString(rollNo2));

        // String Array
        String[] names = new String[5];
        names[0] = "hi" ;
        System.out.println(names[1]); // null
        String name = null;

        /* null as a default,Java handles the initialization of array elements when no values are explicitly provided.

        Default Values for Primitives: For an integer array, Java automatically fills the array with zeros by default.

        Default Values for Objects: For an array of objects (like a String array), the default value for every element is null.

        Understanding null: null is not an object or a data type itself. Instead, it is a special literal that represents a
        reference variable not pointing to any object in the heap memory.

        Reference Variables in Arrays: When you create an array of objects, you are essentially creating an array of
        reference variables. Until you assign an actual object to an index, that reference variable points to null by default.

        Restriction on Primitives: It is important to note that you cannot assign null to primitive types like int or char;
        it can only be assigned to reference types.
       */

    }
}
