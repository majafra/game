package com.kodilla;

import java.util.Arrays;
import java.util.Random;

//klasa z metodami 'rzucajacymi kostki'
public class GameProcess {

    private GameState gameState = GameState.IDLE;

    Dice dice = new Dice();
    Random random = new Random();
    private int[]dice1;
    private int[]dice2;
    private int[]dice3;
 //   int[]excluded2;

    public int[] getDice1() {
        return dice1;
    }

    public int[] getDice2() {
        return dice2;
    }

    public int[] getDice3() {
        return dice3;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public boolean containsAfterFirstThrow (int n, int...excluded1){
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
        return dice1;
    }

    public int[] throwDicesSecondTime(int...excluded1) {

        for (int n = 1; n < 6; n++) {
            if (containsAfterFirstThrow(n, excluded1)) {
                dice1[n-1] = random.nextInt(6) + 1;
            }
        }
        dice2 = dice1;
        return dice2;
    }

    public int[] throwDicesThirdTime (int...excluded2){

        for (int n = 1; n < 6; n++) {
            if (containsAfterSecondThrow(n, excluded2)) {
                dice2[n-1] = random.nextInt(6) + 1;
            }
        }
        dice3 = dice2;
        return dice3;
    }


}

