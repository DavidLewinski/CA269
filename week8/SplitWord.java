/*
    This code is supplied and may be used to help solve this problem.
*/
import java.util.Scanner;

public class SplitWord
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        // Read in the word
        String word = in.next();
        int len = word.length();
        // YOUR CODE HERE
        int i = 0;
        int j = 1;
        while (j < len)
        {
            char ch1 = word.charAt(i);
            char ch2 = word.charAt(j);
            System.out.print(ch1);
            System.out.print(ch2);
            System.out.println();
            ++i;
            ++j;
        }
    }
}