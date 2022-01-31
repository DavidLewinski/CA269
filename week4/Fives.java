public class Fives
{
    public static int countFives(int [] num)
    {
        int total = 0;
        for(int i : num)
        {
            if(i == 5)
            {
                total++;
            }
        }
        return total;
    }
}