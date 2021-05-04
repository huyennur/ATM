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
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

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

    @FXML
    public void userLogin(ActionEvent event) throws Exception {
        Main main = new Main();
        Management m = new Management();
        ArrayList<Account> list = m.insertData();
        for (int i = 0; i < 5; i++) {
            int textID = Integer.parseInt(id.getText());
            int pass = Integer.parseInt(pin.getText());
            if (textID > list.size()) {
                inform.setText("ID is invalid");
            }

            if (list.get(textID - 1).getPassword() == pass) {
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
