import java.util.Scanner;

public class Cent2Fahr
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        int c = in.nextInt();

        double r = (c * 1.8) + 32;

        System.out.printf("%d %.1f\n", c, r);
    }
}
