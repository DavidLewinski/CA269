public class Circle extends Shape
{
	public double radius;
	public Circle(String name, double r)
	{
		super(name);
		radius = r;
	}

	public double area()
	{
		return Math.PI * (radius * radius);
	}
}