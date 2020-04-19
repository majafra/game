package com.kodilla;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Game extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane border = new BorderPane();
        VBoxLeft vboxLeft= new VBoxLeft();
        VBoxRight vboxRight=new VBoxRight();
        GridPaneCenter gridPaneCenter = new GridPaneCenter();
        GridPaneBottom gridPaneBottom = new GridPaneBottom();

        border.setLeft(vboxLeft.addVBox());;
        border.setCenter(gridPaneCenter.addGridPane());
        border.setRight(vboxRight.addHBox());
        border.setBottom(gridPaneBottom.addGridPane());
        //border.setTop(hbox);

        Scene scene = new Scene(border, 900, 700, Color.BLACK);

        primaryStage.setTitle("Dice Poker");
        primaryStage.setScene(scene);
        primaryStage.show();

        //Rectangle r = new Rectangle(25,25,250,250);
        //r.setFill(Color.BLUE);
    }
}
