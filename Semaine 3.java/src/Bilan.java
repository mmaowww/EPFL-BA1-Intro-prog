import java.util.Scanner;
public class Bilan
{
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int n;
        int somme = 0;
        int minimum = 0;
        int maximum = 0;

        do
        {
            System.out.println("Combien de sommes mensuelles avez-vous reçues?");
            n = clavier.nextInt();
            if (n <= 0)
            {
                System.out.println("Il faut entrer un nombre de mois plus grand que 0.");
            }
        } while (n <= 0);

        for (int i = 1; i <= n; ++i)
        {
            System.out.print("Entrez la somme reçue (CHF) au mois " + i + ": ");
            int montant = clavier.nextInt();
            somme = somme + montant;
            if (i == 1)
            {
                minimum = montant;
                maximum = montant;
            }
            if (montant < minimum)
            {
                minimum = montant;
            }
            if (montant > maximum)
            {
                maximum = montant;
            }
        }

        System.out.println("Vous avez reçu en moyenne " + somme/n + " CHF.");
        System.out.println("La plus petite somme que vous avez reçue est de " + minimum + " CHF.");
        System.out.println("La plus grande somme que vous avez reçue est de " + maximum + " CHF.");
    }

}
