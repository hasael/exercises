package com.hasael.exercises_framework.solutions;

import com.hasael.exercises_framework.common.Solution;
import java.util.*;
import java.util.stream.*;

public class Game_of_Bits implements Solution {

    @Override
    public Object solution(Object input) {
        return gameOfBits((int)input);
    }

    private char gameOfBits(int n){
        // Convert number to digits
        // Implement movement logic return new digits after every move
        // check if move is equal to original
        // if move counter is even is X otherwise Y

        int[] original = decimalToDigits(n).clone();
        int m = 1;
        int[] newState = movement(original, m, original);

        while(!arrEquals(newState,original) && m < original.length){
            newState = movement(newState, ++m, original);
        }    
        if((m - 1) % 2 == 0)
            return 'X';
        else
            return 'Y';
    }

    private boolean arrEquals(int[] a, int[] b){
        if(a.length != b.length)
        return false;
        for(int i =0 ; i<a.length; i++){
            if(a[i] != b[i])
            return false;
        }
        return true;
    }

    private int[] movement(int[] state, int m, int[] original){
        int[] newState = state.clone();
        togleBit(newState, m - 1);
        if(m > 1 && original[m - 1] == newState[m - 2]){
            togleBit(newState, m -2);
        }
        if(m < newState.length && original[m - 1] == newState[m])
        {
            togleBit(newState, m);
        }
        return newState;
    }

    private void togleBit(int[] arr, int i){
        if(arr[i] == 0)
            arr[i] = 1;
        else
            arr[i]= 0;
    }

    private int[] decimalToDigits(int n){
        String strResult = "";
        while(n >0){
            int bit = n % 2;
            int quotient = n / 2;
            strResult = bit + strResult;
            n = quotient;
        }
        int[] result = new int[strResult.length()];
        
        for(int i =0; i< strResult.length(); i++){
            result[i] = Integer.parseInt(String.valueOf(strResult.charAt(i)));
        }
     return result;

    }

}