package iut.info1.sae.controleur;

import iut.info1.sae.Mastermind;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ControleurPage1 {

    @FXML
    private Button btnJouerContreOrdi;

    @FXML
    private HBox quitterHbox;

    @FXML
    private HBox hboxButton;

    @FXML
    private Button btnJouerAmi;

    @FXML
    private VBox vBoxAccueil;

    @FXML
    private Button btnQuitterApp;

    @FXML
    void btnJouerContreOrdi(ActionEvent event) {
        Mastermind.activerPremiereBisPage();
    }

    @FXML
    void btnJouerAmi(ActionEvent event) {
        Mastermind.activerPremiereBisPage();
    }

    @FXML
    void btnQuitterApp(ActionEvent event) {
        System.exit(0);
    }

}


