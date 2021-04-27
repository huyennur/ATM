package controllers;

import ATM.Account;
import ATM.Main;
import ATM.Management;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import static javafx.application.Platform.exit;

public class ATMController implements Initializable {

    Management m = new Management();
    ArrayList<Account> list = m.insertData();

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

    public int getPass() {
        int pass = Integer.parseInt(pin.getText());
        return pass;
    }

    @FXML
    public void userLogin(ActionEvent event) throws Exception {
        Main main = new Main();
        Management m = new Management();
        ArrayList<Account> list = m.insertData();
        for (int i = 0; i < 5; i++) {
            int textID = Integer.parseInt(id.getText());
            if (textID > list.size()) {
                inform.setText("ID is invalid");
            }


            if (list.get(textID - 1).getPassword() == getPass()) {
                inform.setText("Login success");
                main.changeScene("../graphics/afterLogin.fxml");
            } else {
                inform.setText("PIN is incorrect!");
                id.clear();
                pin.clear();
            }
        }
        inform.setText("Login unsuccessfully && the card is locked");
        main.stop();
    }



}
