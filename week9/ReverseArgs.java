public class ReverseArgs
{
    public static void main(String [] args)
    {
        int i = args.length - 1;
        while(i > -1)
        {
            System.out.print("args["+i+"] = ");
            System.out.println(args[i]);
            --i;
        }
    }
}