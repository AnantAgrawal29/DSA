package com.problems.easy;

import java.util.Arrays;

public class Prob566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] num = new int[r][c];
        int a=0,b=0;
        for(int i=0; i<r; i++)
        {
            if(c*r != n * m)
                return mat;
            for(int j=0; j<c; j++){
                if(b==mat[a].length)
                {
                    b=0;
                    a++;
                }
                num[i][j] = mat[a][b++];
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Prob566 ob = new Prob566();
        int[][] mat = {{1,2},{3,4}};
        int[][] ans = ob.matrixReshape(mat, 4, 1);
        System.out.println(Arrays.deepToString((ans)));
    }
}
