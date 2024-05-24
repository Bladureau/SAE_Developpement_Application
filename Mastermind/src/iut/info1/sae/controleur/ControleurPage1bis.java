package iut.info1.sae.controleur;

import iut.info1.sae.Mastermind;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ControleurPage1bis {

    @FXML
    private Button btnNePasContinuezLaPartie;

    @FXML
    private Button btnReprendrePartie;

    @FXML
    private Button btnRetour;

    @FXML
    private HBox buttonJouerHBox;

    @FXML
    private HBox buttonRetourHBox;

    @FXML
    private VBox page1bisVBox;

    @FXML
    void btnNePasContinuezLaPartie(ActionEvent event) {
        Mastermind.activerPremiereTierPage();
    }

    @FXML
    void btnReprendrePartie(ActionEvent event) {
        Mastermind.activerDeuxiemePage();
    }

    @FXML
    void btnRetour(ActionEvent event) {
        Mastermind.activerPremierePage();
    }
}
