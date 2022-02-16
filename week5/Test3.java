public class Test3
{
	public static void print(Student1 [] student)
	{
		int i;
		for(i=0; i<student.length; i++)
        {
				System.out.println(student[i].mark + " (" + student[i].name + ")");
		}
	}
}
