package com.problems;
// prefix sum and array from year wise according to given constraints
public class Prob1854Imp {
    public static int maximumPopulation(int[][] logs) {
        int[] years = new int[101]; // because constraint tells us of 100 people
        if(logs.length == 1)
            return logs[0][0];

        for (int[] log : logs) {
            years[log[0] - 1950]++; // birth year ++ , start position where prefix sum will show value
            years[log[1] - 1950]--; // death year -- , start position where prefix sum will end value
        }

        int max = years[0];
        int maxYear = 1950;

        for (int j = 1; j < 101.; j++) {
            years[j] += years[j - 1];
            if (years[j] > max) {
                max = years[j];
                maxYear = j + 1950;
            }
        }

        return maxYear;
    }

    public static void main(String[] args) {
        System.out.println(maximumPopulation(new int[][]{{1993,1999},{2000,2010}}));
    }
}
