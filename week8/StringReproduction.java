/*
    This code is supplied and may be used to solve this problem.
    
    Note that the output matching is exact (down to spaces and newlines)
    It will be easier to get full marks if you use the supplied 
    System.out.print statements
*/
import java.util.Scanner;

public class StringReproduction
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter an integer and a string: ");
        // Read in the number ... 
        int num = in.nextInt();
        // ... and the string
        String word = in.next();
        int i = 0;
        // work out what to print
        while(i < num)
        {
            System.out.print(word);
            ++i;
        }
        // YOUR CODE HERE
        System.out.println("The sum of the numbers from 1 to " + num + " is " + total);
    }
}