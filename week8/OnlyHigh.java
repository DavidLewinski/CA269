/*
    This code is supplied and may be used to solve this problem.
*/
import java.util.Scanner;

public class OnlyHigh
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word: ");
        // Read in the word
        String word = in.next();

        // YOUR CODE HERE
        int i = 0;
        int j = 1;
        int len = word.length();
        int count = 0;
        while (j + 1 <= word.length())
        {
            if (word.substring(i, j + 1).equals("hi"))
            {
                ++count;
            } 
            ++i;
            ++j;
        }
        int returned = 0;
        while (returned < count)
        {
            System.out.print("hi");
            System.out.println();
            ++returned;
        }
    }    
}
