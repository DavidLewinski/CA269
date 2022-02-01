import java.util.Scanner;

public class WordRunner3
{
    // generate the alphabet
    static String getAlphabet()
    {
        String alphabet = "";
        for(int i = 0; i < 26; i++)
            alphabet += (char) ('a' + i);
            
        return alphabet;
    }
    
    static void test(String word, String guesses)
    {
        System.out.println("allDone(\"" + word + "\", \"" + guesses + "\") is " + Word3.allDone(word, guesses));
    }
    
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        String alphabet = getAlphabet();
        System.out.println("Enter a word:");
        String word = input.next();
        
        // 1. Try the complete alphabet
        test(word, alphabet);
        // 2. Try an empty string
        test(word, "");
        
        // 3. Try leaving out one letter each time (almost right)
        for(int miss = 0; miss < word.length(); miss++)
        {
            String guesses = "";
            for(int i = alphabet.length() - 1; i >= 0; i--)
                if(alphabet.charAt(i) != word.charAt(miss))
                    guesses += alphabet.charAt(i);
                    
            test(word, guesses);
        }
    }
}