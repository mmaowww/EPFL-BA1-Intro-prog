/*        \\\\\\\\\\  \\\\\\\\\  \\\\\\\\\\ \+\
/*         \+\         \+\    \+\ \+\        \+\
/*          \+\         \+\    |+| \+\        \+\
/*           \+\......   \+\.../+/  \+\....    \+\
/*            \=\         \+\        \+\        \+\
/*             \=\         \+\        \+\        \+\
/*              \\\\\\\\\\  \+\        \+\        \\\\\\\\\\
/*      Premiers
/*      20.10.23 by Emilie 𓃵                                  */
import java.util.ArrayList;

public class Premiers
{
    public static void main(String[] args)
    {
        ArrayList<Integer> tableau = new ArrayList<Integer>();
        tableau.add(2);
        for (int i = 2; i <= 100; i++)
        {
            boolean estPremier = true;
            if (i % 2 == 0)
                estPremier = false;
            else
            {
                int j = 3;
                while (j <= Math.sqrt(i) && estPremier)
                {
                    if (i % j == 0)
                        estPremier = false;
                    j++;
                }
            }
            if (estPremier == true)
                tableau.add(i);
        }

        System.out.println("Les nombres premiers compris entre 2 et 100 sont les suivants :");
        System.out.println(tableau);
        //System.out.println(tableau.size());
    }
}
