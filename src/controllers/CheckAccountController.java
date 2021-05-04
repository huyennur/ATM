package controllers;

import ATM.Account;
import ATM.Main;
import ATM.Management;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class CheckAccountController {

    Account account = new Account();
    Management management = new Management();

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
        Main main = new Main();
        if(event.getSource() == endCheckBalance) {
            main.changeScene("../graphics/mainATM.fxml");
        }
    }
}
