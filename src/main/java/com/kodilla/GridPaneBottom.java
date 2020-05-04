package com.kodilla;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.event.EventHandler;

import java.util.Arrays;

//klasa głowna dla procesu gry- tu były podstawowe Buttony i dlatego tez jest cały proces
public class GridPaneBottom {

    private GameProcess gameProcess;
    Button throwDice = new Button("Throw!");
    Button select = new Button("Confirm Result");

    public GridPaneBottom(GameProcess gameProcess) {
        this.gameProcess = gameProcess;
    }

    public GridPane addGridPane(GridPaneLeft gridPaneLeft,GridPaneCenter gridPaneCenter,ResultsDecision resultsDecision,ResultsDecisionFigures resultsDecisionFigures) {

        GridPane grid = new GridPane();

        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

        throwDice.setPrefSize(100, 40);
        grid.add(throwDice,1,1);

        select.setDisable(true);
        select.setPrefSize(100, 40);
        grid.add(select,2,1);
//        throwDice.setOnAction((e) ->{
//            this.showResult(vBoxLeft); } );
        EventHandler <MouseEvent> eventHandler= new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                handleThrow(gridPaneLeft);
            }
        };
        throwDice.addEventFilter(MouseEvent.MOUSE_CLICKED,eventHandler);

        EventHandler <MouseEvent> eventHandler2= new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                handleSelect(gridPaneLeft,gridPaneCenter,resultsDecision, resultsDecisionFigures);
            }
        };
        select.addEventFilter(MouseEvent.MOUSE_CLICKED,eventHandler2);
        return grid;
    }
    // tu tez grid center
    private void handleSelect(GridPaneLeft gridPaneLeft,GridPaneCenter gridPaneCenter,ResultsDecision resultsDecision, ResultsDecisionFigures resultsDecisionFigures) {
        if(gameProcess.getGameState()==GameState.FIRST_THROW){
            if(gridPaneCenter.getCheckBox1().isSelected()){
               int result =  resultsDecision.ones(gameProcess.getDice1());
            gridPaneCenter.getTextField1().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox2().isSelected()){
                int result =  resultsDecision.twos(gameProcess.getDice1());
                gridPaneCenter.getTextField2().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox3().isSelected()){
                int result =  resultsDecision.threes(gameProcess.getDice1());
            gridPaneCenter.getTextField3().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox4().isSelected()){
                int result =  resultsDecision.fours(gameProcess.getDice1());
                gridPaneCenter.getTextField4().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox5().isSelected()){
                int result =  resultsDecision.fives(gameProcess.getDice1());
                gridPaneCenter.getTextField5().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox6().isSelected()){
                int result =  resultsDecision.sixes(gameProcess.getDice1());
                gridPaneCenter.getTextField6().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox7().isSelected()){
                int result =  resultsDecisionFigures.threeOfAKind(gameProcess.getDice1());
                gridPaneCenter.getTextField7().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox8().isSelected()){
                int result =  resultsDecisionFigures.fourOfAKind(gameProcess.getDice1());
                gridPaneCenter.getTextField8().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox9().isSelected()){
                int result =  resultsDecisionFigures.fullHouse(gameProcess.getDice1());
                gridPaneCenter.getTextField9().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox10().isSelected()){
                int result =  resultsDecisionFigures.smallStraight(gameProcess.getDice1());
                gridPaneCenter.getTextField10().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox11().isSelected()){
                int result =  resultsDecisionFigures.bigStraight(gameProcess.getDice1());
                gridPaneCenter.getTextField11().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox12().isSelected()){
                int result =  resultsDecisionFigures.flush(gameProcess.getDice1());
                gridPaneCenter.getTextField12().setText(String.valueOf(result));}

            gameProcess.setGameState(GameState.LAST_THROW);
            gridPaneLeft.getCheckBox1().setSelected(false);
            gridPaneLeft.getCheckBox2().setSelected(false);
            gridPaneLeft.getCheckBox3().setSelected(false);
            gridPaneLeft.getCheckBox4().setSelected(false);
            gridPaneLeft.getCheckBox5().setSelected(false);

        }else if(gameProcess.getGameState()==GameState.NEXT_THROW){
            if(gridPaneCenter.getCheckBox1().isSelected()){
                int result =  resultsDecision.ones(gameProcess.getDice2());
                gridPaneCenter.getTextField1().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox2().isSelected()){
                int result =  resultsDecision.twos(gameProcess.getDice2());
                gridPaneCenter.getTextField2().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox3().isSelected()){
                int result =  resultsDecision.threes(gameProcess.getDice2());
                gridPaneCenter.getTextField3().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox4().isSelected()){
                int result =  resultsDecision.fours(gameProcess.getDice2());
                gridPaneCenter.getTextField4().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox5().isSelected()){
                int result =  resultsDecision.fives(gameProcess.getDice2());
                gridPaneCenter.getTextField5().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox6().isSelected()){
                int result =  resultsDecision.sixes(gameProcess.getDice2());
                gridPaneCenter.getTextField6().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox7().isSelected()){
                int result =  resultsDecisionFigures.threeOfAKind(gameProcess.getDice2());
                gridPaneCenter.getTextField7().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox8().isSelected()){
                int result =  resultsDecisionFigures.fourOfAKind(gameProcess.getDice2());
                gridPaneCenter.getTextField8().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox9().isSelected()){
                int result =  resultsDecisionFigures.fullHouse(gameProcess.getDice2());
                gridPaneCenter.getTextField9().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox10().isSelected()){
                int result =  resultsDecisionFigures.smallStraight(gameProcess.getDice2());
                gridPaneCenter.getTextField10().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox11().isSelected()){
                int result =  resultsDecisionFigures.bigStraight(gameProcess.getDice2());
                gridPaneCenter.getTextField11().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox12().isSelected()){
                int result =  resultsDecisionFigures.flush(gameProcess.getDice2());
                gridPaneCenter.getTextField12().setText(String.valueOf(result));}

            gameProcess.setGameState(GameState.LAST_THROW);
            gridPaneLeft.getCheckBox1().setSelected(false);
            gridPaneLeft.getCheckBox2().setSelected(false);
            gridPaneLeft.getCheckBox3().setSelected(false);
            gridPaneLeft.getCheckBox4().setSelected(false);
            gridPaneLeft.getCheckBox5().setSelected(false);

        }else if(gameProcess.getGameState()==GameState.LAST_THROW){
            if(gridPaneCenter.getCheckBox1().isSelected()){
                int result =  resultsDecision.ones(gameProcess.getDice3());
                gridPaneCenter.getTextField1().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox2().isSelected()){
                int result =  resultsDecision.twos(gameProcess.getDice3());
                gridPaneCenter.getTextField2().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox3().isSelected()){
                int result =  resultsDecision.threes(gameProcess.getDice3());
                gridPaneCenter.getTextField3().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox4().isSelected()){
                int result =  resultsDecision.fours(gameProcess.getDice3());
                gridPaneCenter.getTextField4().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox5().isSelected()){
                int result =  resultsDecision.fives(gameProcess.getDice3());
                gridPaneCenter.getTextField5().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox6().isSelected()){
                int result =  resultsDecision.sixes(gameProcess.getDice3());
                gridPaneCenter.getTextField6().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox7().isSelected()){
                int result =  resultsDecisionFigures.threeOfAKind(gameProcess.getDice3());
                gridPaneCenter.getTextField7().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox8().isSelected()){
                int result =  resultsDecisionFigures.fourOfAKind(gameProcess.getDice3());
                gridPaneCenter.getTextField8().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox9().isSelected()){
                int result =  resultsDecisionFigures.fullHouse(gameProcess.getDice3());
                gridPaneCenter.getTextField9().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox10().isSelected()){
                int result =  resultsDecisionFigures.smallStraight(gameProcess.getDice3());
                gridPaneCenter.getTextField10().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox11().isSelected()){
                int result =  resultsDecisionFigures.bigStraight(gameProcess.getDice3());
                gridPaneCenter.getTextField11().setText(String.valueOf(result));}

            if(gridPaneCenter.getCheckBox12().isSelected()){
                int result =  resultsDecisionFigures.flush(gameProcess.getDice3());
                gridPaneCenter.getTextField12().setText(String.valueOf(result));}

            gameProcess.setGameState(GameState.LAST_THROW);
            gridPaneLeft.getCheckBox1().setSelected(false);
            gridPaneLeft.getCheckBox2().setSelected(false);
            gridPaneLeft.getCheckBox3().setSelected(false);
            gridPaneLeft.getCheckBox4().setSelected(false);
            gridPaneLeft.getCheckBox5().setSelected(false);
        }
    }

    private void handleThrow(GridPaneLeft gridPaneLeft) {
        if(gameProcess.getGameState()==GameState.IDLE){
            gameProcess.throwDices();
            showResult(gridPaneLeft,gameProcess.getDice1());
            gameProcess.setGameState(GameState.FIRST_THROW);
            select.setDisable(false);
        }else if(gameProcess.getGameState()==GameState.FIRST_THROW){

            int[] excluded=new int[5];
            if(gridPaneLeft.getCheckBox1().isSelected())
                excluded[0]=1;
            if(gridPaneLeft.getCheckBox2().isSelected())
                excluded[1]=2;
            if(gridPaneLeft.getCheckBox3().isSelected())
                excluded[2]=3;
            if(gridPaneLeft.getCheckBox4().isSelected())
                excluded[3]=4;
            if(gridPaneLeft.getCheckBox5().isSelected())
                excluded[4]=5;

            gameProcess.throwDicesSecondTime(excluded);
            showResult(gridPaneLeft,gameProcess.getDice2());
            gameProcess.setGameState(GameState.NEXT_THROW);
            gridPaneLeft.getCheckBox1().setSelected(false);
            gridPaneLeft.getCheckBox2().setSelected(false);
            gridPaneLeft.getCheckBox3().setSelected(false);
            gridPaneLeft.getCheckBox4().setSelected(false);
            gridPaneLeft.getCheckBox5().setSelected(false);

        }else if(gameProcess.getGameState()==GameState.NEXT_THROW){
            int[] excluded1=new int[5];
            if(gridPaneLeft.getCheckBox1().isSelected())
                excluded1[0]=1;
            if(gridPaneLeft.getCheckBox2().isSelected())
                excluded1[1]=2;
            if(gridPaneLeft.getCheckBox3().isSelected())
                excluded1[2]=3;
            if(gridPaneLeft.getCheckBox4().isSelected())
                excluded1[3]=4;
            if(gridPaneLeft.getCheckBox5().isSelected())
                excluded1[4]=5;

            gameProcess.throwDicesThirdTime(excluded1);
            showResult(gridPaneLeft,gameProcess.getDice3());
            gameProcess.setGameState(GameState.LAST_THROW);
            gridPaneLeft.getCheckBox1().setSelected(false);
            gridPaneLeft.getCheckBox2().setSelected(false);
            gridPaneLeft.getCheckBox3().setSelected(false);
            gridPaneLeft.getCheckBox4().setSelected(false);
            gridPaneLeft.getCheckBox5().setSelected(false);
            throwDice.setDisable(true);
        }
    }

    public void showResult(GridPaneLeft gridPaneLeft, int[] dice1) {

        Text text = gridPaneLeft.getText();
        text.setText(Arrays.toString(gameProcess.getDice1()));
    }
}