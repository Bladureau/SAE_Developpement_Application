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
import javafx.stage.StageStyle;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Variables globales
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setTitle("Mastermind");

        // Dépend de l'image de fond
        primaryStage.setHeight(400);                        // A modifier si la hauteur de l'image change
        primaryStage.setWidth(300);                         // A modifier si la largeur de l'image change 
        
        // Page de présentation du mastermind 
        VBox page1VBox = new VBox(20);
        page1VBox.setAlignment(Pos.CENTER);
        
        /*
         * Image de fond (Pour remplacer l'image il faut modifier Mastermind_boite.jpg)
         */
        page1VBox.setBackground(new Background(new BackgroundImage((new Image("Mastermind_boite.jpg")), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT,new BackgroundPosition(Side.LEFT, 0, true, Side.BOTTOM, 0, true), new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true))));
        
        // HBox pour les boutons qui permettent de jouer
        HBox btnJouerHBox = new HBox(40);
        btnJouerHBox.setAlignment(Pos.CENTER);
        Button btnJouerAvecUnAmi = new Button("Jouer avec un ami");
        Button btnJouerAvecUnOrdi = new Button("Jouer avec un ordi");

        // Boutton pour quitter l'application
        Button btnQuitterApp = new Button("Quitter l'application");
        
        // Héritage des champs
        btnJouerHBox.getChildren().addAll(btnJouerAvecUnAmi, btnJouerAvecUnOrdi);
        page1VBox.getChildren().addAll(btnJouerHBox, btnQuitterApp);

        /**
         * Boutton qui permet de quitter l'application
         */
        btnQuitterApp.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
         
        // Affichage de la page de présentation
        Scene page1Scene = new Scene(page1VBox);
        primaryStage.setScene(page1Scene);
        primaryStage.show();
        
        /**
         * Boutton qui permet de jouer avec un ami
         */
        btnJouerAvecUnAmi.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
                primaryStage.setHeight(300);                        // A modifier si la hauteur de l'image change
                primaryStage.setWidth(600);                         // A modifier si la largeur de l'image change
                VBox page2AmiVBox = new VBox(40);
                page2AmiVBox.setAlignment(Pos.CENTER);

                // Image de fond (Pour remplacer l'image il faut modifier Fond_blanc.png)
                page2AmiVBox.setBackground(new Background(new BackgroundImage(new Image("Fond_blanc.png"), BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT,new BackgroundPosition(Side.LEFT, 0, true, Side.BOTTOM, 0, true), new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, false, true))));
                
                // HBox pour jouer au Mastermind
                HBox buttonHBox = new HBox(20);
                buttonHBox.setAlignment(Pos.CENTER);
                Button btnCommencerPartie = new Button("Commencer une nouvelle partie");
                Button btnContinuerPartie = new Button("Continuer la partie précédente");

                // HBox pour au menu principal
                HBox btnReturnHBox = new HBox();
                btnReturnHBox.setAlignment(Pos.CENTER);
                Button btnRetourEnArriere = new Button("Retour au menu précédent");

                // Héritage des champs
                buttonHBox.getChildren().addAll(btnCommencerPartie, btnContinuerPartie);
                btnReturnHBox.getChildren().add(btnRetourEnArriere);
                page2AmiVBox.getChildren().addAll(buttonHBox, btnReturnHBox);

                // Affichage de la page pour jouer avec un ami
                Scene page2Ami = new Scene(page2AmiVBox);
                primaryStage.setScene(page2Ami);
                primaryStage.show();

                /*
                 * Fonction pour retourner sur le menu principal
                 */
                btnRetourEnArriere.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        primaryStage.setHeight(400);                    // A modifier si la hauteur de l'image change
                        primaryStage.setWidth(300);                     // A modifier si la largeur de l'image change
                        primaryStage.setScene(page1Scene);
                        primaryStage.show();
                    }
                });
		}});

        /**
         * Fonction qui permet de jouer avec un ordi
         */
        btnJouerAvecUnOrdi.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
                primaryStage.setHeight(300);                            // A modifier si la hauteur de l'image change
                primaryStage.setWidth(600);                             // A modifier si la largeur de l'image change
                VBox page2OrdiVBox = new VBox(40);
                page2OrdiVBox.setAlignment(Pos.CENTER);

                // Image de fond (Pour remplacer l'image il faut modifier Fond_blanc.png)
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

                /**
                 * Fonction qui permet de retourner sur le menu principal
                 */
                btnRetourEnArriere.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        primaryStage.setHeight(400);                    // A modifier si on change l'image de fond
                        primaryStage.setWidth(300);                     // A modifier si on change l'image de fond
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