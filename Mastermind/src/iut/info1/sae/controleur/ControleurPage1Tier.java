package iut.info1.sae.controleur;

import iut.info1.sae.Mastermind;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class ControleurPage1Tier {

    @FXML
    private Button bntAnnulerSupprimer;

    @FXML
    private Button btnConfirmerSupprimer;

    public void initialize() {
        Mastermind.creerSauvegarde();
    }

    @FXML
    void bntAnnulerSupprimer(ActionEvent event) {
        Mastermind.activerPremiereBisPage();
    }

    @FXML
    void btnConfirmerSupprimer(ActionEvent event) {
        Mastermind.supprimerSauvergarde();
        Mastermind.activerDeuxiemePage();
    }

}
