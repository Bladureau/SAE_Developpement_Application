package iut.info1.sae;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Mastermind extends Application {

    /** Page 1 de l'application */  
    private static Scene scenePremierePage;

    /** Page 1bis de l'application */
    private static Scene scenePremiereBisPage;

    /** Page 1tier de l'application */
    private static Scene scenePremiereTierPage;

    /** Page 2 de l'application */
    private static Scene sceneDeuxiemePage;

    /** Page 3 de l'application */
    private static Scene sceneTroisiemePage;

    /** Fenêtre principale de l'application
     * La scène qui lui est associée sera modifiée en fonction
     * des clics de l'utilisateur
     */
    private static Stage fenetrePrincipale;

    
    /**
     * Permet de modifier la scène de la fênetre principale
     * pour qu'elle devienne celle de la page 2
     */
    public static void activerPremierePage() {
        fenetrePrincipale.setScene(scenePremierePage);
    }

    /**
     * Permet de modifier la scène de la fênetre principale
     * pour qu'elle devienne celle de la page 1bis 
     */
    public static void activerPremiereBisPage() {
        fenetrePrincipale.setScene(scenePremiereBisPage);
    }

    /**
     * Permet de modifier la scène de la fênetre principale
     * pour qu'elle devienne celle de la page 1tier
     */
    public static void activerPremiereTierPage() {
        fenetrePrincipale.setScene(scenePremiereTierPage);
    }

    /**
     * Permet de modifier la scène de la fênetre principale
     * pour qu'elle devienne celle de la page 2
     */
    public static void activerDeuxiemePage() {
        fenetrePrincipale.setScene(sceneDeuxiemePage);
    }

    public static void activerTroisiemePage() {
        fenetrePrincipale.setScene(sceneTroisiemePage);
    }

    public static void creerSauvegarde() {
        GestionFichier.ecritureFichier();
    }

    public static void supprimerSauvergarde() {
        GestionFichier.effacerFichier();
        fenetrePrincipale.setScene(sceneDeuxiemePage);
    }

    
    @Override
    public void start(Stage primaryStage) {

        try {
            /* 
             * Chargement de la premiere page de l'application 
             * dans le conteneur de type Parent 
             */
            FXMLLoader chargeurFXMLPremierePage = new FXMLLoader();
            chargeurFXMLPremierePage.setLocation(getClass().getResource("page1.fxml"));
            Parent conteneur= chargeurFXMLPremierePage.load();
            scenePremierePage = new Scene(conteneur);         //Scene([nom du Parent], [Height], [Witdth])
            
            FXMLLoader chargeurFXMLPremiereBisPage = new FXMLLoader();
            chargeurFXMLPremiereBisPage.setLocation(getClass().getResource("page1bis.fxml"));
            conteneur = chargeurFXMLPremiereBisPage.load();
            scenePremiereBisPage = new Scene(conteneur);     //Scene([nom du Parent], [Height], [Witdth])

            FXMLLoader chargeurFXMLPremiereTierPage = new FXMLLoader();
            chargeurFXMLPremiereTierPage.setLocation(getClass().getResource("page1tier.fxml"));
            conteneur = chargeurFXMLPremiereTierPage.load();
            scenePremiereTierPage = new Scene(conteneur);     //Scene([nom du Parent], [Height], [Witdth])
            
            FXMLLoader chargeurFXMLDeuxiemePage = new FXMLLoader();
            chargeurFXMLDeuxiemePage.setLocation(getClass().getResource("page2.fxml"));
            conteneur = chargeurFXMLDeuxiemePage.load();
            sceneDeuxiemePage = new Scene(conteneur);         //Scene([nom du Parent], [Height], [Witdth])

            FXMLLoader chargeurFXMLTroisiemePage = new FXMLLoader();
            chargeurFXMLTroisiemePage.setLocation(getClass().getResource("page3.fxml"));
            conteneur = chargeurFXMLTroisiemePage.load();
            sceneTroisiemePage = new Scene(conteneur);
            
            // on définit le titre, la hauteur et la largeur de la fenêtre principale
            primaryStage.setTitle("Mastermind");
            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.setScene(scenePremierePage);
            fenetrePrincipale = primaryStage;
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}