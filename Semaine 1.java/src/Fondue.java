import java.util.Scanner;
public class Fondue
{
    public static void main(String [] args)
        {
            int BASE = 4;
            double fromage = 800.0;
            double eau = 2.0;
            double ail = 2.0;
            double pain = 400.0;

            System.out.print("Pour faire une fondue fribourgeoise pour " + BASE + " personnes, " +
                    "il vous faut :\n- " +
                    fromage + " gr de Vacherin fribourgeois\n- " +
                    eau + " dl d'eau\n- " +
                    ail + " gousse(s) d'ail\n- " +
                    pain + " gr de pain\n- du poivre à volonté.\n\n");

            Scanner keyb = new Scanner(System.in);
            System.out.println("Combien de convives y a-t-il?");
            int nbConvives = keyb.nextInt();

            fromage = (800.0 / BASE) * nbConvives;
            eau = (2.0 / BASE) * nbConvives;
            ail = (2.0 / BASE) * nbConvives;
            pain = (400.0 / BASE) * nbConvives;

            System.out.print("Pour faire une fondue fribourgeoise pour " + nbConvives + " personnes, " +
                    "il vous faut :\n- " +
                    fromage + " gr de Vacherin fribourgeois\n- " +
                    eau + " dl d'eau\n- " +
                    ail + " gousse(s) d'ail\n- " +
                    pain + " gr de pain\n- du poivre à volonté.");
            keyb.close();
        }
}
