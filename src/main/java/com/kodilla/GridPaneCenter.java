package com.kodilla;

import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class GridPaneCenter {
    public GridPane addGridPane() {
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(0, 10, 0, 10));

        Text player = new Text("PLAYER");
        Text text1 = new Text("1");
        Text text2 = new Text("2");
        Text text3 = new Text("3");
        Text text4 = new Text("4");
        Text text5 = new Text("5");
        Text text6 = new Text("6");
        Text text7 = new Text("Three");
        Text text8 = new Text("Four");
        Text text9 = new Text("Full h.");
        Text text10 = new Text("S. Straight");
        Text text11 = new Text("Big Straight");
        Text text12 = new Text("Flush");
        Text text13 = new Text("SUM");

        Text computer = new Text("COMPUTER");
        TextField textField14 = new TextField();
        TextField textField15 = new TextField();
        TextField textField16 = new TextField();
        TextField textField17 = new TextField();
        TextField textField18 = new TextField();
        TextField textField19 = new TextField();
        TextField textField20 = new TextField();
        TextField textField21 = new TextField();
        TextField textField22 = new TextField();
        TextField textField23 = new TextField();
        TextField textField24 = new TextField();
        TextField textField25 = new TextField();
        TextField textField26 = new TextField();

        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        TextField textField3 = new TextField();
        TextField textField4 = new TextField();
        TextField textField5 = new TextField();
        TextField textField6 = new TextField();
        TextField textField7 = new TextField();
        TextField textField8 = new TextField();
        TextField textField9 = new TextField();
        TextField textField10 = new TextField();
        TextField textField11 = new TextField();
        TextField textField12 = new TextField();
        TextField textField13 = new TextField();


        grid.add(player,1,0);
        grid.add(text1,0,1);
        grid.add(text2,0,2);
        grid.add(text3,0,3);
        grid.add(text4,0,4);
        grid.add(text5,0,5);
        grid.add(text6,0,6);
        grid.add(text7,0,7);
        grid.add(text8,0,8);
        grid.add(text9,0,9);
        grid.add(text10,0,10);
        grid.add(text11,0,11);
        grid.add(text12,0,12);
        grid.add(text13,0,13);


        grid.add(textField1,1,1);
        grid.add(textField2,1,2);
        grid.add(textField3,1,3);
        grid.add(textField4,1,4);
        grid.add(textField5,1,5);
        grid.add(textField6,1,6);
        grid.add(textField7,1,7);
        grid.add(textField8,1,8);
        grid.add(textField9,1,9);
        grid.add(textField10,1,10);
        grid.add(textField11,1,11);
        grid.add(textField12,1,12);
        grid.add(textField13,1,13);

        grid.add(computer,2,0);

        grid.add(textField14,2,1);
        grid.add(textField15,2,2);
        grid.add(textField16,2,3);
        grid.add(textField17,2,4);
        grid.add(textField18,2,5);
        grid.add(textField19,2,6);
        grid.add(textField20,2,7);
        grid.add(textField21,2,8);
        grid.add(textField22,2,9);
        grid.add(textField23,2,10);
        grid.add(textField24,2,11);
        grid.add(textField25,2,12);
        grid.add(textField26,2,13);

        //grid.add(text13,3,0);


        return grid;
    }
}
