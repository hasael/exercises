package com.hasael.exercises_framework.solutions;

import com.hasael.exercises_framework.common.Solution;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Longest_Palindromic_Substring implements Solution {
    @Override
    public Object solution(Object input) {
        return innerSolution((String) input);
    }

    private String innerSolution(String text) {
        text = text.toLowerCase();
        //iterate through all combination of the list
        // have two cursors one from left one from right
        //the left cursor will move left after the right cursor has reached it
        //A substring between two cursors will be checked if is palindrome
        //save all palindrome strings to array
        //return the longest
        List<String> palindromes = new ArrayList<>();
        for (int i = 0; i < text.length() - 1; i++) {
            for (int j = text.length(); j > i; j--) {
                String subStr = text.substring(i, j);
                if (isPalindrome(subStr))
                    palindromes.add(subStr);
            }
        }
        if (palindromes.size() > 0) {
            return palindromes.stream().max(Comparator.comparingInt(String::length)).orElse("");
        }
        return "";
    }

    private boolean isPalindrome(String text) {
        StringBuilder reverse = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse.append(text.charAt(i));
        }
        return text.equals(reverse.toString());
    }
}
