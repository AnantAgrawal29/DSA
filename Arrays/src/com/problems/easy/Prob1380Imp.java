package com.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class Prob1380Imp {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[] minRow = new int[row];
        int[] maxCol = new int[col];

        for (int i = 0; i < row; i++) {
            int tempMin = Integer.MAX_VALUE;
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] < tempMin)
                    tempMin = matrix[i][j];
            }
            minRow[i] = tempMin;
        }

        for (int i = 0; i < col; i++) {
            int tempMax = 0;
            for (int[] ints : matrix) {
                if (ints[i] > tempMax)
                    tempMax = ints[i];
            }
            maxCol[i] = tempMax;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            int val = minRow[i];
            for (int k = 0; k < col; k++) {
                if (val == maxCol[k]) {
                    list.add(val);
                    break;
                }
            }
        }
        return list;
    }
}
