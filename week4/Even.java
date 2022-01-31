public class Even
{
    public static int countEven(int [] num)
    {
        int total = 0;
        for(int i : num)
        {
            if(i % 2 == 0)
            {
                total++;
            }
        }
        return total;
    }
}