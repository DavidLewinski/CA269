public class Test5
{
	public static void printHonours(Student2 [] student)
	{
		int i;
		for(i=0; i<student.length; i++)
        {
            if (student[i].getMark() >= 55)
            {
                System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
            }
		}
	}
}
