import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;

public class MainSceneController {

    @FXML
    private Button btnAmi;

    @FXML
    private Button btnOrdi;

    @FXML
    private Button btnCommencer;

    @FXML
    private Button btnReprendre;

    @FXML
    void btnAmiClicked(ActionEvent event) throws IOException {
        if (btnAmi.isPressed()) {
            Parent page2Ami = FXMLLoader.load(getClass().getResource("page_2_ami.fxml"));
            Scene scene = new Scene(page2Ami);
        }
    }

    @FXML
    void btnOrdiClicked(ActionEvent event) {

    }

    @FXML
    void btnCommencerClicked(ActionEvent event) {

    }

    @FXML
    void btnReprendreClicked(ActionEvent event) {
        
    }

}
