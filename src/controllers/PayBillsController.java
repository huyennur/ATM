package controllers;

import ATM.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;

import static ATM.Main.account;
import static ATM.Main.stg;

public class PayBillsController {

    @FXML
    private Button confirmPayBills;

    @FXML
    private TextField enterIDbills;

    @FXML
    private TextField enterAmountBills;

    @FXML
    private Button electricityBills;

    @FXML
    private Button waterBills;

    @FXML
    private Button endPayBills;

    @FXML
    private Text textPayBill;

    @FXML
    private Text confirmStatePayBills;

    @FXML
    private Text showBalancePayBills;

    @FXML
    private TextField reenterPINPayBills;

    @FXML
    private Label reenterPINstatePayBills;

    @FXML
    private Button reenterPINOKPayBills;

    @FXML
    public void endPayingBills(ActionEvent event) throws IOException {
        if(event.getSource() == endPayBills) {
            Parent pane = FXMLLoader.load(getClass().getResource("../graphics/afterLogin.fxml"));
            stg.getScene().setRoot(pane);
        }
    }

    @FXML
    public void choosingElectricBill(ActionEvent event) {
        if(event.getSource() == electricityBills) {

        }
    }

    @FXML
    public void choosingWaterBills(ActionEvent event) {

    }

    @FXML
    public void confirmBillsPaying(ActionEvent event) throws IOException {
        enterIDbills.getText();
        double amount = Integer.parseInt(enterAmountBills.getText());
        if(event.getSource() == confirmPayBills) {
            textPayBill.setText(account.payBill(amount));
        }
    }

}
