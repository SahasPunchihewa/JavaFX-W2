package main.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Scanner;


public class Controllerq2
{
    Scanner sc;
    @FXML
    private Label name;

    public void getinput()
    {
        sc=new Scanner(System.in);
        String text=sc.nextLine();
        name.setText(text);
        System.out.println(text);
    }
}
