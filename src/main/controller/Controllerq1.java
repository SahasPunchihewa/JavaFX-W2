package main.controller;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controllerq1
{
    @FXML
    private Label hello;

    @FXML
    private TextField name;

    public void hellotext()
    {
        hello.setText("Hello "+(name.getText()));
    }
    public void cleartext()
    {
        hello.setText("");
        name.setText("");
    }

}
