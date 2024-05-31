package iut.info1.sae.modele;

public class ModeleMastermindOrdinateur {

    private static final String[] COULEURS = {"Bleu", "Rose", "Jaune", "Rouge", "Orange", "Marron", "Gris", "Blanc", "Vert", "Violet"};

    public static void Ordinateur {
        // TODO : definir toutes les couleurs

        // initialisation des constantes
        final int TAILLE_COMBINAISON = 4;
        final int NOMBRE_MAX_DE_COUP = 12;

        // initialisation des variables
        int nbDeCoup = 0;
        int nbDeManche = 0;
        int i = 0;
        int[] nbDeCouleurMalPlace = new int[NOMBRE_MAX_DE_COUP];
        int[] nbDeCouleurBienPlace = new int[NOMBRE_MAX_DE_COUP];
        String[] combinaisonCouleurOrdinateur = new String[TAILLE_COMBINAISON];
        String[] combinaisonCouleurJ1 = new String[TAILLE_COMBINAISON];
        String[] tamponCombinaisonCouleurOrdinateur = new String[TAILLE_COMBINAISON];
        //boolean finPartie = false;
        boolean J1 = false;
        String nomJ1 = "Lucas";


        // combinaison que l'oridinateur choisi
        combinaisonCouleurOrdinateur[0] = "bleu";
        combinaisonCouleurOrdinateur[1] = "rose";
        combinaisonCouleurOrdinateur[2] = "blanc";
        combinaisonCouleurOrdinateur[3] = "bleu";

        // le tableau de base devra etre vide et c'est le joueur qu choisira les couleurs
/*
        while (!finPartie) {
            nbDeCoup++;
*/
            // initialisation du tampon des couleurs de l'Ordinateur pour travailler dessus sans modifier le reel code couleur
            for (i = 0; i<TAILLE_COMBINAISON; i++){
                tamponCombinaisonCouleurOrdinateur[i] = combinaisonCouleurOrdinateur[i];
            }
        
            // Selection des couleurs pour le J1
            // TODO : selectionner les couleurs en cochant les cases dans une liste deroulante sur chaque cases vide
            
            // a suprimer des que le TODO du dessus est fait
            combinaisonCouleurJ1[0] = "bleu";
            combinaisonCouleurJ1[1] = "gris";
            combinaisonCouleurJ1[2] = "rose";
            combinaisonCouleurJ1[3] = "rose";


            //verification des 2 codes couleur ...
            // ... bonne couleur et bien place
            //System.out.println("verification des bonnes couleurs bien place : ");
            for(i = 0; i<TAILLE_COMBINAISON; i++){
                //System.out.println("verification de la " + i + "eme couleur");
                if (combinaisonCouleurOrdinateur[i] == combinaisonCouleurJ1[i]) {
                    //System.out.println("la couleur " + combinaisonCouleurJ1[i] + " est bien place");
                    combinaisonCouleurJ1[i] = null;
                    tamponCombinaisonCouleurOrdinateur[i] = null;
                    nbDeCouleurBienPlace[nbDeCoup]++;
                } else {
                    //System.out.println("la couleur " + combinaisonCouleurJ1[i] + " est fausse");
                }
                //System.out.println("nombre de couleur bien place : " + nbDeCouleurBienPlace[nbDeCoup] + " \nfin de la " + i + "eme couleur");
            }
            // ... bonne couleur mais mal place
            //System.out.println("verification des bonnes couleurs mal place : ");
            for(i = 0; i < TAILLE_COMBINAISON; i++){
                //System.out.println("verification de la " + i + "eme couleur");
                if (combinaisonCouleurJ1[i] != null) {
                    for(int j = 0; j<TAILLE_COMBINAISON; j++){
                        //System.out.println("comparaison de la " + combinaisonCouleurJ1[i] + " couleur avec toutes les couleurs de l'Ordinateur");
                        if (combinaisonCouleurJ1[i] == combinaisonCouleurOrdinateur[j]) {
                            //System.out.println("la couleur " + combinaisonCouleurJ1[i] + " est presente");
                            combinaisonCouleurJ1[i] = null;
                            tamponCombinaisonCouleurOrdinateur[j] = null;
                            nbDeCouleurMalPlace[nbDeCoup]++;
                        } else {
                            //System.out.println("la couleur " + combinaisonCouleurJ1[i] + " n'est pas presente");
                        }
                    }
                } else {
                    //System.out.println(combinaisonCouleurJ1[i] + "couleur deja verifie");
                }
                //System.out.println("nombre de bonne couleur mal place : " + nbDeCouleurMalPlace[nbDeCoup] + " \nfin de la " + i + "eme couleur");
            }

            //System.out.println("couleur bien place : " + nbDeCouleurBienPlace[nbDeCoup]);
            //System.out.println("couleur mal place : " + nbDeCouleurMalPlace[nbDeCoup] + " \nfin de la verification");


            
/*
            // verification d'une potentielle fin de manche pour le J1
            
            if (nbDeCouleurBienPlace[nbDeCoup] == TAILLE_COMBINAISON) {
                finPartie = true;
                J1 = true;
            } else if (nbDeCoup=>NOMBRE_MAX_DE_COUP) {
                    finPartie = true;
            }
        }
*/
        // calcul des pts a la fin de la premiere manche
        if (J1 == true) {
            // faire une page a la place des system.out.println
            System.out.println("Bravo " + nomJ1 + ", vous venez de remporter la partie");
            if (nbDeCoup == 1) {
                System.out.println("Il vous a fallu seulement un seul coup pour trouver la bonne suite de couleur");
            } else {
                System.out.println("Il vous a fallu " + nbDeCoup + " coups pour trouver la bonne suite de couleur");
            }
        } else {
            System.out.println("Vous n'avez malheuresement pas trouvé la bonne suite de couleur");
            System.out.println("la bonne suite de couleur etait : ");
            if (TAILLE_COMBINAISON == 4) {
                System.out.println(combinaisonCouleurOrdinateur[0] + ", " + combinaisonCouleurOrdinateur[1] + ", " + combinaisonCouleurOrdinateur[2] + ", " + combinaisonCouleurOrdinateur[3]);
            } else if (TAILLE_COMBINAISON == 5) {
                System.out.println(combinaisonCouleurOrdinateur[0] + ", " + combinaisonCouleurOrdinateur[1] + ", " + combinaisonCouleurOrdinateur[2] + ", " + combinaisonCouleurOrdinateur[3] + ", " + combinaisonCouleurOrdinateur[4]);
            }      
        }
            
    }
}
