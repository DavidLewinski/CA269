public class ExceptionMaker
{
    public static void main(String [] args)
    {
        int i = args.length;
        while(i > -1)
        {
            System.out.println(args[i]);
            --i;
        }
    }
}