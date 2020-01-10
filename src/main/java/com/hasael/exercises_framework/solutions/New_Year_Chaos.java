package com.hasael.exercises_framework.solutions;

import com.hasael.exercises_framework.common.Solution;

/*
It's New Year's Day and everyone's in line for the Wonderland rollercoaster ride! There are a number of people queued up, and each person wears a sticker indicating their initial position in the queue. Initial positions increment by  from  at the front of the line to  at the back.

Any person in the queue can bribe the person directly in front of them to swap positions. If two people swap positions, they still wear the same sticker denoting their original places in line. One person can bribe at most two others. For example, if  and  bribes , the queue will look like this: .

Fascinated by this chaotic queue, you decide you must know the minimum number of bribes that took place to get the queue into its current state!
 */
public class New_Year_Chaos implements Solution {
    @Override
    public Object solution(Object input) {
        return minimumBribes((int[]) input);
    }

    static int minimumBribes(int[] arr) {
        //Check if any element is more than 2 indexes away from its original
        //If it is return -1
        //Run a bubble sort algorithm on the array and count the number of swaps
        int swapCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr[i] - 3) {
                return -1;
            }
        }
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            flag = false;
            for (int j = 0; j < arr.length -1; j++) {
                if(arr[j] > arr[j+1]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                    swapCount++;
                    flag = true;
                }
            }

            if(!flag)
                break;
        }

        return swapCount;
    }

}
