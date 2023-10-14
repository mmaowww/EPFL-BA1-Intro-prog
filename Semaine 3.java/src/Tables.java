public class Tables {

    public static void main(String[] args)
    {
        for (int j = 2; j <= 10; ++j) {
            System.out.println("La table de " + j + ":");
            for (int i = 1; i <= 10; ++i) {
                System.out.println(j + " fois " + i + " = " + j * i);
            }
        }
    }

}
