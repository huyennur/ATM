package controllers;

import ATM.Account;
import ATM.Main;
import ATM.Management;
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

    //Account account = new Account();
    //Management management = new Management();

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
        //Main main = new Main();
        if(event.getSource() == endCheckBalance) {
            //main.changeScene("../graphics/afterLogin.fxml");
            Parent pane = FXMLLoader.load(getClass().getResource("../graphics/afterLogin.fxml"));
            stg.getScene().setRoot(pane);
        }
    }
}
