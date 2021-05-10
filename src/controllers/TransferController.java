package controllers;

import ATM.Account;
import ATM.Main;
import ATM.Management;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import static ATM.Main.stg;
import static ATM.Main.account;
import static ATM.Main.m;

import java.io.IOException;
import java.util.ArrayList;


public class TransferController {

    //Account account = new Account();
    //Management m = new Management();
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
    private Text textTransfer;


    @FXML
    public void confirmTransferation(ActionEvent event) throws IOException {
        int id = Integer.parseInt(enterID.getText());
        double amount = Integer.parseInt(enterAmountTransfer.getText());
        if (event.getSource() == confirmTransfer) {
            textTransfer.setText(account.transfer(amount, id, list));
            enterAmountTransfer.clear();
        }
    }

    @FXML
    public void endTransferation(ActionEvent event) throws IOException {
        //Main main = new Main();
        if(event.getSource() == endTransfer) {
            //ATM.Main.changeScene("../graphics/afterLogin.fxml");
            Parent pane = FXMLLoader.load(getClass().getResource("../graphics/afterLogin.fxml"));
            stg.getScene().setRoot(pane);
        }
    }
}
