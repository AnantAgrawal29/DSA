package com.problems.easy;
// was not able to understand the question
public class Prob1304Imp {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int index = 0;

        if (n%2 == 1) {
            result[index++] = 0;
        }

        for (int i = 1; index < n; i++) {
            result[index++] = i;
            result[index++] = -i;
        }

        return result;
    }
}
