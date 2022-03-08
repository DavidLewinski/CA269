public class Args
{
    public static void main(String [] args)
    {
        int i = 0;

        for(String each: args)
        {
            System.out.print("args["+i+"] = ");
            System.out.println(each);
            ++i;
        }
    }
}