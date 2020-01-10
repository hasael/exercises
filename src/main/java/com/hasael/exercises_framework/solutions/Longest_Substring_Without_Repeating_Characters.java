package com.hasael.exercises_framework.solutions;

import com.hasael.exercises_framework.common.Solution;

/*
Given a string, find the length of the longest substring without repeating characters. Here is an example solution in Python language.

    class Solution:
      def lengthOfLongestSubstring(self, s):
        # Fill this in.

    print Solution().lengthOfLongestSubstring('abrkaabcdefghijjxxx')
    # 10

Can you find a solution in linear time?
 */
public class Longest_Substring_Without_Repeating_Characters implements Solution {
    @Override
    public Object solution(Object input) {
        return innerSolution((String) input);
    }

    private int innerSolution(String text) {
        //Have a max count
        //Have a current count
        //Iterate through the text
        //Increase current count at each iteration
        //If current char is repeated and current count > max count, update max
        int maxCount = 0;
        int currentCount = 0;

        for (int i = 0; i < text.length() - 1; i++) {
            char c = text.charAt(i);
            char next = text.charAt(i + 1);
            currentCount++;
            if (c == next) {
                if (maxCount < currentCount) {
                    maxCount = currentCount;
                }
                currentCount = 0;
            }
        }

        return maxCount;
    }
}
