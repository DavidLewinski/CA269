import java.util.Scanner;

public class Main4
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        String name = in.nextLine();
        
        Animal2 ani = new Animal2(name);
        System.out.println(ani.greeting());
    }
}