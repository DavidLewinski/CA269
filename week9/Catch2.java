public class Catch2
{
   public static void main(String [] args)
   {
       try
       {
            Broken broke = new Broken();
        
            System.out.println("Testing");
            broke.cracked();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException");
        }
        catch(NullPointerException e)
        {
            System.out.println("NullPointerException");
        }
        System.out.println("Finally!");
    }
}
