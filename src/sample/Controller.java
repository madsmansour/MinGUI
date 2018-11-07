package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;



public class Controller {

    // bruger scenecontrol til text field og text area
    @FXML
    public TextField commandFieldx;
    public TextArea textArea;
    public Image billede;

    // En metode til knappen CommandButton
    public void CommandButton(ActionEvent actionEvent) {

        // laver en string variabel s som tager teksten fra textfieldet
        String s = commandFieldx.getText();

        System.out.println("Klik " + s);

        // Clearer textfieldet efter hvert input
        commandFieldx.clear();

        // får textarea til at hente text fra string s, samt lave en ny linje hvor næste input bliver sat ind.
        textArea.setText(textArea.getText() + "Der er indtastet: " + s + "\n");

    }
}