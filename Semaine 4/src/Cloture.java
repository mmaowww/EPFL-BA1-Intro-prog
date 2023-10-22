/******************************************************************+*/
/*                                                                  */
/*                  ||||||||||  ||||||||\   |||||||||| |+|          */
/*                  |+|         |+|    \+\  |+|        |+|          */
/*   22.10.23       |+|         |+|     |+| |+|        |+|          */
/*                  ...||||||   |+|..../+/  ...||||    |+|          */
/*                  |+|         |+|         |+|        |+|          */
/*   by Emilie 𓃵   |+|         |+|         |+|        |+|          */
/*                  ||||||||||  |+|         |+|        ||||||||||   */
/*                                                                  */
/* **************************************************************** */

import java.util.ArrayList;

class Cloture {
    public static void main(String[] args) {
        int[][] carte = {
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0},
            {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
            {0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        };

        /*******************************************
         * Completez le programme à partir d'ici.
         *******************************************/

        int colonne = carte.length;
        int ligne = carte[0].length;

        for (int i = 0; i < colonne; i++) //gestion d'erreur de format
        {
            for (int j = 0; j < ligne; j++) {
                if (carte[i][j] != 0 && carte[i][j] != 1) {
                    int m = carte[i][j];
                    System.out.print("Votre carte du terrain n'a pas le bon format :\nvaleur '");
                    System.out.print(m + "' trouvée en position [");
                    System.out.print(i + "][");
                    System.out.println(j + "]");
                    return;
                }
            }
        }

        int[][] carteModifiee = new int[colonne][ligne]; //Création d'une carte que je modifierai.
        for (int i = 0; i < colonne; i++)
        {
            for (int j = 0; j < ligne; j++) {
                carteModifiee[i][j] = carte[i][j];
            }
        }

        int depuisLaGauche = 0;
        int depuisLaDroite = ligne - 1;
        for (int i = 0; i < colonne; i++) //Je vais modifier la carte pour effacer les étangs ligne par ligne.
        {
            depuisLaGauche = 0;
            depuisLaDroite = ligne - 1;
            while (carteModifiee[i][depuisLaGauche] == 0) //Je cherche où commence le terrain depuis la marge gauche.
            {
                depuisLaGauche++;
            }
            while (carteModifiee[i][depuisLaDroite] == 0) //Je cherche où se termine le terrain depuis la marge droite.
            {
                    depuisLaDroite--;
            }
            for (int j = depuisLaGauche+1; j < depuisLaDroite; j++) //J'efface les étangs.
            {
                carteModifiee[i][j] = 1;
            }
        }

        int coteCloture = 0; ; // J'ajoute déjà les clôtures verticales délimitant les lignes, une à gauche, une à droite.
        for (int j = 0; j < ligne; j++) //Je compte le nombre de clôtures horizontales sur la première ligne.
        {
            if (carteModifiee[0][j] == 1)
                coteCloture++;
            if (carteModifiee[0][j]== 1 && carteModifiee[1][j] == 0)
                coteCloture++;
        }
        for (int i = 1; i < colonne - 1; i++) //Je compte le nombre de clôtures horizontales sur les lignes entre la première et la dernières ligne.
        {
            for (int j = 0; j < ligne; j++) {
                if (carteModifiee[i][j] == 1 && carteModifiee[i - 1][j] == 0)
                    coteCloture++;
                if (carteModifiee[i][j] == 1 && carteModifiee[i + 1][j] == 0)
                    coteCloture++;
            }
        }
        for (int j = 0; j < ligne; j++) //Je compte le nombre de clôtures horizontales sur la dernière ligne.
        {
            if (carteModifiee[colonne - 1][j] == 1)
                coteCloture++;
            if (carteModifiee[colonne - 1][j]== 1 && carteModifiee[colonne-2][j] == 0)
                coteCloture++;
        }

        coteCloture += 2*colonne;
        double  metreCloture = coteCloture * 2.5;
        System.out.print("Il vous faut " + metreCloture);
        System.out.println(" mètres de clôture pour votre terrain.");


        /*for (int i = 0; i < colonne; i++) {
            for (int j = 0; j < ligne; j++) {
                System.out.print(carteModifiee[i][j]);
            }
            System.out.print("\n");}
        //System.out.print("Votre carte du terrain n'a pas le bon format :\nvaleur '");
        //System.out.print("' trouvée en position [");
        //System.out.print("][");
        //System.out.println("]");

        //System.out.println("Votre carte du terrain n'a pas le bon format :");
        //System.out.print("bord extérieur entrant trouvé en position [");
        //System.out.print("][");
        //System.out.println("]");*/



        /*******************************************
         * Ne rien modifier après cette ligne.
         *******************************************/
    }
}
