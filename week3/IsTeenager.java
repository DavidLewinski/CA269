import java.util.Scanner;

public class IsTeenager
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int num = in.nextInt();
        if ((num >= 13) & (num <= 19)){
            System.out.println("You are a teenager.");
        }
        else{
            System.out.println("You are not a teenager.");
        }

    }
}


