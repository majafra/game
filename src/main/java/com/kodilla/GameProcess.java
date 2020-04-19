package com.kodilla;

import java.util.Random;

public class GameProcess {

    Dice dice = new Dice();
    Random random = new Random();
    int[]dice1;
    int[]dice2;
    int[]dice3;
    int[]excluded1;
    int[]excluded2;


    public boolean containsAfterFirstThrow (excluded1,int n){
        boolean result= false;
        for (int number : excluded1){
            if(number == n) {
                result = true;
            }
        }
        return result;
    }
    public boolean containsAfterSecondThrow (excluded2,int n){
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
            System.out.println(dice[n]);
        }
        dice1 = dice;
        return dice1;
    }

    public int[] throwDicesSecondTime(excluded1) {
        //this.throwDices();

        for (int n = 0; n < 5; n++) {
            if (!containsAfterFirstThrow(excluded1, n)) {
                this.dice1[n] = random.nextInt(6) + 1;
            }
            dice2 = dice1;
        }
        return dice2;
    }

    public int[] throwDicesThirdTime (excluded2){
        //this.throwDicesSecondTime(excluded1);

        for (int n = 0; n < 5; n++) {
            if(!containsAfterSecondThrow(excluded2,n)){
                dice2[n]=random.nextInt(6) + 1;
            }
            dice3 = dice2;
            }
        return dice3;
        }
    }
}
