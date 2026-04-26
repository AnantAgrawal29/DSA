package com.problems.easy;

import java.util.ArrayList;
// Prefix sum for multiplication concept
public class Prob1352Imp {
    ArrayList<Integer> ar;
    int n;
    public Prob1352Imp() {
        ar = new ArrayList<>();
        n=0;
    }

    public void add(int num) {
        if(num==0)
        {
            ar.clear();
            n=0;
        }
        else
        {
            if(ar.isEmpty())
                ar.add(num);
            else
                ar.add(ar.get(n-1)*num);
            n++;
        }
    }

    public int getProduct(int k) {
        if(k>n)
            return 0;
        else if(k==n)
            return ar.get(n-1);
        else
            return ar.get(n-1) / ar.get(n-k-1);
    }
}
