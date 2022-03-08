import java.util.Scanner;

public class FindMatchingLetters
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter two lines:");
        // Read in the two lines
        String line1 = in.nextLine();
        String line2 = in.nextLine();

        int i = 0, numMatching = 0;
        // INSERT YOUR CODE HERE
        // it should work out what the number of matching characters is

        while (i < line1.length())
        {
            if(line1.charAt(i) == line2.charAt(i))
                ++numMatching;
            ++i;
        }

        // Print out the solution
        System.out.println("There are " + numMatching + " corresponding characters.");
    }
}