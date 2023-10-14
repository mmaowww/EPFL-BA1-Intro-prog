import java.util.Scanner;

public class Scalaire {

    public static void main(String[] args)
    {
        Scanner clavier = new Scanner(System.in);
        int n;
        int nMax;
        int index = 0;
        int prodScalaire = 0;

        nMax = 10;

        do
        {
            System.out.println("Entrez le nombre de composante du vecteur, entre 1 et 10 inclus.");
            n = clavier.nextInt();
            if (n > nMax || n <= 0)
                System.out.println("Le nombre de composantes doit être entre 1 et 10.");
        } while (n > nMax || n <= 0);

        int[] vect1 = new int[n];
        int[] vect2 = new int[n];


        for (int i = 0; i < n; i++)
        {
            System.out.println("Quelle est la composante " + (i+1) + " du premier vecteur?");
            vect1[i] = clavier.nextInt(); // remplissage du vecteur 1
        }


        for (int j = 0; j < n; j++)
        {
            System.out.println("Quelle est la composante " + (j+1) + " du deuxième vecteur?");
            vect2[j] = clavier.nextInt(); // remplissage du vecteur 2
        }

        while (index < n)
        {
            prodScalaire = prodScalaire + vect1[index]*vect2[index];
            index++;
        }

        System.out.println("Le produit scalaire des deux vecteurs est: " + prodScalaire);

    }
}
