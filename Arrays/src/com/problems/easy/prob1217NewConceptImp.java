package com.problems.easy;
/*
Code
1217. Minimum Cost to Move Chips to The Same Position Easy
We have n chips, where the position of the ith chip is position[i].
We need to move all the chips to the same position. In one step, we can change the position of the ith chip from position[i] to:
position[i] + 2 or position[i] - 2 with cost = 0.
position[i] + 1 or position[i] - 1 with cost = 1.
Return the minimum cost needed to move all the chips to the same position.
 */

// https://www.youtube.com/watch?v=WmX3k-wbzMQ // watch this video
// in summary counting even and odd combines all the elements chips to come in 2 positions like 0,1
// where then we choose minimum as it will take 1 cost for 1 move

public class prob1217NewConceptImp {
    public int minCostToMoveChips(int[] position) {
        int even=0,odd=0;
        for(int i:position)
        {
            if(i%2==0)
                even++;
            else
                odd++;
        }
        // Same parity
        if(even==position.length || odd==position.length)
            return 0;
        else
            return Math.min(even,odd);
    }
}
