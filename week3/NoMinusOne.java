import java.util.Scanner;

public class NoMinusOne
{
    public static void main(String [] args)
    {
        // Use a loop to print out the numbers
        // We will use i as the loop variable
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = 0;
        int temp = 0;
        while (num != -1)
        {
            temp = num;
            num = in.nextInt();
        }
        System.out.print("The penultimate number was: " + temp);
        System.out.println(); // Finish with a new line.
    }
}
