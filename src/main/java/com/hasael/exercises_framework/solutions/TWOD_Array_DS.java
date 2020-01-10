package com.hasael.exercises_framework.solutions;

import com.hasael.exercises_framework.common.Solution;

public class TWOD_Array_DS implements Solution {
    @Override
    public Object solution(Object input) {
        return hourglassSum((int[][]) input);
    }

     static int hourglassSum(int[][] arr) {
        //get all hourglasses centers
        //to get the centers we get the bounds that confine all possible centers
        //for each center calculate the sum
        // get max sum
        int[] bounds = getCenterBounds(arr);
        int sum = Integer.MIN_VALUE;
        for (int i = 1; i < bounds[1]; i++) {
            for (int j = 1; j < bounds[0]; j++) {
                int currentSum = hourGlassSum(new int[]{j, i}, arr);
                if (currentSum > sum)
                    sum = currentSum;
            }
        }

        return sum;
    }

    private static int[] getCenterBounds(int[][] arr) {
        return new int[]{arr[0].length - 1, arr.length - 1};
    }

    private static int hourGlassSum(int[] point, int[][] arr) {
        return arr[point[1]][point[0]]
                + arr[point[1] - 1][point[0] - 1] + arr[point[1] - 1][point[0]] + arr[point[1] - 1][point[0] + 1] +
                +arr[point[1] + 1][point[0] - 1] + arr[point[1] + 1][point[0]] + arr[point[1] + 1][point[0] + 1];
    }
}
