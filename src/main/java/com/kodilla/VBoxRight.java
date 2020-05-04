package com.kodilla;

import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

//prawy panel, w ktorym będzie wyswietlony rezultat
public class VBoxRight {
    public VBox addHBox() {
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(15, 12, 15, 200));
        vbox.setSpacing(10);
        vbox.setStyle("-fx-background-color: #336692;");

        //Button buttonCurrent = new Button("Current");
        //buttonCurrent.setPrefSize(100, 20);

        // buttonProjected = new Button("Projected");
        //buttonProjected.setPrefSize(100, 20);
        //hbox.getChildren().addAll(buttonCurrent, buttonProjected);

        return vbox;
    }
}
