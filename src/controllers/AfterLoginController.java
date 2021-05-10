package controllers;

import ATM.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import java.io.IOException;

import static ATM.Main.stg;
import static ATM.Main.account;
import static ATM.Main.m;

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
        //Main main = new Main();
        //main.changeScene("../graphics/mainATM.fxml");
        Parent pane = FXMLLoader.load(getClass().getResource("../graphics/mainATM.fxml"));
        stg.getScene().setRoot(pane);
    }

    public void transferWindow(ActionEvent event) throws IOException {
        //Main main = new Main();
        if (event.getSource() == transfer) {
            //main.changeScene("../graphics/transfer.fxml");
            Parent pane = FXMLLoader.load(getClass().getResource("../graphics/transfer.fxml"));
            stg.getScene().setRoot(pane);
        }
    }

    public void withdrawWindow(ActionEvent event) throws IOException {
        //Main main = new Main();
        if (event.getSource() == withdraw) {
            //main.changeScene("../graphics/withdraw.fxml");
            Parent pane = FXMLLoader.load(getClass().getResource("../graphics/withdraw.fxml"));
            stg.getScene().setRoot(pane);
        }
    }

    public void checkAccountWindow(ActionEvent event) throws IOException {
        //Main main = new Main();
        if (event.getSource() == checkAccount) {
            //main.changeScene("../graphics/checkBalance.fxml");
            Parent pane = FXMLLoader.load(getClass().getResource("../graphics/checkBalance.fxml"));
            stg.getScene().setRoot(pane);
        }
    }

    public void payBillsWindow(ActionEvent event) throws IOException {
        //Main main = new Main();
        if (event.getSource() == payBills) {
            //main.changeScene("../graphics/payBills.fxml");
            Parent pane = FXMLLoader.load(getClass().getResource("../graphics/payBills.fxml"));
            stg.getScene().setRoot(pane);
        }
    }

    public void changePINWindow(ActionEvent event) throws IOException {
        //Main main = new Main();
        if (event.getSource() == changePin) {
            //main.changeScene("../graphics/changePIN.fxml");
            Parent pane = FXMLLoader.load(getClass().getResource("../graphics/changePIN.fxml"));
            stg.getScene().setRoot(pane);
        }
    }


}