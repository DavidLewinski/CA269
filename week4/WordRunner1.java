import java.util.Scanner;

public class WordRunner1
{
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word and a letter:");
        String word = in.next();
        String letters = in.next();
        
        char first = 0;
        String notFirst = "";
        for(int i = 0; i < letters.length(); i++)
            if(Word.isFirstLetter(word, letters.charAt(i)))
                first = letters.charAt(i);
            else
                notFirst += letters.charAt(i); // add to list of letters 
        
        System.out.println(first + " is the first letter of " + word + ".");
        System.out.println(notFirst + " are not the first letter of " + word + ".");
    }
}