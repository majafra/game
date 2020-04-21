package com.kodilla;

public class GameRunner {
    public static void main(String[] args){
        GameProcess gameProcess= new GameProcess();

        gameProcess.throwDices();
        System.out.println("  drugi rzut");
        gameProcess.throwDicesSecondTime(1,2);
        System.out.println("  trzeci rzut");
        gameProcess.throwDicesThirdTime();
        //gameProcess.playersDecision();
    }
}
