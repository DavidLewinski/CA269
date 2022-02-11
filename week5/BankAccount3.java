public class BankAccount3
{
   double balance = 0;
   public BankAccount3(double n)
   {
       balance = n;
   }
   public void withdraw(double o)
   {
        balance = balance - o;
   }
}