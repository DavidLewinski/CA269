public class Test9
{
	public static double getPassingAverage(Student2 [] student)
	{
		int i;
        int passed = 0;
        double total = 0;
        double average = 0.0;
        for(i=0; i<student.length; i++)
        {
            if (student[i].getMark() >= 40)
            {
                total += student[i].getMark();
                ++passed;
            }
		}
        average = total / passed;
        return average;
    }
}
