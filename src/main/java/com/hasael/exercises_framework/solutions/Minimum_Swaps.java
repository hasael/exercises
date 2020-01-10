package com.hasael.exercises_framework.solutions;

import com.hasael.exercises_framework.common.Solution;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Swaps implements Solution {
    @Override
    public Object solution(Object input) {
        return minimumSwaps((int[]) input);
    }

    private static int minimumSwaps(int[] arr) {

        // create a 2d array
        // populate the second dim array with the desired position
        // cycle until all positions are arranged and count

        int swapCount = 0;
        int[][] newArr = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i][0] = arr[i];
            newArr[i][1] = arr[i] - 1;
        }
        boolean allSorted = true;
        do {
            allSorted = true;
            for (int i = 0; i < newArr.length; i++) {
                if (newArr[i][1] != i) {
                    allSorted = false;
                    break;
                }
            }

            if (!allSorted) {
                for (int i = 0; i < newArr.length; i++) {
                    if (newArr[i][1] != i) {
                        swap(i, newArr[i][1], newArr);
                        swapCount++;
                    }
                }
            }
        } while (!allSorted);

        return swapCount;
    }

    private static void swap(int first, int second, int[][] arr) {
        int[] swap;
        swap = arr[first];
        arr[first] = arr[second];
        arr[second] = swap;
    }

}
