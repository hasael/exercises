package com.hasael.exercises_framework.solutions;

import com.hasael.exercises_framework.common.Solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
You are given two linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contains a single digit. Add the two numbers and return them as a linked list. Example:

    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output: 7 -> 0 -> 8
    Explanation: 342 + 465 = 807.
 */
public class Add_Two_Numbers_As_LinkedList implements Solution {
    @Override
    public Object solution(Object input) {
        List<Object> inputs = (List<Object>) input;
        return innerSolution((LinkedList<Integer>) inputs.get(0), (LinkedList<Integer>) inputs.get(1));
    }

    private LinkedList<Integer> innerSolution(LinkedList<Integer> first, LinkedList<Integer> second) {
        //Obtain first and second number
        int firstNum = numberFromList(first);
        int secondNum = numberFromList(second);
        int result = firstNum + secondNum;
        //Insert sum to linked list
        return listFromNumber(result);
    }

    private LinkedList<Integer> listFromNumber(int number) {
        int current = number;
        LinkedList<Integer> result = new LinkedList<>();
        //divide by powers of 10 to obtain digits

        while (current > 0) {
            int digit = (current % 10);
            result.add(digit);
            current = current / 10;
        }
        return result;
    }

    //Return number from list. Zero if no items in list
    private int numberFromList(LinkedList<Integer> list) {
        //Obtain digits to array
        int number = 0;
        int found = 0;
        while (list.peek() != null) {
            number += list.peek() * Math.pow(10, found);
            found++;
            list.pop();
        }
        return number;
    }
}
