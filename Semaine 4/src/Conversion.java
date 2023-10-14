import	java.util.Scanner;

public class Conversion
{
	public static void main(String[] args)
	{
		Scanner clavier = new Scanner(System.in);
		char a;
		int i;

		do 
		{
			System.out.println("Entrez une lettre de l'alphabet en majuscule ou minuscule");
			a = clavier.next().charAt(0);
			if (a < 65 || (a > 90 && a < 97) || a > 122)
				System.out.println("Il faut entrer une lettre.");
		} while (a < 65 || (a > 90 && a < 97) || a > 122);

		i = (int)a;

		if (a >= 65 && a <= 90)
		{
			i = i + 32;
			a = (char)i;
			System.out.println("La lettre en minuscule est: " + a);
		}
		else
		{
			i = i - 32;
			a = (char)i;
			System.out.println("La lettre en majuscule est: " + a);
		}
	}
}
