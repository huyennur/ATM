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

public class WithdrawController {

    Management m = new Management();
    ArrayList<Account> list = m.insertData();
    ATMController atm = new ATMController();
    Account account = new Account();

    @FXML
    private TextField enterAmount;

    @FXML
    private Button confirmWithdraw;

    @FXML
    private Button endTransitionWithdraw;

    @FXML
    private Text confirmStateWithdraw;

    @FXML
    private Text showBalanceTransitionWithdraw;

    @FXML
    private TextField reenterPINWithdraw;

    @FXML
    private Label reenterPINstateWithdraw;

    @FXML
    private Button reenterPINOKwithdraw;

    private double getAmount() {
        double amount = Integer.parseInt(enterAmount.getText());
        return amount;
    }

    @FXML
    public void confirmWithdrawal(ActionEvent event) throws IOException {
        Main main = new Main();
        if (event.getSource() == confirmWithdraw) {
            main.changeScene("../graphics/afterWithdraw.fxml");
        }
    }

    @FXML
    void confirmReenterPINWithdraw(ActionEvent event) throws IOException {
        int pin = Integer.parseInt(reenterPINWithdraw.getText());
        if (pin == atm.getPass()) {
            confirmStateWithdraw.setText(account.withdraw(getAmount()));
        } else {
            reenterPINstateWithdraw.setText("Invalid PIN");
            reenterPINWithdraw.clear();
        }
    }

    @FXML
    void endShowingTransitionWithdraw(ActionEvent event) throws IOException {
        Main main = new Main();
        if(event.getSource() == endTransitionWithdraw) {
            main.changeScene("../graphics/mainATM.fxml");
        }
    }

}
