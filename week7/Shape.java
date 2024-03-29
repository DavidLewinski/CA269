public abstract class Shape
{
   private String name;

   public Shape(String name)
   {
      this.name = name;
   }

   abstract double area();

   public String toString()
   {
      return name + " with area " + area();
   }
}