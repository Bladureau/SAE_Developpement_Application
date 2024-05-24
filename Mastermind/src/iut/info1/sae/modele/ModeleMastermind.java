package iut.info1.sae.modele;

public class ModeleMastermind {

    private static final String[] COULEURS = {""};

    public static void main(String[] args) {
        // TODO : definir toutes les couleurs

        // initialisation des constantes
        final int TAILLE_COMBINAISON = 4;
        final int NOMBRE_MAX_DE_COUP = 12;

        // initialisation des variables
        int nbDeCoup = 0;
        int nbDeManche = 0;
        int i = 0;
        int[] nbDeCouleurMalPlace = {0};
        int[] nbDeCouleurBienPlace = {0};
        String[] combinaisonCouleurJ1 = new String[TAILLE_COMBINAISON];
        String[] combinaisonCouleurJ2 = new String[TAILLE_COMBINAISON];
        String[] tamponCombinaisonCouleurJ1 = new String[TAILLE_COMBINAISON];
        //boolean finPartie = false;


        // combinaison que le joueur 1 choisi
        combinaisonCouleurJ1[0] = "bleu";
        combinaisonCouleurJ1[1] = "rose";
        combinaisonCouleurJ1[2] = "blanc";
        combinaisonCouleurJ1[3] = "bleu";

        // le tableau de base devra etre vide et c'est le joueur qu choisira les couleurs
        /*
        while (!finPartie) {
        */
            // initialisation du tampon des couleurs du j1 pour travailler dessus sans modifier le reel code couleur
            tamponCombinaisonCouleurJ1 = combinaisonCouleurJ1;
        
            // Selection des couleurs pour le J2
            // TODO : selectionner les couleurs en cochant les cases dans une liste deroulante sur chaque cases vide
            
            // a suprimer des que le TODO du dessus est fait
            combinaisonCouleurJ2[0] = "bleu";
            combinaisonCouleurJ2[1] = "gris";
            combinaisonCouleurJ2[2] = "rose";
            combinaisonCouleurJ2[3] = "rose";


            //verification des 2 codes couleur ...
            // ... bonne couleur et bien place
            System.out.println("verification des bonnes couleurs bien place : ");
            for(i = 0; i<TAILLE_COMBINAISON; i++){
                System.out.println("verification de la " + i+1 + "eme couleur");
                if (combinaisonCouleurJ1[i] == combinaisonCouleurJ2[i]) {
                    System.out.println("la couleur " + combinaisonCouleurJ2[i] + " est bien place");
                    combinaisonCouleurJ2[i] = null;
                    tamponCombinaisonCouleurJ1[i] = null;
                    nbDeCouleurBienPlace[nbDeCoup]++;
                } else {
                    System.out.println("la couleur " + combinaisonCouleurJ2[i] + " est fausse");
                }
                System.out.println("nombre de couleur bien place : " + nbDeCouleurBienPlace[nbDeCoup] + " \nfin de la " + i+1 + "eme couleur");
            }
            // ... bonne couleur mais mal place
            System.out.println("verification des bonnes couleurs mal place : ");
            for(i = 0; i < TAILLE_COMBINAISON; i++){
                System.out.println("verification de la " + i+1 + "eme couleur");
                if (combinaisonCouleurJ2[i] != null) {
                    for(int j = 0; j<TAILLE_COMBINAISON; j++){
                        System.out.println("comparaison de la " + combinaisonCouleurJ2[i] + " couleur avec toutes les couleurs du J1");
                        if (combinaisonCouleurJ2[i] == combinaisonCouleurJ1[j]) {
                            System.out.println("la couleur " + combinaisonCouleurJ2[i] + " est presente");
                            combinaisonCouleurJ2[i] = null;
                            tamponCombinaisonCouleurJ1[j] = null;
                            nbDeCouleurMalPlace[nbDeCoup]++;
                        } else {
                            System.out.println("la couleur " + combinaisonCouleurJ2[i] + " n'est pas presente");
                        }
                    }
                } else {
                    System.out.println(combinaisonCouleurJ2[i] + "couleur deja verifie");
                }
                System.out.println("nombre de bonne couleur mal place : " + nbDeCouleurMalPlace[nbDeCoup] + " \nfin de la " + i + "eme couleur");
            }

            System.out.println("couleur bien place : " + nbDeCouleurBienPlace[nbDeCoup]);
            System.out.println("couleur mal place : " + nbDeCouleurMalPlace[nbDeCoup] + " \nfin de la verification");


            
            /*
            // verification d'une potentielle fin de manche
            if (nbDeCouleurBienPlace[nbDeCoup] == TAILLE_COMBINAISON) {
                finPartie = true;
            } else {
                nbDeCoup++;
                if (nbDeCoup==NOMBRE_MAX_DE_COUP) {
                    finPartie = true;
                }
            }
        }
            */
            
                
    }
}
