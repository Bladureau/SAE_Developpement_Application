package iut.info1.sae.modele;

public class ModeleMastermindJcJ {

    private static final String[] COULEURS = {"Bleu", "Rose", "Jaune", "Rouge", "Orange", "Marron", "Gris", "Blanc", "Vert", "Violet"};

    public static void main(String[] args) {
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
        String[] combinaisonCouleurJ1 = new String[TAILLE_COMBINAISON];
        String[] combinaisonCouleurJ2 = new String[TAILLE_COMBINAISON];
        //boolean finPartie = false;
        boolean combinaisonTrouvePourJ1 = false;
        boolean combinaisonTrouvePourJ2 = false;
        // supprimer la valeur des noms quand la vue sera opperationnelle
        String nomJ1 = "Lucas";
        String nomJ2 = "patoche";


        // combinaison que le joueur 2 choisi
        combinaisonCouleurJ2[0] = "bleu";
        combinaisonCouleurJ2[1] = "rose";
        combinaisonCouleurJ2[2] = "blanc";
        combinaisonCouleurJ2[3] = "bleu";

        // le tableau de base devra etre vide et c'est le joueur qu choisira les couleurs
/*
        while (!finPartie) {
            nbDeCoup++;
*/
            
            // Selection des couleurs pour le J1
            // TODO : selectionner les couleurs en cochant les cases dans une liste deroulante sur chaque cases vide
            
            // a suprimer des que le TODO du dessus est fait
            combinaisonCouleurJ1[0] = "bleu";
            combinaisonCouleurJ1[1] = "gris";
            combinaisonCouleurJ1[2] = "rose";
            combinaisonCouleurJ1[3] = "rose";

            //TODO : fenetre montrant le code couleur du J1 et du J2 et le J2 doit mettre dans 2 cases 0,1,2,3,4 ou 5 pour representer le nombre de bonne couleur bien et mal place




        
            // !!!!!!!!!!!!!!!!!!!!!pas du tout fini !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!




        
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
        // calcul des pts a la fin de la partie
        if (combinaisonTrouvePourJ1 == true && combinaisonTrouvePourJ2 == false) {
            // faire une page a la place des system.out.println
            System.out.println("Bravo " + nomJ1 + ", vous venez de remporter la partie");
            if (nbDeCoup == 1) {
                System.out.println("Il vous a fallu seulement un seul coup pour trouver la bonne suite de couleur");
            } else {
                System.out.println("Il vous a fallu " + nbDeCoup + " coups pour trouver la bonne suite de couleur");
            }
        } else if (combinaisonTrouvePourJ2 == true && combinaisonTrouvePourJ1 == false) {
            // faire une page a la place des system.out.println
            System.out.println("Bravo " + nomJ2 + ", vous venez de remporter la partie");
            if (nbDeCoup == 1) {
                System.out.println("Il vous a fallu seulement un seul coup pour trouver la bonne suite de couleur");
            } else {
                System.out.println("Il vous a fallu " + nbDeCoup + " coups pour trouver la bonne suite de couleur");
            }

            // a continuer
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

