package com.kodilla;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class VBoxLeft {

    private Image diceSix = new Image("file:resources/dice-six-faces-six.png");

    public VBox addVBox() {
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(15, 200, 15, 12));
        vbox.setSpacing(10);
        vbox.setStyle("-fx-background-color: #336699;");

//        ImageView img;
//        img = new ImageView(diceSix);
//        vbox.getChildren().add(img);


        //hbox.getChildren().addAll(buttonCurrent, buttonProjected);

        return vbox;
    }
}
