package controllers;

import ATM.Account;
import ATM.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;

public class ChangePINController {

    ATMController atm = new ATMController();
    Account account = new Account();

    @FXML
    private Button confirmChangePIN;

    @FXML
    private Text wrongOldPINnotify;

    @FXML
    private TextField enterOldPIN;

    @FXML
    private TextField enterNewPIN;

    @FXML
    private TextField reEnterNewPIN;

    private int getOldPIN() {
        int oldPIN = Integer.parseInt(enterOldPIN.getText());
        return oldPIN;
    }

    private int getNewPIN() {
        int newPIN = Integer.parseInt(enterNewPIN.getText());
        return newPIN;
    }

    private int getReNewPIN() {
        int newPIN = Integer.parseInt(reEnterNewPIN.getText());
        return newPIN;
    }

    @FXML
    void confirmPINchanging(ActionEvent event) throws IOException {
        Main main = new Main();
        wrongOldPINnotify.setText(account.changePIN(getOldPIN(), getNewPIN(), getReNewPIN()));
        main.changeScene("../graphics/afterChangePIN.fxml");
    }

}

