package iut.info1.sae;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.paint.Color;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.StageStyle;
import javafx.stage.Stage;
import javax.swing.*;
import java.awt.event.*;


public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {


        /*
          * Type pour le StageStyle : 
          * DECORATED → On garde les boutons de la barre de titre
          * UNDECORATED → On ne garde pas les boutons de la barre de titre 
          * TRANSPARENT → On garde les boutons de la barre de titre mais on les rend invisibles
        */
        
        // primaryStage.initStyle(StageStyle.UNDECORATED);
        Parent page1 = FXMLLoader.load(getClass().getResource("page_1.fxml"));
        Scene scene = new Scene(page1);
        primaryStage.setTitle("MasterMind");
        primaryStage.setScene(scene);
        primaryStage.show();

        

        /* 
        // Color black = Color.BLACK;      // permet de définir la couleur du fond de la page qui s'ouvre. Ex : ici elle est noir 
        scene = new Scene(new Group(), 1280.0, 720.0);        //new Scene(<root>, <weight>, <height>, <color>)
        primaryStage.setScene(scene);      // Affecte la scene à la fenêtre
        primaryStage.setTitle("MasterMind");        // Change le titre de la fenetre de l'app
        primaryStage.show();            // Montre la scene
        */
    }

    public static void main(String[] args) {
        launch(args);
    }

    /*
    private class Clicklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btnCommencer) {
                label.setText("Bouton 1 clicked!");
            }
            if (e.getSource() == button2) {
                label.setText("Bouton 2 clicked!");
            }
        }
    }
    */
}