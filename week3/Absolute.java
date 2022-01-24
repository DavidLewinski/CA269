import java.util.Scanner;

public class Absolute
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        if (num < 0){
            int abs = num * -1;
            System.out.println("The absolute value is " + abs + '.');
        }
        else{
            System.out.println("The absolute value is " + num + '.');
        }

    }
}
