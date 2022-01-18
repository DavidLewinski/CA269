import java.util.Scanner;

public class DoubleDivision
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter two floating point numbers: ");

        double c1 = in.nextDouble();
        double c2 = in.nextDouble();

        double r = c1 / c2;

        System.out.printf("%.1f / %.1f is %.1f\n", c1, c2, r);
    }
}

