package iut.info1.sae.controleur;

import iut.info1.sae.Mastermind;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ControleurPage1bis {

    @FXML
    private VBox page1BisVBox;

    @FXML
    private HBox buttonJouerHBox;

    @FXML
    private Button btnReprendrePartie;
    
    @FXML
    private Button btnCommencerPartie;

    @FXML
    private HBox buttonRetourHBox;

    @FXML
    private Button btnRetour;


    @FXML
    void btnReprendrePartie(ActionEvent event) {
        Mastermind.activerDeuxiemePage();
    }

    @FXML
    void btnCommencerPartie(ActionEvent event) {
        Mastermind.activerDeuxiemePage();
    }

    @FXML
    void btnRetour(ActionEvent event) {
        Mastermind.activerPremierePage();
    }

}
