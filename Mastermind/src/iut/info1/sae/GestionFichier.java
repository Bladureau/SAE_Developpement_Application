package iut.info1.sae;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GestionFichier {


    public static void ecritureFichier() {
        try {
            FileWriter writer = new FileWriter("sauvergarde.txt");

            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void effacerFichier() {
        File myFile = new File("C:\\Users\\bapti\\OneDrive\\Bureau\\JavaProject\\Servieres\\SAE\\Mastermind\\sauvergarde.txt");
        if(myFile.delete()) { 
            System.out.println("Fichier supprimé avec succès"); 
        }
    }
}
