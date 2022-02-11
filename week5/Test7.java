public class Test7
{
	public static int numberPasses(Student2 [] student)
	{
		int i;
        int total = 0;
		for(i=0; i<student.length; i++)
        {
            if (student[i].getMark() >= 40)
            {
                total += 1;
            }
		}
        return total;
	}
}