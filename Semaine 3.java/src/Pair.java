import java.util.Scanner;

public class Pair {

    public static void main(String[] args)
    {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un nombre entier:");
        int nombre = clavier.nextInt();

        boolean pair;
        boolean signe;

        pair = (nombre % 2 == 0);
        signe = (nombre >= 0);

        if (pair && signe)
        {
            System.out.println("Le nombre est positif et pair.");
        }
        else if (!pair && signe)
        {
            System.out.println("Le nombre est positif et impair.");
        }
        else if (pair && !signe)
        {
            System.out.println("Le nombre est négatif et pair.");
        }
        else if (!pair && !signe)
        {
            System.out.println("Le nombre est négatif et impair.");
        }
        else
        {
            System.out.println("Il y a un problème avec le nombre.");
        }
        return;
    }


}
