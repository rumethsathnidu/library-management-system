import java.util.Scanner;

public class search {

    public static String nextString()
    {
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        return x;
    }

    public static char nextChar()
    {
        Scanner input = new Scanner(System.in);
        char y = input.next().charAt(0);
        return y;
    }
}
