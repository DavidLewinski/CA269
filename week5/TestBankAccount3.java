public class TestBankAccount3
{
   public static void main(String [] args)
   {
      BankAccount3 currentAccount = new BankAccount3(10000.00);

      System.out.println("The balance is " + currentAccount.balance);

      currentAccount.withdraw(100.00);

      System.out.println("The balance is " + currentAccount.balance);
   }
}