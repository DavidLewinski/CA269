import java.util.Scanner;

public class AboveAverage
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers: ");
        int num = input.nextInt();
        double[] numbers = new double[num];
        System.out.print("Enter " + num + " numbers: ");
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = input.nextDouble();
        }
        double total = 0;
        for(double i : numbers)
        {
            total = total + i;
        }
        
        double avg = total / num;
        System.out.println("The above average numbers are:");
        for(double i : numbers)
        {
            if (i > avg)
            {
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }
}