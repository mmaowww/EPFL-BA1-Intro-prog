/*        \\\\\\\\\\  \\\\\\\\\  \\\\\\\\\\ \+\
/*         \+\         \+\    \+\ \+\        \+\
/*          \+\         \+\    |+| \+\        \+\
/*              ......   \+\.../+/     ....    \+\
/*            \=\         \+\        \+\        \+\
/*             \=\         \+\        \+\        \+\
/*              \\\\\\\\\\  \+\        \+\        \\\\\\\\\\
/*      Triangle
/*      16.10.23 by Emilie 𓃵                                  */

import  java.util.Scanner;

public class Triangle
{
    private static Scanner clavier = new Scanner(System.in);
    static int demanderN()
    {
        int n;

        do {
            System.out.print("Entrez le nombre de ligne du tableau de Pascal: ");
            n = clavier.nextInt();
        } while (n <= 0);

        return n;
    }

    public static void main(String[] args) {
        int n = demanderN();

        int[][] triangleDePascal = new int[n][];

        triangleDePascal[0] = new int[1];
        triangleDePascal[0][0] = 1;

        for (int ligne = 1; ligne < n; ligne++) {
            triangleDePascal[ligne] = new int[ligne + 1];
        }
        for (int ligne = 1; ligne < n; ligne++) {
            for (int colonne = 0; colonne < ligne + 1; colonne++) {
                if ((colonne == 0) || (colonne == ligne))
                    triangleDePascal[ligne][colonne] = 1;
                else
                    triangleDePascal[ligne][colonne] = triangleDePascal[ligne - 1][colonne - 1] + triangleDePascal[ligne - 1][colonne];
            }
        }
        for (int ligne = 0; ligne < n; ligne++) {
            for (int colonne = 0; colonne < ligne + 1; colonne++) {
                System.out.print(triangleDePascal[ligne][colonne]);
            }
            System.out.print("\n");
        }
    }

}
