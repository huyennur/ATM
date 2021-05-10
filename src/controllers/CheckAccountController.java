package controllers;

import ATM.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

import static ATM.Main.account;
import static ATM.Main.stg;

public class CheckAccountController {

    @FXML
    private Button endCheckBalance;

    @FXML
    private Label showBalance;

    @FXML
    private Button check;

    @FXML
    public void BalanceChecking(ActionEvent event) throws IOException {
        if(event.getSource() == check) {
            showBalance.setText(account.checkAccount());
        }
    }

    @FXML
    public void endBalanceChecking(ActionEvent event) throws IOException {
        if(event.getSource() == endCheckBalance) {
            Parent pane = FXMLLoader.load(getClass().getResource("../graphics/afterLogin.fxml"));
            stg.getScene().setRoot(pane);
        }
    }
}
