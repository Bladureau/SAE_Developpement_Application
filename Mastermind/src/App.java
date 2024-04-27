import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.StageStyle;
import javafx.stage.Stage;


/*
 * new Scene(<root>, <color>)
 * new Scene(<root>, <weight>, <height>, <color>)
 */




public class App extends Application 
{
    @Override
    public void start(Stage primaryStage) throws Exception 
    {
        /*
          * Type pour le StageStyle : 
          * DECORATED → On garde les boutons de la barre de titre
          * UNDECORATED → On ne garde pas les boutons de la barre de titre 
          * TRANSPARENT → On garde les boutons de la barre de titre mais on les rend invisibles
        */
        // primaryStage.initStyle(StageStyle.UNDECORATED);

        Color black = Color.BLACK;      // permet de définir la couleur du fond de la page qui s'ouvre. Ex : ici elle est noir 
        Scene sc = new Scene(new Group(), 1280.0, 720.0, black);        //new Scene(<root>, <weight>, <height>, <color>)
        primaryStage.setScene(sc);      // Affecte la scene à la fenêtre
        primaryStage.setTitle("MasterMind");        // Change le titre de la fenetre de l'app

        primaryStage.show();            // Montre la scene
    }

    public static void main(String[] args) {
        launch(args);
    }
}