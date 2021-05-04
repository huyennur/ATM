package controllers;

import ATM.Account;
import ATM.Main;
import ATM.Management;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.io.IOException;
import java.util.ArrayList;


public class WithdrawController {

    Management m = new Management();
    Account account = new Account();
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
        Main main = new Main();
        if(event.getSource() == endWithdraw) {
            main.changeScene("../graphics/mainATM.fxml");
        }
    }


}
