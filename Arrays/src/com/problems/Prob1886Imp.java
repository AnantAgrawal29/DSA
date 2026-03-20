package com.problems;

import java.util.Arrays;
// Array Rotation by 90 degree
public class Prob1886Imp {
    public boolean findRotation(int[][] mat, int[][] target) {
        int[][] n = new int[mat.length][mat.length];
        for(int i=1; i<=4; i++)
        {
            if(Arrays.deepEquals(mat,target))
                return true;
            mat = rotate(mat);
        }
        return false;
    }
    public int[][] rotate(int[][] ar)
    {
        int[][] n = new int[ar.length][ar.length];
        for(int i=0; i<n.length; i++)
            for(int j=0; j<n.length; j++)
                n[j][i] = ar[ar.length-1-i][j];
        return n;
    }
}
