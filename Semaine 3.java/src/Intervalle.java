import java.util.Scanner;

public class Intervalle {
    //Soit I = [2,3[ U ]0,1] U [-10,-2]

    public static void main(String[] args)
    {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un nombre décimal:");
        double nombre = clavier.nextDouble();

        if (((nombre > -10) && (nombre < -2)) || ((nombre > 0) && (nombre < 1))
                || ((nombre > 2) && (nombre < 3)) || nombre == -10 || nombre == 1 || nombre == 2)
        {
            System.out.println("Le nombre appartient à l'ensemble I, tel que I = [2,3[ U ]0,1] U [-10,-2].");
        }
        else
        {
            System.out.println("Le nombre n'appartient pas à l'ensemble I, tel que I = [2,3[ U ]0,1] U [-10,-2].");
        }
        return;
    }


}
