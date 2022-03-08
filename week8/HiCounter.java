/*
    This code is supplied and may be used to solve this problem.
    
    Note that the output matching is exact (down to spaces and newlines)
    It will be very difficult to get this correct if you do not use the supplied 
    System.out.print statements
*/
import java.util.Scanner;

public class HiCounter
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a phrase: ");
        // Read in the phrase (actually the whole line)
        String phrase = in.nextLine();

        // count how many times "hi" occurs.
        // YOUR CODE HERE
        int i = 0;
        int j = 1;
        int len = phrase.length();
        int count = 0;
        while (j + 1 <= phrase.length())
        {
            if (phrase.substring(i, j + 1).equals("hi"))
            {
                ++count;
            } 
            ++i;
            ++j;
        }
        System.out.println(count);
    }
}