import java.util.Scanner;

public class Degre3
{
	public static void main(String[] args)
	{
		int		a;
		int		b;
		int		c;
		double	x;
		double	moyenne;
		double	result;

		Scanner keyb = new Scanner(System.in);
		System.out.print("Entrez un nombre entier a:\n");
		a = keyb.nextInt();

		System.out.print("Entrez un nombre entier b:\n");
		b = keyb.nextInt();

		System.out.print("Entrez un nombre entier c:\n");
		c = keyb.nextInt();

		System.out.print("Entrez un nombre réel x:\n");
		x = keyb.nextDouble();

		moyenne = a+b;
		moyenne /= 2;
		result = (moyenne*(x*x*x)) + ((a + b)*(a + b)*(x*x)) + a + b + c;

		System.out.print("La valeur du polynôme est: " + result);
	}
}
