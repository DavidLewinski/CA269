import java.util.Scanner;

public class ReducedString
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer and a string: ");
        int pos = in.nextInt();
        String word = in.next();
        String word1 = word.substring(0, pos);
        String word2 = word.substring(pos + 1, word.length());
        // Use the substring() method of the String class.
        System.out.println(word1 + word2);
    }
}