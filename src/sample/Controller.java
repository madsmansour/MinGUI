package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    public TextField commandFieldx;

    public void CommandButton(ActionEvent actionEvent) {
       String s = commandFieldx.getText();
        System.out.println("Klik" + s);
    }


}
