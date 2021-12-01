package com.example.newtry;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.event.ActionEvent;
import javafx.scene.text.Text;


public class HelloController {
    @FXML
    public TextField emailField=new TextField();

    @FXML
    public PasswordField pwField = new PasswordField();

    @FXML
    public Button signUp = new Button("Sign up");

    @FXML
    private Label actiontarget;
    @FXML
    public void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Sign in button pressed");

        }


    @FXML
    public Label rLabel;
    public void signUp() {
        com.example.newtry.user user1 = new com.example.newtry.user(emailField.getText(), pwField.getText());
        if (!user1.checkEmail(emailField.getText())) {
            rLabel.setText("Enter valid email");

        } else {
            rLabel.setText("Email valid");
        }
        }

    }


