import java.util.Scanner;

public class RoseBlanches {

    public static void main(String [] args)
    {
        int somme;
        int livres;
        int coffee;
        int coffeeReste;
        int ticket;
        int ticketReste;
        int flash;
        int flashReste;
        int bouquet;
        int reste;
        int resteDuReste;

        System.out.println("Combien avez-vous reçu d'argent (Frs)?");
        Scanner keyb;
        keyb = new Scanner(System.in);
        somme = keyb.nextInt();

        livres = (somme*3)/4;

        reste = (somme%livres);
        resteDuReste = reste%3;
        reste /= 3;

        coffee = reste/2;
        coffeeReste = reste%2;
        flash = reste/4;
        flashReste = reste%4;
        ticket = reste/3;
        ticketReste = reste%3;

        bouquet = resteDuReste+coffeeReste+ticketReste+flashReste;

        System.out.println("Vous avez reçu (Frs): " + somme);
        System.out.println("Livres et fournitures: " + livres);
        System.out.println("Vous pouvez ensuite acheter:");
        System.out.println(coffee + " cafés");
        System.out.println(flash + " numéros du Flash Informatique");
        System.out.println(ticket + " billets de métro");
        System.out.println("et il vous restera " + bouquet + " Frs pour les roses blanches.");

    }



}
