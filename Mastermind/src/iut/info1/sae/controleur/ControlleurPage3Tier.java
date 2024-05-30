package iut.info1.sae.controleur;

import iut.info1.sae.Mastermind;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ControleurPage3Tier {

    @FXML
    private TextField tfJoueur1;

    public TextField getNomJoueur1() {
        return tfJoueur1;
    }
}
