package com.company;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

import java.lang.ModuleLayer.Controller;

public class Robot
{
    public Circle circle;

    @FXML
    void moveUp()
    {
        circle.setLayoutY(circle.getLayoutY() - 1);
    }

    @FXML
    void moveDown()
    {
        circle.setLayoutY(circle.getLayoutY() + 1);
    }

    @FXML
    void moveLeft()
    {
        circle.setLayoutX(circle.getLayoutX() - 1);
    }

    @FXML
    void moveRight()
    {
        circle.setLayoutX(circle.getLayoutX() + 1);
    }
}

