package controllers;

import ATM.Account;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.io.IOException;
import java.util.ArrayList;

import static ATM.Main.*;


public class WithdrawController {

    ArrayList<Account> list = m.insertData();

    @FXML
    private TextField enterAmount;

    @FXML
    private Button confirmWithdraw;

    @FXML
    private Button endWithdraw;

    @FXML
    private Text textWithdraw;

    @FXML
    public void confirmWithdrawal(ActionEvent event) throws IOException {
        double amount = Integer.parseInt(enterAmount.getText());
        if (event.getSource() == confirmWithdraw) {
            textWithdraw.setText(account.withdraw(amount));
            enterAmount.clear();
            m.updateData(list);
        }
    }

    @FXML
    public void endWithdrawal(ActionEvent event) throws IOException {
        if(event.getSource() == endWithdraw) {
            Parent pane = FXMLLoader.load(getClass().getResource("../graphics/afterLogin.fxml"));
            stg.getScene().setRoot(pane);
        }
    }


}
