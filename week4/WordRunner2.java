import java.util.Scanner;

public class WordRunner2
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word and a letter:");
        String word = input.next();
        String letters = input.next();
        
        String in = "";
        String notIn = "";
        for(int i = 0; i < letters.length(); i++)
            if(Word2.containsLetter(word, letters.charAt(i)))
                in += letters.charAt(i);
            else
                notIn += letters.charAt(i); // add to list of letters 
        
        System.out.println(in + " are in " + word + ".");
        System.out.println(notIn + " are not in " + word + ".");
    }
}