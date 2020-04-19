package com.kodilla;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class GridPaneBottom {
    public GridPane addGridPane() {
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

        Button throwDice = new Button("Throw");
        throwDice.setPrefSize(160, 40);
        //grid.getChildren().add(throwDice);
        grid.add(throwDice,0,0);

        //Button buttonProjected = new Button("Projected");
        //buttonProjected.setPrefSize(160, 40);
        //grid.getChildren().add(buttonProjected);
        return grid;
    }
}