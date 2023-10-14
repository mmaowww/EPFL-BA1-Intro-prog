import java.util.Scanner;

public class Rebonds2 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        double h;
        double eps;
        double h_fin;
        double vitesseAvantRebond;
        double vitesseApresRebond;
        int i = 0;

        do {
            System.out.print("Entrez une hauteur plus grande que 0: ");
            h = clavier.nextDouble();

            System.out.print("Entrez la constante eps entre 0 et 1: ");
            eps = clavier.nextDouble();

            System.out.print("Entrez la hauteur finale désirée, plus grande que 0 et ne dépassant pas la hauteur initiale: ");
            h_fin = clavier.nextDouble();

            if (h <= 0 || eps < 0 || eps > 1 || h_fin <= 0 || h_fin > h)
            {
                System.out.println("Les nombres entrés ne permettent pas le calcul.");
            }
        } while (h <= 0 || eps < 0 || eps > 1 || h_fin <= 0 || h_fin > h);

        while (h >= h_fin)
        {
            vitesseAvantRebond = Math.sqrt(2 * h * 9.81);
            vitesseApresRebond = eps * vitesseAvantRebond;
            h = (vitesseApresRebond * vitesseApresRebond) / (2 * 9.81);
            i++;
        }
        System.out.println(i);
    }
}