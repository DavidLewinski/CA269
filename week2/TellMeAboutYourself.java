import java.util.Scanner;

public class TellMeAboutYourself
{
    // Fill in the main method
    // This is almost the full solution - it has some errors.
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Tell me your name: ");
        String name = in.next();        // Note that the Scanner method, next(), reads in a word.
        System.out.print(name + " what is your age and what is your favourite colour?");
        String age = in.next();        // Note that the Scanner method, next(), reads in a word.
        String colour = in.next();        // Note that the Scanner method, next(), reads in a word.
    
        System.out.println("Hello " + name + ", you are " + age + " and your favourite colour is " + colour + ".");
    }
}

