import java.util.Scanner;
public class Swap2
{
	public static void main(String[] args)
	{
		int	a;
		int	b;
		int	c;

		Scanner keyb = new Scanner(System.in);
		
		System.out.print("Entrez un entier X:\n");
		a = keyb.nextInt();

		System.out.print("Entrez un entier Y:\n");
		b = keyb.nextInt();
	
		System.out.print("X vaut " + a + " et Y vaut " + b + ".\n");

		c = a;
		a = b;
		b = c;

		System.out.print("Après permutation, X vaut " + a + " et Y vaut " + b + ".\n");

	}


}
