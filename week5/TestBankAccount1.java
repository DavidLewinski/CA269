public class TestBankAccount1
{
   public static void main(String [] args)
   {
      BankAccount1 currentAccount = new BankAccount1();

      currentAccount.balance = 60.05;

      System.out.println("The balance is " + currentAccount.balance);

      currentAccount.balance = currentAccount.balance + 10;

      System.out.println("The balance is " + currentAccount.balance);
   }
}