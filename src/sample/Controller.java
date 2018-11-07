package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    public TextField commandFieldx;
    public TextArea textArea;

    public void CommandButton(ActionEvent actionEvent) {
        String s = commandFieldx.getText();
        System.out.println("Klik " + s);
        commandFieldx.clear();
        textArea.setText("Der er indtastet: " + s);

    }

}