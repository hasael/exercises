package com.hasael.exercises_framework.solutions;

import com.hasael.exercises_framework.common.Solution;

import java.util.List;

public class Repeated_String implements Solution {
    @Override
    public Object solution(Object input) {
        List<Object> inputs = (List<Object>) input;
        return repeatedString((String) inputs.get(0), (long) inputs.get(1));
    }
    long repeatedString(String s, long n) {
        long charsInString = findChar(s,'a');
        long multi = n / s.length();
        long mod = n % s.length();

        long charsInRemainder = findChar(s.substring(0,(int)mod),'a');
        return charsInString * multi + charsInRemainder;
    }

    private long findChar(String s, char c){
        long count =0;
        for(int i=0; i<s.length();i++){
            if(c == s.charAt(i)){
                count ++;
            }
        }
        return count;
    }

}
