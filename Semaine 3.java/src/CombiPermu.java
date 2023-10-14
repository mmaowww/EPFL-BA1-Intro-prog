import java.util.Scanner;

public class CombiPermu {

        public static void main(String[] args) {
            Scanner clavier = new Scanner(System.in);

            System.out.print("Entrez un nombre entier positif n: ");
            int n = clavier.nextInt();

            System.out.print("Entrez un nombre entier positif k, plus petit ou égal à n: ");
            int k = clavier.nextInt();

            int p = n - k;

            if (n < 0 || k < 0 || k > n) {
                System.out.println("Les nombres entrés ne sont pas conformes aux indications.");
                return;
            }

            int i = 1;
            int nFactoriel = 1;
            while (i <= n) {
                nFactoriel *= i;
                i++;
            }

            i = 1;
            int kFactoriel = 1;
            while (i <= k) {
                kFactoriel *= i;
                i++;
            }

            i = 1;
            int pFactoriel = 1;
            while (i <= p) {
                pFactoriel *= i;
                i++;
            }

            int denominateur = kFactoriel * pFactoriel;

            int resultat = nFactoriel / denominateur;

            System.out.println("Le résultat est: " + resultat);
        }

}
