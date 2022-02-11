public class BankAccount4
{
   double balance = 0;
   public BankAccount4(double n)
   {
       balance = n;
   }
   public void deposit(double o)
   {
        balance = balance + o;
   }
}
