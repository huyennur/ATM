package controllers;

import ATM.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;

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
    public void choosingElectricBill(ActionEvent event) {

    }

    @FXML
    public void choosingWaterBills(ActionEvent event) {

    }

    @FXML
    public void confirmBillsPaying(ActionEvent event) throws IOException {
        Main main = new Main();
        if(event.getSource() == confirmPayBills) {
            main.changeScene("../graphics/afterPayBills.fxml");
        }
    }

    @FXML
    public void confirmReenterPINPayBills(ActionEvent event) throws IOException {

    }

    @FXML
    public void endShowingPayBills(ActionEvent event) throws IOException {
        Main main = new Main();
        if(event.getSource() == endPayBills) {
            main.changeScene("../graphics/mainATM.fxml");
        }
    }
}
