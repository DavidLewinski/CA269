public class BankAccount5
{
   double balance = 0;
   public BankAccount5()
   {
       balance = 100;
   }
   public void withdraw(double o)
   {
        balance = balance - o;
   }
   public String toString()
   {
       return "The balance is " + balance;
   }
}
