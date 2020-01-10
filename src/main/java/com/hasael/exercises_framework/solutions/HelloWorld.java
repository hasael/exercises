package com.hasael.exercises_framework.solutions;

import com.hasael.exercises_framework.common.Solution;

public class HelloWorld implements Solution {

    public Object solution(Object input){
        return innerSolution();
    }

    private String innerSolution(){
        return "hello world";
    }
}
