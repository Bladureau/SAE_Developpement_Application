package iut.info1.sae.controleur;

import iut.info1.sae.Mastermind;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ControleurPage1 {

    @FXML
    private VBox BoutonJouerVBox;

    @FXML
    private Button btnJouerAmi;

    @FXML
    private Button btnJouerContreOrdi;

    @FXML
    private Button btnQuitterApp;

    @FXML
    private Label labelTitre;

    @FXML
    private HBox quitterHbox;

    @FXML
    private VBox vBoxAccueil;

    @FXML
    void btnJouerContreOrdi(ActionEvent event) {
        if () { // TODO faire en sorte qu'il detecte qu'il y ai un fichier et acive la page 
            
            Mastermind.activerPremiereBisPage();
        } else {
            Mastermind.activerDeuxiemePage();
        }
    }

    @FXML
    void btnJouerAmi(ActionEvent event) {
        if () { // TODO faire en sorte qu'il detecte qu'il y ai un fichier et acive la page 
            Mastermind.activerPremiereBisPage();
        } else {
            Mastermind.activerDeuxiemePage();
        }
    }

    @FXML
    void btnQuitterApp(ActionEvent event) {
        System.exit(0);
    }

}