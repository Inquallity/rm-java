package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {

    @FXML public Button btnConfirm;

    @FXML public TextField tfLogin;

    @FXML public PasswordField pfPassword;

    public void onConfirmClick(ActionEvent actionEvent) {
        System.out.println("Hello click");
    }
}
