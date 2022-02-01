import java.util.Scanner;

public class WordRunner4
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.next();
        for(int i = 0; i < word.length(); i++)
            System.out.println(Word4.showLetter(word, word.charAt(i)));
    }
}