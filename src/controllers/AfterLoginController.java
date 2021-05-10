package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import java.io.IOException;

import static ATM.Main.stg;

public class AfterLoginController {

    @FXML
    private Button logout;
    @FXML
    private Button withdraw;
    @FXML
    private Button transfer;
    @FXML
    private Button checkAccount;
    @FXML
    private Button payBills;
    @FXML
    private Button changePin;

    public void userLogOut(ActionEvent event) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("../graphics/mainATM.fxml"));
        stg.getScene().setRoot(pane);
    }

    public void transferWindow(ActionEvent event) throws IOException {
        if (event.getSource() == transfer) {
            Parent pane = FXMLLoader.load(getClass().getResource("../graphics/transfer.fxml"));
            stg.getScene().setRoot(pane);
        }
    }

    public void withdrawWindow(ActionEvent event) throws IOException {
        if (event.getSource() == withdraw) {
            Parent pane = FXMLLoader.load(getClass().getResource("../graphics/withdraw.fxml"));
            stg.getScene().setRoot(pane);
        }
    }

    public void checkAccountWindow(ActionEvent event) throws IOException {
        if (event.getSource() == checkAccount) {
            Parent pane = FXMLLoader.load(getClass().getResource("../graphics/checkBalance.fxml"));
            stg.getScene().setRoot(pane);
        }
    }

    public void payBillsWindow(ActionEvent event) throws IOException {
        if (event.getSource() == payBills) {
            Parent pane = FXMLLoader.load(getClass().getResource("../graphics/payBills.fxml"));
            stg.getScene().setRoot(pane);
        }
    }

    public void changePINWindow(ActionEvent event) throws IOException {
        if (event.getSource() == changePin) {
            Parent pane = FXMLLoader.load(getClass().getResource("../graphics/changePIN.fxml"));
            stg.getScene().setRoot(pane);
        }
    }


}