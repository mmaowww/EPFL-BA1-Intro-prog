import java.util.Scanner;

public class Rebonds {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        double h;
        double eps;
        double nbr;
        double vitesseAvantRebond;
        double vitesseApresRebond;
        int i = 1;

        do {
            System.out.print("Entrez une hauteur plus grande que 0: ");
            h = clavier.nextDouble();

            System.out.print("Entrez la constante eps entre 0 et 1: ");
            eps = clavier.nextDouble();

            System.out.print("Entrez le nombre de rebonds de la balle, plus grand que 0: ");
            nbr = clavier.nextDouble();

            if (h <= 0 || eps < 0 || eps > 1 || nbr <= 0) {
                System.out.println("Les nombres entrés ne permettent pas le calcul.");
            }
        } while (h <= 0 || eps < 0 || eps > 1 || nbr <= 0);

        while (i <= nbr)
        {
            vitesseAvantRebond = Math.sqrt(2 * h * 9.81);
            vitesseApresRebond = eps * vitesseAvantRebond;
            h = (vitesseApresRebond * vitesseApresRebond) / (2 * 9.81);
            i++;
        }
        System.out.println("La hauteur du rebond de la balle après " + nbr + " rebonds est " + h);
    }
}