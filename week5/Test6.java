public class Test6
{
	public static void printForties(Student2 [] student)
	{
		int i;
		for(i=0; i<student.length; i++)
        {
            if (student[i].getMark() >= 40 && student[i].getMark() < 50)
            {
                System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
            }
		}
	}
}