package com.problems;
// complex problem definition
public class Prob1732Imp {
    public int largestAltitude(int[] gain) {
        int highest = 0;
        int[] alt = new int[gain.length + 1];
        for(int i=1; i<alt.length; i++)
        {
            alt[i] = alt[i-1]+gain[i-1];
            if(alt[i]>highest)
                highest = alt[i];
        }
        return highest;
    }
}
