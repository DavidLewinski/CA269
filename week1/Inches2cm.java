import java.util.Scanner;

public class Inches2cm
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        int inch = in.nextInt();
        // Find out how many inches (use a whole number for integers)
        double result = inch * 2.54;
        // Print out the result
        System.out.println(inch + " is " + result + "cm");
    }
}