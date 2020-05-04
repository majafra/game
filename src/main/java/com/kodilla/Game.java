package com.kodilla;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//klasa główna dla javafx z metoda start i zdefiniowanym BorderPane
public class Game extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane border = new BorderPane();
        GridPaneLeft gridPaneLeft= new GridPaneLeft();
        VBoxRight vboxRight=new VBoxRight();
        GridPaneCenter gridPaneCenter = new GridPaneCenter();
        GameProcess gameProcess = new GameProcess();
        GridPaneBottom gridPaneBottom = new GridPaneBottom(gameProcess);
        ResultsDecision resultsDecision = new ResultsDecision();
        ResultsDecisionFigures resultsDecisionFigures = new ResultsDecisionFigures();

        //VBox vboxAfterFirstThrow = new VBox();

        Text text = new Text();
        text.setText("Prosze o rzut!");

        border.setLeft(gridPaneLeft.gridPaneLeft(text));
        border.setCenter(gridPaneCenter.addGridPane());
        border.setRight(vboxRight.addHBox());
        border.setBottom(gridPaneBottom.addGridPane(gridPaneLeft,gridPaneCenter,resultsDecision,resultsDecisionFigures));
        //border.setTop(hbox);

        //dlaczego ponizxze nie dziala i nie zna metod getChildren choc to grid?
//        Button throwDice = new Button("Throw");
//        throwDice.setPrefSize(160, 40);
//        gridPaneBottom.getChildren().add(throwDice);
//        gridPaneBottom.add(throwDice,0,0);

        Scene scene = new Scene(border, 900, 700, Color.BLACK);

        primaryStage.setTitle("Dice Poker");
        primaryStage.setScene(scene);

        primaryStage.show();

        //Rectangle r = new Rectangle(25,25,250,250);
        //r.setFill(Color.BLUE);
    }
}
