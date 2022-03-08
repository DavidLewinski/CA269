public class TotalArgs
{
    public static void main(String [] args)
    {
        int i = 0;
        int total = 0;
        for(String each: args)
        {
            int each1 = Integer.parseInt(each);
            total += each1;
            ++i;
        }
        System.out.println("The sum of all the args is " + total + ".");
    }
}