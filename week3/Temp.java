/*
    Create a class with a main method.
    The method should read in a Fahrenhit Temperature
    Get the equivalent in Celsius (using the fahr2cels() method
    and print out the result.
*/
import java.util.Scanner;

public class Temp
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Give me a Fahrenheit temperature: ");
        
        // Read in the number 
        double num = in.nextDouble();
        
        double result = Convert.fahr2cels(num);

        System.out.println("In Celsius that would be: " + result);
    }
}
