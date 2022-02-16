public class Test8
{
	private static Student2 best = null;

    public static Student2 getBestStudent(Student2 [] student)
	{	
		best = student[0];
		int i;
		for(i=1; i < student.length; i++)
		{
			if(student[i].getMark() > best.getMark())
			{
				best = student[i];
			}
		}
	return best;
	}
}