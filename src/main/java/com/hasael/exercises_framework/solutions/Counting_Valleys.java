package com.hasael.exercises_framework.solutions;

import com.hasael.exercises_framework.common.Solution;

public class Counting_Valleys implements Solution {
    @Override
    public Object solution(Object input) {
        return countingValleys((String) input);
    }

    private int countingValleys(String s) {
        //consider D as -1 and U as +1
        //keep a sum of each step to account for current altitude
        //increase a counter each time the altitude goes from negative to zero
        int sum = 0;
        int valleyCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int step = 0;
            if (c == 'D')
                step = -1;
            else if (c == 'U')
                step = 1;
            if (sum < 0 && sum + step >= 0) {
                valleyCount++;
            }
            sum += step;
        }
        return valleyCount;
    }
}
