package com.kodilla;

import java.util.Random;

public class GameProcess {

    Dice dice = new Dice();
    Random random = new Random();
    int[]dice1;
    int[]dice2;
    int[]dice3;
    int[]excluded2;


    public boolean containsAfterFirstThrow (int n,int...excluded1){
        boolean result= false;
        for (int number : excluded1){
            if(number == n) {
                result = true;
            }
        }
        return result;
    }
    public boolean containsAfterSecondThrow (int n,int...excluded2){
        boolean result= false;
        for (int number : excluded2){
            if(number == n) {
                result = true;
            }
        }
        return result;
    }

    public int[] throwDices() {
        //dice.dice();
        int dice[] = new int[5];

        for (int n = 0; n < 5; n++) {
            dice[n]=random.nextInt(6) + 1;
        }
        dice1 = dice;
        for (int w=0;w<5;w++) {
            System.out.println(dice1[w]);
        }
        return dice1;
    }

    public int[] throwDicesSecondTime(int...excluded1) {

        for (int n = 0; n < 5; n++) {
            if (!containsAfterFirstThrow(n, excluded1)) {
                dice1[n] = random.nextInt(6) + 1;
            }
        }
            dice2 = dice1;
            for (int s=0;s<5;s++) {
                System.out.println(dice2[s]);
            }
        return dice2;
    }

    public int[] throwDicesThirdTime (int...excluded2){

        for (int n = 0; n < 5; n++) {
            if (!containsAfterSecondThrow(n, excluded2)) {
                dice2[n] = random.nextInt(6) + 1;
            }
        }
            dice3 = dice2;
            for (int s=0;s<5;s++) {
                System.out.println(dice3[s]);
            }
        return dice3;
    }
}

