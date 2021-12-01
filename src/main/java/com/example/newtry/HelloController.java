package com.example.newtry;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.event.ActionEvent;



public class HelloController {
    @FXML
    public TextField emailField=new TextField();

    @FXML
    public PasswordField pwField = new PasswordField();

    @FXML
    public Button signUp = new Button("Sign up");

    @FXML
    public Label rLabel;

    }

