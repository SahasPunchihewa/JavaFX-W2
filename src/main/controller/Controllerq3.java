package main.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controllerq3
{
    @FXML
    private TextField t1,t2;

    @FXML
    private Label sumout;

    int no1,no2,tot;

    Alert a;

    public void calculate_total()
    {
        no1=Integer.parseInt(t1.getText());
        no2=Integer.parseInt(t2.getText());
        tot=no1+no2;
        sumout.setText("Total = "+(String.valueOf(tot)));
        a=new Alert(Alert.AlertType.CONFIRMATION);
        a.setContentText("Total = "+(String.valueOf(tot)));
        a.show();
    }
}
