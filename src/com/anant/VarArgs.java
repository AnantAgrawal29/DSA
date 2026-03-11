package com.anant;

import java.sql.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun("hi","how");// Variable length arguments
    }
    static void fun(String ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}
