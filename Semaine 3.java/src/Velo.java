import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de début de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

        int dureeJour = 0;
        int dureeNuit = 0;
        int prixJour = 0;
        int prixNuit = 0;
        double prix = 0;

        if ((debut > 24) || (fin > 24) || (debut < 0) || (fin < 0) || (debut == fin) || (debut > fin))
        {
            if ((debut > 24) || (fin > 24) || (debut < 0) || (fin < 0))
            {
                System.out.println("Les heures doivent être comprises entre 0 et 24 !");
            }
            else if (debut == fin)
            {
                System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");
            }
            else if (debut > fin)
            {
                System.out.println("Bizarre, le début de la location est après la fin ...");
            }
        }

        else
        {
            if (fin < 7) {
                dureeNuit = fin - debut;
                prixNuit = dureeNuit;
            } else if (fin >= 7 && fin <= 17) {
                if (debut < 7) {
                    dureeNuit = 7 - debut;
                    prixNuit = dureeNuit;
                    dureeJour = fin - 7;
                    prixJour = dureeJour * 2;
                } else {
                    dureeJour = fin - debut;
                    prixJour = dureeJour * 2;
                }
            } else {
                if (debut < 7) {
                    dureeNuit = (7 - debut) + (fin - 17);
                    prixNuit = dureeNuit;
                    dureeJour = 10;
                    prixJour = dureeJour * 2;
                } else if (debut >= 7 && debut <= 17) {
                    dureeNuit = fin - 17;
                    prixNuit = dureeNuit;
                    dureeJour = 17 - debut;
                    prixJour = dureeJour * 2;
                } else {
                    dureeNuit = fin - debut;
                    prixNuit = dureeNuit;
                }
            }
            prix = prixNuit + prixJour;
            System.out.println("Vous avez loué votre vélo pendant");
            if (dureeNuit != 0)
                System.out.println(dureeNuit + " heure(s) au tarif horaire de 1.0 franc(s)");
            if (dureeJour != 0)
                System.out.println(dureeJour + " heure(s) au tarif horaire de 2.0 franc(s)");
            System.out.print("Le montant total à payer est de " + prix);
            System.out.println(" franc(s).");
        }

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}