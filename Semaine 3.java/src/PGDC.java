import java.util.Scanner;

public class PGDC
{
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int a;
        int b;
        int swap;
        int c;
        int d;

        do {
            System.out.print("Entrez un premier nombre positif: ");
            a = clavier.nextInt();
            c = a;
            System.out.print("Entrez un deuxième nombre positif: ");
            b = clavier.nextInt();
            d = b;

            if (a < 0 || b < 0) {
                System.out.println("Il faut des nombres entiers positifs.");
            }
        } while (a < 0 || b < 0);

        if (a == b)
        {
            System.out.println("Le plus grand diviseur commun de " + a + " et " + b + " est " + a + ".");
            return;
        }

        if (b > a)
        {
            swap = a;
            a = b;
            b = swap;
        }
        while (a > b)
        {
            a = a - b;
            if (b > a)
            {
                swap = a;
                a = b;
                b = swap;
            }
        }
        System.out.println("Le plus grand diviseur commun de " + c + " et " + d + " est " + a + ".");
    }
}
