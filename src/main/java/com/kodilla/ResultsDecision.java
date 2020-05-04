package com.kodilla;

import java.util.Arrays;

//klasa z metodami pokera nie dla figur a dla liczb
public class ResultsDecision {

    public int ones(int[] resultOfThrows) {

        int result = 0;

        int[] counts = Counts.counting(resultOfThrows);

        if (counts[0] > 0)
            result = counts[0]*1;
            return result;
    }

    public int twos(int[] resultOfThrows) {

        int result = 0;

        int[] counts = Counts.counting(resultOfThrows);

        if (counts[1] > 0)
            result = counts[1]*2;
        return result;
    }

    public int threes(int[] resultOfThrows) {

        int result = 0;

        int[] counts = Counts.counting(resultOfThrows);

        if (counts[2] > 0)
            result = counts[2]*3;
        return result;
    }
    public int fours(int[] resultOfThrows) {

        int result = 0;

        int[] counts = Counts.counting(resultOfThrows);

        if (counts[3] > 0)
            result = counts[3]*4;
        return result;
    }
    public int fives(int[] resultOfThrows) {

        int result = 0;

        int[] counts = Counts.counting(resultOfThrows);

        if (counts[4] > 0)
            result = counts[4]*5;
        return result;
    }
    public int sixes(int[] resultOfThrows) {

        int result = 0;

        int[] counts = Counts.counting(resultOfThrows);

        if (counts[5] > 0)
            result = counts[5]*6;
        return result;
    }
//    public int resultNumbers(int methodNumbers){
//        if (methodNumbers==this.ones(int[] resultOfThrows))
//
//
//    }
}

