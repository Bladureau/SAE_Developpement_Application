package iut.info1.sae.modele;

public class ModeleMastermindJcJ {

    private static final String[] COULEURS = {"Bleu", "Rose", "Jaune", "Rouge", "Orange", "Marron", "Gris", "Blanc", "Vert", "Violet"};

    public static void JcJ {
        // TODO : definir toutes les couleurs

        // initialisation des constantes
        final int TAILLE_COMBINAISON = 4;
        final int NOMBRE_MAX_DE_COUP = 12;

        // initialisation des variables
        int nbDeCoupJ1 = 0;
        int nbDeCoupJ2 = 0;
        int i = 0;
        int[] nbDeCouleurMalPlaceJ1 = new int[NOMBRE_MAX_DE_COUP];
        int[] nbDeCouleurBienPlaceJ1 = new int[NOMBRE_MAX_DE_COUP];
        int[] nbDeCouleurMalPlaceJ2 = new int[NOMBRE_MAX_DE_COUP];
        int[] nbDeCouleurBienPlaceJ2 = new int[NOMBRE_MAX_DE_COUP];
        String[] combinaisonCouleurJ1 = new String[TAILLE_COMBINAISON];
        String[] combinaisonCouleurJ1QuiChangePas = new String[TAILLE_COMBINAISON];
        String[] combinaisonCouleurJ2 = new String[TAILLE_COMBINAISON];
        String[] combinaisonCouleurJ2QuiChangePas = new String[TAILLE_COMBINAISON];
        //boolean finPartie = false;
        boolean combinaisonTrouvePourJ1 = false;
        boolean combinaisonTrouvePourJ2 = false;
        // supprimer la valeur des noms quand la vue sera opperationnelle
        String nom1 = "Lucas";
        String nom2 = "patoche";
        String nomJ1;
        String nomJ2;
        int scoreFinalJ1 = 0;
        int scoreFinalJ2 = 0;


        Random random = new Random();
        int pileOuFace = random.nextInt(2);
        if (pileOuFace == 0) {
            nomJ1 = nom2;
            nomJ2 = nom1;
        } else {
            nomJ1 = nom1;
            nomJ2 = nom2;
        }
        System.out.println(nomJ2 + " commence a choisir la suite de couleur et " + nomJ1 + " devinera celle-ci");



        // combinaison que le joueur 2 choisi
        combinaisonCouleurJ2QuiChangePas[0] = "bleu";
        combinaisonCouleurJ2QuiChangePas[1] = "rose";
        combinaisonCouleurJ2QuiChangePas[2] = "blanc";
        combinaisonCouleurJ2QuiChangePas[3] = "bleu";

        // le tableau de base devra etre vide et c'est le joueur qu choisira les couleurs
/*
        while (!finPartie) {
            nbDeCoupJ1++;
*/
            
            // Selection des couleurs pour le J1
            // TODO : selectionner les couleurs en cochant les cases dans une liste deroulante sur chaque cases vide
            
            // a suprimer des que le TODO du dessus est fait
            combinaisonCouleurJ1[0] = "bleu";
            combinaisonCouleurJ1[1] = "gris";
            combinaisonCouleurJ1[2] = "rose";
            combinaisonCouleurJ1[3] = "rose";

            //TODO : fenetre montrant le code couleur du J1 et du J2 et le J2 doit mettre dans 2 cases 0,1,2,3,4 ou 5 pour representer le nombre de bonne couleur bien et mal place




        
/*
            // verification d'une potentielle fin de manche pour le J1
            
            if (nbDeCouleurBienPlaceJ1[nbDeCoupJ1] == TAILLE_COMBINAISON) {
                finPartie = true;
                combinaisonTrouvePourJ1 = true;
            } else if (nbDeCoupJ1=>NOMBRE_MAX_DE_COUP) {
                    finPartie = true;
            }
        }
*/
        if (combinaisonTrouvePourJ1 == true) {
            System.out.println("Bravo " + nomJ1 + ", vous avez trouvé le bon code couleur");
        } else {
            System.out.println("Vous n'avez malheureusement pas trouvé le bon code couleur");
            System.out.println("La bonne suite de couleur etait : ");
            if (TAILLE_COMBINAISON == 4) {
                System.out.println(combinaisonCouleurJ2QuiChangePas[0] + ", " + combinaisonCouleurJ2QuiChangePas[1] + ", " + combinaisonCouleurJ2QuiChangePas[2] + ", " + combinaisonCouleurJ2QuiChangePas[3]);
            } else if (TAILLE_COMBINAISON == 5) {
                System.out.println(combinaisonCouleurJ2QuiChangePas[0] + ", " + combinaisonCouleurJ2QuiChangePas[1] + ", " + combinaisonCouleurJ2QuiChangePas[2] + ", " + combinaisonCouleurJ2QuiChangePas[3] + ", " + combinaisonCouleurJ2QuiChangePas[4]);
            }
            
        }

// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------       
// ---------------------------------------------------------------------------------------------------------J2---------------------------------------------------------------------------------------------
// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------       
        
        finPartie = false;

        // combinaison que le joueur 1 choisi
        combinaisonCouleurJ1QuiChangePas[0] = "bleu";
        combinaisonCouleurJ1QuiChangePas[1] = "rose";
        combinaisonCouleurJ1QuiChangePas[2] = "blanc";
        combinaisonCouleurJ1QuiChangePas[3] = "bleu";

        // le tableau de base devra etre vide et c'est le joueur qui choisira les couleurs
/*
        while (!finPartie) {
            nbDeCoupJ2++;
*/
            
            // Selection des couleurs pour le J1
            // TODO : selectionner les couleurs en cochant les cases dans une liste deroulante sur chaque cases vide
            
            // a suprimer des que le TODO du dessus est fait
            combinaisonCouleurJ2[0] = "bleu";
            combinaisonCouleurJ2[1] = "gris";
            combinaisonCouleurJ2[2] = "rose";
            combinaisonCouleurJ2[3] = "rose";

            //TODO : fenetre montrant le code couleur du J1 et du J2 et le J1 doit mettre dans 2 cases 0,1,2,3,4 ou 5 pour representer le nombre de bonne couleur bien et mal place





        
/*
            // verification d'une potentielle fin de manche pour le J2
            
            if (nbDeCouleurBienPlaceJ2[nbDeCoupJ2] == TAILLE_COMBINAISON) {
                finPartie = true;
                combinaisonTrouvePourJ2 = true;
            } else if (nbDeCoupJ1=>NOMBRE_MAX_DE_COUP) {
                    finPartie = true;
            }
        }
*/
        if (combinaisonTrouvePourJ2 == true) {
            System.out.println("Bravo " + nomJ2 + ", vous avez trouvé le bon code couleur");
        } else {
            System.out.println("Vous n'avez malheureusement pas trouvé le bon code couleur");
            System.out.println("La bonne suite de couleur etait : ");
            if (TAILLE_COMBINAISON == 4) {
                System.out.println(combinaisonCouleurJ1QuiChangePas[0] + ", " + combinaisonCouleurJ1QuiChangePas[1] + ", " + combinaisonCouleurJ1QuiChangePas[2] + ", " + combinaisonCouleurJ1QuiChangePas[3]);
            } else if (TAILLE_COMBINAISON == 5) {
                System.out.println(combinaisonCouleurJ1QuiChangePas[0] + ", " + combinaisonCouleurJ1QuiChangePas[1] + ", " + combinaisonCouleurJ1QuiChangePas[2] + ", " + combinaisonCouleurJ1QuiChangePas[3] + ", " + combinaisonCouleurJ1QuiChangePas[4]);
            }
            
        }
            











        
        // calcul des pts a la fin de la partie
        if (nbDeCoupJ1 < nbDeCoupJ2) {
            // faire une page a la place des system.out.println
            System.out.println("Bravo " + nomJ1 + ", vous venez de remporter la partie car vous avez trouvé la suite en moins de coup que " + nomJ2);
        } else if (nbDeCoupJ1 > nbDeCoupJ2) {
            // faire une page a la place des system.out.println
            System.out.println("Bravo " + nomJ2 + ", vous venez de remporter la partie car vous avez trouvé la suite en moins de coup que " + nomJ1);
        } else (nbDeCoupJ1 == nbDeCoupJ2) {
            // faire une page a la place des system.out.println
            System.out.println("Vous avez fini vos parties avec le meme nombre de coup chacun donc voici des details pour vous departager");
            // 1 pts par bonne couleur mal place
            // 2 pts par bonne couleur bien place
            for (i = 1; i<=nbDeCoupJ1; i++){
                scoreFinalJ1 = scoreFinalJ1 + nbDeCouleurMalPlaceJ1[i] + (nbDeCouleurBienPlaceJ1[i]*2)
                scoreFinalJ2 = scoreFinalJ2 + nbDeCouleurMalPlaceJ2[i] + (nbDeCouleurBienPlaceJ2[i]*2)
            }
            if (scoreFinalJ1 > scoreFinalJ2) {
                // faire une page a la place des system.out.println
                System.out.println("Bravo " + nomJ1 + ", vous venez de remporter la partie car vous avez trouvé la suite en moins de coup que " + nomJ2);
                System.out.println("resultat : " + scoreFinalJ1 + " à " + scoreFinalJ2);
            } else if (scoreFinalJ1 < scoreFinalJ2) {
                // faire une page a la place des system.out.println
                System.out.println("Bravo " + nomJ2 + ", vous venez de remporter la partie car vous avez trouvé la suite en moins de coup que " + nomJ1);
                System.out.println("resultat : " + scoreFinalJ1 + " à " + scoreFinalJ2);
            } else {
                System.out.println("Vous etes exaequo");
                System.out.println("resultat : " + scoreFinalJ1 + " à " + scoreFinalJ2);
                
                
            

        }
            
    }
}

