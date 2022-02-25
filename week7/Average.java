public abstract class Average
{
    abstract double area();
    static int count;
    static double sum, total;
    static double averageArea(Shape [] shapes)
    {
        for (Shape shape : shapes)
        {
            sum += shape.area();
            ++count;
        }
        return sum / count;
    }
}