import java.util.Scanner;

public class HowManyNumbers
{
    public static void main(String [] args)
    {
        // Use a loop to print out the numbers
        // We will use i as the loop variable
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int num = 0;
        int total = -1;
        while (num != -1)
        {
            num = in.nextInt();
            total++;
        }
        System.out.println(); // Finish with a new line.
        System.out.print(total + " numbers were entered.");
        System.out.println(); // Finish with a new line.
    }
}
