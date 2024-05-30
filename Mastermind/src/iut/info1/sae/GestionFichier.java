package iut.info1.sae;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import javafx.beans.property.StringProperty;

public class GestionFichier {

    private StringProperty nomJoueur1;

    private StringProperty nomJoueur2;

    public String getNomJoueur1() {
        return nomJoueur1.get();
    }

    public StringProperty nomJoueur1Property() {
        return nomJoueur1;
    }

    public String getNomJoueur2() {
        return nomJoueur2.get();
    }

    public StringProperty nomJoueur2Property() {
        return nomJoueur2;
    }

    public static void effacerFichier() {
        File myFile = new File("sauvergarde.json");
        if(myFile.delete()) { 
            System.out.println("Fichier supprimé avec succès"); 
        }
    }

    public static void sauvergarde(JSONObject sauvegarde) {
        // Déclaration du FileChoser
        File file = new File("sauvergarde.json");

        if (file.exists()) {
            GestionFichier.effacerFichier();
        }

        if (file != null) {
            //Si l'extension n'est pas bien renseignée on l'ajoute
            if (!file.getPath().endsWith(".json")) file = new File(file.getPath() + ".json");
            //On écrit le fichier avec un try..catch en cas d'erreur
            try (FileWriter fichier = new FileWriter(file)) {
                fichier.write(sauvegarde.toJSONString());
                fichier.flush();
                } catch (IOException e){
                  //On affiche l'erreur en console
                  System.out.println(e.getMessage());
                }
        }
    }
}
