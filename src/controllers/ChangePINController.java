package controllers;

import ATM.Account;
import ATM.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;

import static ATM.Main.account;
import static ATM.Main.stg;

public class ChangePINController {

    @FXML
    private Button confirmChangePIN;

    @FXML
    private TextField enterOldPIN;

    @FXML
    private TextField enterNewPIN;

    @FXML
    private TextField reEnterNewPIN;

    @FXML
    private Button endChangePIN;

    @FXML
    private Text wrongOldPINnotify;

    @FXML
    public void confirmPINchanging(ActionEvent event) throws IOException {
        int oldPIN = Integer.parseInt(enterOldPIN.getText());
        int newPIN = Integer.parseInt(enterNewPIN.getText());
        int renewPIN = Integer.parseInt(reEnterNewPIN.getText());
        if (event.getSource() == confirmChangePIN) {
            wrongOldPINnotify.setText(account.changePIN(oldPIN, newPIN, renewPIN));
        }
    }

    @FXML
    public void endPINchanging(ActionEvent event) throws IOException {
        if(event.getSource() == endChangePIN) {
            Parent pane = FXMLLoader.load(getClass().getResource("../graphics/afterLogin.fxml"));
            stg.getScene().setRoot(pane);
        }
    }

}

