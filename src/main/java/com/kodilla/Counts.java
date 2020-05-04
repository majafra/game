package com.kodilla;

//klasa okreslajaca liczby na wyzuconych kostkach
public class Counts {

    public static int[] counting(int[] resultOfThrows) {

        int[] count = new int[6];

        for (int i = 0; i < resultOfThrows.length; i++) {
            if (resultOfThrows[i] == 1) {
                count[0]++;
            } else if (resultOfThrows[i] == 2) {
                count[1]++;
            } else if (resultOfThrows[i] == 3) {
                count[2]++;
            } else if (resultOfThrows[i] == 4) {
                count[3]++;
            } else if (resultOfThrows[i] == 5) {
                count[4]++;
            } else if (resultOfThrows[i] == 6) {
                count[5]++;
            }
        }
        return count;
    }
}
