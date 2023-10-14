import	java.util.Scanner;

public class Napoleon
{
    public static void main(String[] args) {
        String noms = "Napoleon Bonaparte Bill Gates Claudia Schiffer Martina Hingis ";
        String[] tabPrenom = new String[4];
        String[] tabNom = new String[4];
        int length = noms.length();
        int indexFinPrenom = 0;
        int indexFinNom = 0;
        int indexTab = 0;

        for (int i = 0; i < 4; i++) {

            indexFinPrenom = noms.indexOf(' ', indexFinNom + 1);              // Il va me renvoyer l'espace après le n final de Napoléon.
            tabPrenom[indexTab] = noms.substring(indexFinNom, indexFinPrenom);          // Il découpe la chaîne du début à n de Napoléon et le place dans le tableau à l'index indiqué.
            if (indexFinNom == 0)                                                       // Au premier tour de boucle, il faut décaler l'index pour le nom, sinon il renverra la même chose que l'index pour le prénom.
                indexFinNom = indexFinPrenom + 1;
            indexFinNom = noms.indexOf(' ', indexFinPrenom + 1);              // Il cherche la fin du nom.
            tabNom[indexTab] = noms.substring(indexFinPrenom + 1, indexFinNom);           // Il découpe la chaîne du début à n de Napoléon et le place dans le tableau à l'index indiqué.
            indexTab++;
            indexFinNom += 1;                                                               //Il faut retirer les espaces avant les prénoms après la première boucle.
        }

        System.out.println("Entrez un prénom de la liste ci-dessous pour obtenir le nom de famille associé:");
        System.out.println(noms);
        Scanner clavier = new Scanner(System.in);
        String prenom = clavier.nextLine();
        Boolean inconnu = true;

        for (int j = 0; j < tabPrenom.length; j++)
        {
            if (tabPrenom[j].equals(prenom))
            {
                inconnu = false;
                System.out.println(tabNom[j]);
            }
            else if (tabNom[j].equals(prenom))
            {
                inconnu = false;
                System.out.println("Vous avez introduit un nom de famille.");
            }
            else
            {
                inconnu = true;
            }
        }
        if (inconnu)
        {
            System.out.println("Inconnu au bataillon!");
        }
    }
}
