package com.problems;

import java.util.*;

public class Prob1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>(candies.length);
        int max=Integer.MIN_VALUE;
        for (int candy : candies) {
            if (max < candy)
                max = candy;
        }
        for (int candy : candies) {
            if (candy + extraCandies >= max)
                ans.add(true);
            else
                ans.add(false);
        }
        return ans;
    }
}
