
public class TestAccount {

  public static void main(String[] args) {

    // Create two accounts to test the Account class
    // No initial balance
    Account accountOne = new Account("0001", "John Doe");

    // Initial balance of $100
    Account accountTwo = new Account("0002", "Jane Doe", 100);

    // Add money to the John Doe account
    System.out.println(accountOne.toString());
    accountOne.credit(100);
    System.out.println(accountOne.toString());

    // Transfer $50 from John Doe to Jane Doe
    System.out.println("--- BEFORE TRANSFER ---");
    System.out.println(accountOne.toString());
    System.out.println(accountTwo.toString());
    accountOne.transferTo(accountTwo, 50.00);

    System.out.println("--- AFTER TRANSFER ---");
    System.out.println(accountOne.toString());
    System.out.println(accountTwo.toString());

    // Debit on the John Doe account (greater than the $50 remaining)
    accountOne.debit(75); // Should give an error message
    

  }

}