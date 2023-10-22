import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args) {

        System.out.println("Entrez un mot ou une phrase, sans accent:");
        Scanner clavier = new Scanner(System.in);
        String  palindrome = clavier.nextLine();

        String onlyLetters = palindrome.toLowerCase().replaceAll("[ ,.\'-;:]", "");

        int i = 0;
        int j = onlyLetters.length() - 1;
        char[] tabOnlyLetters = onlyLetters.toCharArray();
        boolean verification = true;

        while ((i <= j) && (verification == true))
        {
            if (tabOnlyLetters[i] != tabOnlyLetters[j])
                verification = false;
            i++;
            j--;
        }

        if (verification == true)
            System.out.println("C'est un palindrôme!");
        else
            System.out.println("Ce n'est pas un palindrôme :(");
    }
}
