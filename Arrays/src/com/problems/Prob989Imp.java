package com.problems;

import java.util.*;
// adding a number to a digits array
public class Prob989Imp {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> l = new ArrayList<>();
        int i = num.length;
        while(--i>=0 || k>0)
        {
            if(i>=0)
                k+=num[i];
            l.add(k%10);
            k/=10;

        }
        Collections.reverse(l);
        return l;
    }
}
