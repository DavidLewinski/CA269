import java.util.Scanner;

public class SumNumber
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int i = 1, j = 0, total = 0;
        while (i <= num)
        {
            total += i;
            ++i;
        }
        System.out.println("The sum of the numbers from 1 to " + num + " is " + total);
    }
}
