package controllers;

import ATM.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;

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
        Main main = new Main();
        main.changeScene("../graphics/mainATM.fxml");
    }

    public void transferWindow(ActionEvent event) throws IOException {
        Main main = new Main();
        if (event.getSource() == transfer) {
            main.changeScene("../graphics/transfer.fxml");
        }
    }

    public void withdrawWindow(ActionEvent event) throws IOException {
        Main main = new Main();
        if (event.getSource() == withdraw) {
            main.changeScene("../graphics/withdraw.fxml");
        }
    }

    public void checkAccountWindow(ActionEvent event) throws IOException {
        Main main = new Main();
        if (event.getSource() == checkAccount) {
            main.changeScene("../graphics/checkBalance.fxml");
        }
    }

    public void payBillsWindow(ActionEvent event) throws IOException {
        Main main = new Main();
        if (event.getSource() == payBills) {
            main.changeScene("../graphics/payBills.fxml");
        }
    }

    public void changePINWindow(ActionEvent event) throws IOException {
        Main main = new Main();
        if (event.getSource() == changePin) {
            main.changeScene("../graphics/changePIN.fxml");
        }
    }


}