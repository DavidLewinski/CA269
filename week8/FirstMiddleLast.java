import java.util.Scanner;

public class FirstMiddleLast
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        int len = word.length();
        String ch1 = word.substring(0, 1);
        String middle = word.substring(1, len - 1);
        String ch2 = word.substring(len - 1, len);

        System.out.println(ch1);
        System.out.println(middle);
        System.out.println(ch2);
    }
}