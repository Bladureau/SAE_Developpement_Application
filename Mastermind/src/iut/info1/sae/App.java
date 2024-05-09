package iut.info1.sae;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Variables globale
        primaryStage.setTitle("Mastermind");
        primaryStage.setHeight(400);
        primaryStage.setWidth(300);
        
        // Page de présentation du mastermind 
        VBox page1VBox = new VBox(20);
        page1VBox.setAlignment(Pos.CENTER);
        
        // Image de fond (Pour remplacer l'image il faut modifier Mastermind_boite.jpg)
        page1VBox.setBackground(new Background(new BackgroundImage((new Image("Mastermind_boite.jpg")), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT,new BackgroundPosition(Side.LEFT, 0, true, Side.BOTTOM, 0, true), new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true))));
        
        //Bouton
        Button btnJouerAvecUnAmi = new Button("Jouer avec un ami");
        Button btnJouerAvecUnOrdi = new Button("Jouer avec un ordi");
        
        // Héritage des champs 
        page1VBox.getChildren().addAll(btnJouerAvecUnAmi, btnJouerAvecUnOrdi);
        
        // Affichage de la page de présentation
        Scene page1Scene = new Scene(page1VBox);
        primaryStage.setScene(page1Scene);
        primaryStage.show();

        // Page 2.1 - Jouer avec un ami
        btnJouerAvecUnAmi.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
                primaryStage.setHeight(300);
                primaryStage.setWidth(600);                
                VBox page2AmiVBox = new VBox(40);
                page2AmiVBox.setAlignment(Pos.CENTER);

                // Image de fond 
                page2AmiVBox.setBackground(new Background(new BackgroundImage(new Image("Fond_blanc.png"), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT,new BackgroundPosition(Side.LEFT, 0, true, Side.BOTTOM, 0, true), new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true))));
        
                // HBox pour jouer avec boutons 
                HBox buttonHBox = new HBox(20);
                buttonHBox.setAlignment(Pos.CENTER);
                Button btnCommencerPartie = new Button("Commencer une nouvelle partie");
                Button btnContinuerPartie = new Button("Continuer la partie précédente");

                // HBox pour retourner en arrière
                HBox btnReturnHBox = new HBox();
                btnReturnHBox.setAlignment(Pos.CENTER);
                Button btnRetourEnArriere = new Button("Retour au menu précédent");

                //Héritage des champs
                buttonHBox.getChildren().addAll(btnCommencerPartie, btnContinuerPartie);
                btnReturnHBox.getChildren().add(btnRetourEnArriere);
                page2AmiVBox.getChildren().addAll(buttonHBox, btnReturnHBox);

                // Affichage de la page pour jouer avec un ami
                Scene page2Ami = new Scene(page2AmiVBox);
                primaryStage.setScene(page2Ami);
                primaryStage.show();

                btnRetourEnArriere.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        primaryStage.setHeight(400);
                        primaryStage.setWidth(300);
                        primaryStage.setScene(page1Scene);
                        primaryStage.show();
                    }
                });
		}});

        // Page 2.2 - Jouer avec un ordi
        btnJouerAvecUnOrdi.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
                primaryStage.setHeight(300);
                primaryStage.setWidth(600);                
                VBox page2OrdiVBox = new VBox(40);
                page2OrdiVBox.setAlignment(Pos.CENTER);

                // Image de fond 
                page2OrdiVBox.setBackground(new Background(new BackgroundImage(new Image("Fond_blanc.png"), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT,new BackgroundPosition(Side.LEFT, 0, true, Side.BOTTOM, 0, true), new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true))));
        
                // HBox pour jouer avec boutons 
                HBox buttonHBox = new HBox(20);
                buttonHBox.setAlignment(Pos.CENTER);
                Button btnCommencerPartie = new Button("Commencer une nouvelle partie");
                Button btnContinuerPartie = new Button("Continuer la partie précédente");

                // HBox pour retourner en arrière
                HBox btnReturnHBox = new HBox();
                btnReturnHBox.setAlignment(Pos.CENTER);
                Button btnRetourEnArriere = new Button("Retour au menu précédent");

                //Héritage des champs
                buttonHBox.getChildren().addAll(btnCommencerPartie, btnContinuerPartie);
                btnReturnHBox.getChildren().add(btnRetourEnArriere);
                page2OrdiVBox.getChildren().addAll(buttonHBox, btnReturnHBox);

                // Affichage de la page pour jouer avec un ami
                Scene page2Ami = new Scene(page2OrdiVBox);
                primaryStage.setScene(page2Ami);
                primaryStage.show();

                btnRetourEnArriere.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        primaryStage.setHeight(400);
                        primaryStage.setWidth(300);
                        primaryStage.setScene(page1Scene);
                        primaryStage.show();
                    }
                });
			}
		});

    }

    public static void main(String[] args) {
        launch(args);
    }
}