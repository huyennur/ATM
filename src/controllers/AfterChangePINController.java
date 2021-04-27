package controllers;

import ATM.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.io.IOException;

public class AfterChangePINController {

    @FXML
    private Button endChangePIN;

    @FXML
    private Text showStateChangePIN;

    @FXML
    void endPINChanging(ActionEvent event) throws IOException {
        showStateChangePIN.setText("Successful!");
        Main main = new Main();
        if(event.getSource() == endChangePIN) {
            main.changeScene("../graphics/mainATM.fxml");
        }
    }

}
