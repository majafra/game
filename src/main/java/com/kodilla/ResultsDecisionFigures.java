package com.kodilla;

import java.util.Arrays;

//klasa z metodami pokera dla figur
public class ResultsDecisionFigures {

    public int threeOfAKind(int[] resultOfThrows) {

        int result = 0;

        int[] counts = Counts.counting(resultOfThrows);

        for(int i=0;i<6;i++)
            if (counts[i] > 2)
                result = resultOfThrows[0]+resultOfThrows[1]+resultOfThrows[2]+resultOfThrows[3]+resultOfThrows[4];
        return result;
    }

    public int fourOfAKind(int[] resultOfThrows) {

        int result = 0;

        int[] counts = Counts.counting(resultOfThrows);

        for(int i=0;i<6;i++)
            if (counts[i] > 3)
                result = resultOfThrows[0]+resultOfThrows[1]+resultOfThrows[2]+resultOfThrows[3]+resultOfThrows[4]+resultOfThrows[5];
        return result;
    }

    public int fullHouse(int[] resultOfThrows) {

        int result = 0;

        int[] counts = Counts.counting(resultOfThrows);
        boolean three = false;
        boolean two = false;

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == 2)
                two = true;
            if (counts[i] ==3)
                three = true;
        }
        if (two && three)
            result = 25;
        return result;
    }
    public int smallStraight(int[] resultOfThrows) {

        int result = 0;

        int[] counts = Counts.counting(resultOfThrows);
        boolean one = false;
        boolean two = false;
        boolean three = false;
        boolean four = false;

        for (int i = 0; i < counts.length; i++) {
            if(i+3 < counts.length) {

                if (counts[i] > 0)
                    one = true;
                else
                    one = false;
                if (counts[i + 1] > 0)
                    two = true;
                else
                    two=false;
                if (counts[i + 2] > 0)
                    three = true;
                else
                    three=false;
                if (counts[i + 3] > 0)
                    four = true;
                else
                    four=false;}
        if (one && two && three && four)
            result = 30;
        }
        return result;
    }
    public int bigStraight(int[] resultOfThrows) {

        int result = 0;

        int[] counts = Counts.counting(resultOfThrows);
        boolean one = false;
        boolean two = false;
        boolean three = false;
        boolean four = false;
        boolean five = false;

        for (int i = 0; i < counts.length; i++) {
            if(i+4 < counts.length) {

                if (counts[i] > 0)
                    one = true;
                else
                    one = false;
                if (counts[i + 1] > 0)
                    two = true;
                else
                    two=false;
                if (counts[i + 2] > 0)
                    three = true;
                else
                    three=false;
                if (counts[i + 3] > 0)
                    four = true;
                else
                    four=false;
                if (counts[i + 4] > 0)
                    five = true;
                else
                    five=false;}

            if (one && two && three && four && five)
                result = 40;
        }
        return result;
    }

    public int flush(int[] resultOfThrows) {

        int result = 0;

        int[] counts = Counts.counting(resultOfThrows);

        for(int i=0;i<6;i++)
            if (counts[i] > 4)
                result = 50;
        return result;
    }
}
