package controllers;

import ATM.Account;
import ATM.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;

public class AfterTransitionController {

    WithdrawController wd = new WithdrawController();
    ATMController atm = new ATMController();
    Account account = new Account();

    @FXML
    private Button endTransition;

    @FXML
    private Text confirmState;

    @FXML
    private Text showBalanceTransition;

    @FXML
    private TextField reenterPIN;

    @FXML
    private Label reenterPINstate;

    @FXML
    private Button reenterPINOK;

    @FXML
    public void confirmReenterPIN(ActionEvent event) throws IOException{
//        int pass = Integer.parseInt(reenterPIN.getText());
//        if(event.getSource() == reenterPINOK) {
//            if (pass == atm.getPass()) {
//                if (wd.getAmount() > account.getBalance()) {
//                    confirmState.setText("The amount exceeds the balance!");
//                } else if (wd.getAmount() <= 0 || wd.getAmount() % 50000 != 0)) {
//                    confirmState.setText("The amount must be a multiple of 50000!");
//                } /*else {
//                    String balanceString = (account.getBalance() -= (withdraw.amount).toString;
//                    confirmState.setText("Withdraw successfully!");
//                    showBalanceTransition.setText("");
//                */}
//            } else {
//                reenterPINstate.setText("Invalid PIN");
//                reenterPIN.clear();
//            }
//        }

    }

    @FXML
    public void endShowingTransition(ActionEvent event) throws IOException {
//        Main main = new Main();
//        if(event.getSource() == endTransition) {
//            main.changeScene("../graphics/ATMController");
//        }
    }



}
