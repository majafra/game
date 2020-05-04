package com.kodilla;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

//środokowy panel
public class GridPaneCenter {

    ResultsDecision resultsDecision;

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

    CheckBox checkBox1 = new CheckBox();
    CheckBox checkBox2 = new CheckBox();
    CheckBox checkBox3 = new CheckBox();
    CheckBox checkBox4 = new CheckBox();
    CheckBox checkBox5 = new CheckBox();
    CheckBox checkBox6 = new CheckBox();
    CheckBox checkBox7 = new CheckBox();
    CheckBox checkBox8 = new CheckBox();
    CheckBox checkBox9 = new CheckBox();
    CheckBox checkBox10 = new CheckBox();
    CheckBox checkBox11 = new CheckBox();
    CheckBox checkBox12 = new CheckBox();
    CheckBox checkBox13 = new CheckBox();

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

    public GridPane addGridPane() {
        GridPane grid = new GridPane();
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(0, 5, 0, 5));

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

        grid.add(player,2,0);
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

        grid.add(checkBox1,1,1);
        grid.add(checkBox2,1,2);
        grid.add(checkBox3,1,3);
        grid.add(checkBox4,1,4);
        grid.add(checkBox5,1,5);
        grid.add(checkBox6,1,6);
        grid.add(checkBox7,1,7);
        grid.add(checkBox8,1,8);
        grid.add(checkBox9,1,9);
        grid.add(checkBox10,1,10);
        grid.add(checkBox11,1,11);
        grid.add(checkBox12,1,12);
        grid.add(checkBox13,1,13);

//        EventHandler <MouseEvent> eventHandler= new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                resultsDecision.ones();
//            }
//        };
//        text1.addEventFilter(MouseEvent.MOUSE_CLICKED,eventHandler);
        grid.add(textField1,2,1);
        grid.add(textField2,2,2);
        grid.add(textField3,2,3);
        grid.add(textField4,2,4);
        grid.add(textField5,2,5);
        grid.add(textField6,2,6);
        grid.add(textField7,2,7);
        grid.add(textField8,2,8);
        grid.add(textField9,2,9);
        grid.add(textField10,2,10);
        grid.add(textField11,2,11);
        grid.add(textField12,2,12);
        grid.add(textField13,2,13);



        grid.add(computer,3,0);

        grid.add(textField14,3,1);
        grid.add(textField15,3,2);
        grid.add(textField16,3,3);
        grid.add(textField17,3,4);
        grid.add(textField18,3,5);
        grid.add(textField19,3,6);
        grid.add(textField20,3,7);
        grid.add(textField21,3,8);
        grid.add(textField22,3,9);
        grid.add(textField23,3,10);
        grid.add(textField24,3,11);
        grid.add(textField25,3,12);
        grid.add(textField26,3,13);

        return grid;
    }

    public Text getText1() {
        return text1;
    }

    public Text getText2() {
        return text2;
    }

    public Text getText3() {
        return text3;
    }

    public Text getText4() {
        return text4;
    }

    public Text getText5() {
        return text5;
    }

    public Text getText6() {
        return text6;
    }

    public Text getText7() {
        return text7;
    }

    public Text getText8() {
        return text8;
    }

    public Text getText9() {
        return text9;
    }

    public Text getText10() {
        return text10;
    }

    public Text getText11() {
        return text11;
    }

    public Text getText12() {
        return text12;
    }

    public Text getText13() {
        return text13;
    }

    public CheckBox getCheckBox1() {
        return checkBox1;
    }

    public CheckBox getCheckBox2() {
        return checkBox2;
    }

    public CheckBox getCheckBox3() {
        return checkBox3;
    }

    public CheckBox getCheckBox4() {
        return checkBox4;
    }

    public CheckBox getCheckBox5() {
        return checkBox5;
    }

    public CheckBox getCheckBox6() {
        return checkBox6;
    }

    public CheckBox getCheckBox7() {
        return checkBox7;
    }

    public CheckBox getCheckBox8() {
        return checkBox8;
    }

    public CheckBox getCheckBox9() {
        return checkBox9;
    }

    public CheckBox getCheckBox10() {
        return checkBox10;
    }

    public CheckBox getCheckBox11() {
        return checkBox11;
    }

    public CheckBox getCheckBox12() {
        return checkBox12;
    }

    public CheckBox getCheckBox13() {
        return checkBox13;
    }

    public TextField getTextField1() {
        return textField1;
    }

    public TextField getTextField2() {
        return textField2;
    }

    public TextField getTextField3() {
        return textField3;
    }

    public TextField getTextField4() {
        return textField4;
    }

    public TextField getTextField5() {
        return textField5;
    }

    public TextField getTextField6() {
        return textField6;
    }

    public TextField getTextField7() {
        return textField7;
    }

    public TextField getTextField8() {
        return textField8;
    }

    public TextField getTextField9() {
        return textField9;
    }

    public TextField getTextField10() {
        return textField10;
    }

    public TextField getTextField11() {
        return textField11;
    }

    public TextField getTextField12() {
        return textField12;
    }

    public TextField getTextField13() {
        return textField13;
    }
}
