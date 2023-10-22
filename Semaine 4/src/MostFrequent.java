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

class MostFrequent {

    public static void main(String[] args) {
        int[] tab1 = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
        int taille = tab1.length;

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

        int frequenceMax = 0;
        int elementLePlusFrequent = 0;
        for (int i = 0; i < taille; i++)
        {
            int nbrDeFois = 0;
            for (int j = 0; j < taille; j++)
            {
                if (tab1[i] == tab1[j])
                    nbrDeFois++;
            }
            if (nbrDeFois > frequenceMax) {
                frequenceMax = nbrDeFois;
                elementLePlusFrequent = tab1[i];
            }
        }

        System.out.println("Le nombre le plus frequent dans le tableau est le :");
        System.out.println(elementLePlusFrequent + " (" + frequenceMax + " x)");

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

    }
}
