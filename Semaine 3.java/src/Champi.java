import java.util.Scanner;

public class Champi {

    public static void main(String[] args)
    {

        System.out.println("Pensez a un champignon : amanite tue mouches, pied bleu, girolle,");
        System.out.println("cèpe de Bordeaux, coprin chevelu ou agaric jaunissant.");

        boolean foret = false;
        boolean convexe = false;
        boolean anneau = false;

        Scanner clavier = new Scanner(System.in);
        //System.out.print("Est-ce que votre champignon a des lamelles (true : oui, false : non) ? ");
        System.out.print("Est-ce que votre champignon vit en forêt (true : oui, false : non) ? ");
        foret = clavier.nextBoolean();

        System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
        convexe = clavier.nextBoolean();

        System.out.print("Est-ce que votre champignon a un anneau (true : oui, false : non) ? ");
        anneau = clavier.nextBoolean();

        System.out.print("==> Le champignon auquel vous pensez est ");

        if (foret == false && convexe == true && anneau == true)
            System.out.print("l'agaric jaunissant");

        else if (foret == true && convexe == true && anneau == true)
            System.out.print("l'amanite tue-mouches");

        else if (foret == true && convexe == false && anneau == false)
            System.out.print("le cèpe de Bordeaux");

        else if (foret == false && convexe == false && anneau == true)
            System.out.print("le coprin chevelu");

        else if (foret == true && convexe == false && anneau == false)
            System.out.print("la girolle");

        else if (foret == true && convexe == true && anneau == false)
            System.out.print("le pied bleu");
    }
}