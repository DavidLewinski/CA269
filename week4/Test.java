public class Test
{
    public static int getSum(int [] num)
    {
        int total = 0;
        for(int i : num)
        {
            total = total + i;
        }
        return total;
    }
}