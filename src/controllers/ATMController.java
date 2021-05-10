package controllers;

import ATM.Account;
import ATM.Main;
import ATM.Management;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import static ATM.Main.stg;
import static ATM.Main.account;
import static ATM.Main.m;

public class ATMController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private Button button;

    @FXML
    private Label inform;

    @FXML
    private TextField id;

    @FXML
    private PasswordField pin;

    @FXML
    public void userLogin(ActionEvent event) throws Exception {
        ArrayList<Account> list = m.insertData();
        for (int i = 0; i < 5; i++) {
            int textID = Integer.parseInt(id.getText());
            int pass = Integer.parseInt(pin.getText());
            if (textID > list.size()) {
                inform.setText("ID is invalid");
            }

            if (list.get(textID - 1).getPassword() == pass) {
                inform.setText("Login successfully");
                account = list.get(textID - 1);
                System.out.println(account.balance);
                Parent pane = FXMLLoader.load(getClass().getResource("../graphics/afterLogin.fxml"));
                stg.getScene().setRoot(pane);
            } else {
                inform.setText("PIN is incorrect!");
                id.clear();
                pin.clear();
            }
        }
        inform.setText("Login unsuccessfully && the card is locked");
    }

}
