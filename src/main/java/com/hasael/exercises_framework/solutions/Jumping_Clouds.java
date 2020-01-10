package com.hasael.exercises_framework.solutions;

import com.hasael.exercises_framework.common.Solution;

/*
Emma is playing a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others are cumulus. She can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus  or . She must avoid the thunderheads. Determine the minimum number of jumps it will take Emma to jump from her starting postion to the last cloud. It is always possible to win the game.

For each game, Emma will get an array of clouds numbered  if they are safe or  if they must be avoided. For example,  indexed from . The number on each cloud is its index in the list so she must avoid the clouds at indexes  and . She could follow the following two paths:  or . The first path takes  jumps while the second takes .

Function Description

Complete the jumpingOnClouds function in the editor below. It should return the minimum number of jumps required, as an integer.

jumpingOnClouds has the following parameter(s):

c: an array of binary integers
Input Format

The first line contains an integer , the total number of clouds. The second line contains  space-separated binary integers describing clouds  where .

Constraints

Output Format

Print the minimum number of jumps needed to win the game.
 */
public class Jumping_Clouds implements Solution {
    @Override
    public Object solution(Object input) {
        return jumpingOnClouds((int[]) input);
    }

    private int jumpingOnClouds(int[] c) {
        //iterate through the clouds
        // the iteration index will be our steps
        // at each step will check if at +2 there is a 1
        // else will run a +1 step
        // increase a count on each cycle
        // if it is impossible to win will return 0
        // return count

        int steps = 0;
        int count = 0;
        while (steps < c.length - 1) {
            int nextJump = steps + 2;
            if (nextJump > c.length - 1) {
                nextJump = steps + 1;
            }

            if (c[nextJump] == 1)
                nextJump = steps + 1;

            if (c[nextJump] == 1) {
                return 0;
            } else {
                steps = nextJump;
                count++;
            }

        }
        return count;
    }
}
