public class TestBankAccount4
{
   public static void main(String [] args)
   {
      BankAccount4 currentAccount = new BankAccount4(10000.00);

      System.out.println("The balance is " + currentAccount.balance);

      currentAccount.deposit(100.00);

      System.out.println("The balance is " + currentAccount.balance);
   }
}
