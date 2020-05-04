package com.kodilla;

import java.util.Arrays;

//klasa odpalająca mechanike gry-uzywana do testów metod na terminalu
public class GameRunner {
    public static void main(String[] args){
        GameProcess gameProcess= new GameProcess();
        ResultsDecision resultsDecision= new ResultsDecision();
        Counts counts = new Counts();
        ResultsDecisionFigures resultsDecisionFigures = new ResultsDecisionFigures();

//        int[] dice = new int[5];
//        dice[0]=2;
//        dice[1]=3;
//        dice[2]=4;
//        dice[3]=5;
//        dice[4]=6;

        int[] dice= gameProcess.throwDices();
        System.out.println(Arrays.toString(gameProcess.getDice1()));
//        int[]county=counts.counting(dice);
//        System.out.println(Arrays.toString(county));

        System.out.println("  drugi rzut");
        int[]dice1=gameProcess.throwDicesSecondTime();
        System.out.println(Arrays.toString(dice1));
        System.out.println("  trzeci rzut");
        int[] dice2=gameProcess.throwDicesThirdTime();
        System.out.println(Arrays.toString(dice2));
////
//        System.out.println(" duży strit");
//        int score = resultsDecisionFigures.bigStraight(dice);
//        System.out.println(score);
//        System.out.println("  Wyniki dwójek");
//
//        score = resultsDecisionFigures.fullHouse(dice);
//        System.out.println(score);

        //gameProcess.playersDecision();
    }
}
