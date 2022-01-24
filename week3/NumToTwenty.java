import java.util.Scanner;

public class NumToTwenty
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        while(num <= 20) // Keep looping as long as some condition is true
        {
            System.out.print(num + " ");
            num++; // Modify num
        }

        System.out.println(); // Finish with a new line.
    }
}
