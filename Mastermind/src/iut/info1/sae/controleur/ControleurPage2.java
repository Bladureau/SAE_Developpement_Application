package iut.info1.sae.controleur;

import iut.info1.sae.Mastermind;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ControleurPage2 {

    @FXML
    private Button btnRetour;

    @FXML
    private HBox joueur1HBox;

    @FXML
    private VBox joueurVBox;

    @FXML
    private Label labelJoueur1;

    @FXML
    private Label labelJoueur2;

    @FXML
    private TextField tfJoueur1;

    @FXML
    private TextField tfJoueur2;

    @FXML
    void btnRetour(ActionEvent event) {
        Mastermind.activerPremierePage();
    }

    public TextField getNomJoueur1() {
        return tfJoueur1;
    }

    public TextField getNomJoueur2() {
        return tfJoueur2;
    }
}
