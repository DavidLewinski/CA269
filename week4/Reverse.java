import java.util.Scanner;

public class Reverse
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers: ");
        int num = input.nextInt();
        int[] numbers = new int[num];
        System.out.print("Enter " + num + " numbers: ");
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = input.nextInt();
        }
        int j = num;
        int[] b = new int[num];
        for (int i = 0; i < numbers.length; i++)
        {
            b[j - 1] = numbers[i];
            j = j - 1;
        }
        System.out.print("The numbers reversed are:");
        for (int i : b)
        {
            System.out.print(" " + i);
        }
        System.out.println();
    }
}