package iut.info1.sae.controleur;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

import iut.info1.sae.GestionFichier;
import iut.info1.sae.Mastermind;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;

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

    @SuppressWarnings("unchecked")
    @FXML 
    void btnSuivant(ActionEvent event) {
        JSONObject sauvegarde = new JSONObject();
        sauvegarde.put("Joueur1", tfJoueur1.getText());
        sauvegarde.put("Joueur2", tfJoueur2.getText());
        GestionFichier.sauvergarde(sauvegarde);
        //Mastermind.activerTroisiemePage();
    }
}
