import java.util.Scanner;

public class OnlyAverage
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
        for(double i : numbers) {
            total = total + i;
        }
        System.out.println("The average is " + total / num);
    }
}