package com.kodilla;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

//lewy Panel
public class GridPaneLeft {

    //private Image diceSix = new Image("file:resources/dice-six-faces-six.png");
    Text text;
    CheckBox checkBox1 = new CheckBox();
    CheckBox checkBox2 = new CheckBox();
    CheckBox checkBox3 = new CheckBox();
    CheckBox checkBox4 = new CheckBox();
    CheckBox checkBox5 = new CheckBox();
    int excluded;
    int excluded1;
    int excluded2;
    int excluded3;
    int excluded4;

    public GridPane gridPaneLeft(Text text) {
        this.text = text;

//        checkBox1.setIndeterminate(false);
//        checkBox2.setIndeterminate(false);
//        checkBox3.setIndeterminate(false);
//        checkBox4.setIndeterminate(false);
//        checkBox5.setIndeterminate(false);

        GridPane gridPaneLeft = new GridPane();
        gridPaneLeft.setPadding(new Insets(15, 150, 15, 12));
        gridPaneLeft.setHgap(5);
        gridPaneLeft.setVgap(5);
        gridPaneLeft.setStyle("-fx-background-color: green;");
        gridPaneLeft.add(text, 1, 1);
        gridPaneLeft.add(checkBox1, 3, 2);
        gridPaneLeft.add(checkBox2, 3, 3);
        gridPaneLeft.add(checkBox3, 3, 4);
        gridPaneLeft.add(checkBox4, 3, 5);
        gridPaneLeft.add(checkBox5, 3, 6);

        return gridPaneLeft;
    }

    public int getExcluded() {
        return excluded;
    }
    public int getExcluded1() {
        return excluded1;
    }
    public int getExcluded2() {
        return excluded2;
    }
    public int getExcluded3() {
        return excluded3;
    }
    public int getExcluded4() {
        return excluded4;
    }
    public Text getText() {
        return text;
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
}
