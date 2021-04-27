package controllers;

import ATM.Account;
import ATM.Main;
import ATM.Management;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.ArrayList;

public class TransferController {

    ATMController atm = new ATMController();
    Account account = new Account();
    Management m = new Management();
    ArrayList<Account> list = m.insertData();

    @FXML
    private TextField enterID;

    @FXML
    private TextField enterAmountTransfer;

    @FXML
    private Button confirmTransfer;

    @FXML
    private Button endTransfer;

    @FXML
    private Text confirmStateTransfer;

    @FXML
    private Text showBalanceTransfer;

    @FXML
    private TextField reenterPINTransfer;

    @FXML
    private Label reenterPINstateTransfer;

    @FXML
    private Button reenterPINOKTransfer;

    private double getAmount() {
        double amount = Integer.parseInt(enterAmountTransfer.getText());
        return amount;
    }

    private int getID() {
        int id = Integer.parseInt(enterID.getText());
        return id;
    }

    @FXML
    public void confirmTransferation(ActionEvent event) throws IOException {
        Main main = new Main();
        if (event.getSource() == confirmTransfer) {
            main.changeScene("../graphics/afterTransfer.fxml");
        }
    }

    @FXML
    void confirmReenterPINTransfer(ActionEvent event) throws IOException {
        int pin = Integer.parseInt(reenterPINTransfer.getText());
        if (pin == atm.getPass()) {
            confirmStateTransfer.setText(account.transfer(getAmount(), getID(), list));
        } else {
            reenterPINstateTransfer.setText("Invalid PIN");
            reenterPINTransfer.clear();
        }
    }

    @FXML
    void endShowingTransfer(ActionEvent event) throws IOException {
        Main main = new Main();
        if(event.getSource() == endTransfer) {
            main.changeScene("../graphics/mainATM.fxml");
        }
    }
}
