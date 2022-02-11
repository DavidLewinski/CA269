public class Test4
{
	public static void print(Student2 [] student)
	{
		int i;
		for(i=0; i<student.length; i++)
        {
				System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
		}
	}
}
