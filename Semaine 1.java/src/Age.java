import java.util.Scanner;
public class Age {

    public static void main(String [] args)
    {
        int age;
        int annee;

        System.out.print("Quel est votre âge?\n");
        Scanner keyb = new Scanner(System.in);
        age = keyb.nextInt();

        annee = 2023 - age;

        System.out.print("Vous êtes né-e en " + annee + ".\n");
    }

}
