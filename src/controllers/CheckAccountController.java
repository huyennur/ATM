package controllers;

import ATM.Account;
import ATM.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

import java.io.IOException;

public class CheckAccountController {
    Account account = new Account();

    @FXML
    private Button endCheckBalance;

    @FXML
    private Label showBalance;


    @FXML
    void endBalanceChecking(ActionEvent event) throws IOException {
        Main main = new Main();
        if(showBalance.getText() == "") {
            showBalance.setText(account.checkAccount());
        }
        if(event.getSource() == endCheckBalance) {
            main.changeScene("../graphics/mainATM.fxml");
        }
    }
}
