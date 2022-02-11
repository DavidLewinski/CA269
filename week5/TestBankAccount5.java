public class TestBankAccount5
{
   public static void main(String [] args)
   {
      BankAccount5 account = new BankAccount5(); // This uses the default constructor.

      System.out.println(account);
      account.withdraw(25);

      System.out.println(account);
   }
}
