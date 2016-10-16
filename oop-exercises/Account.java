
public class Account {

  private String id;
  private String name;
  private double balance;

  public Account(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public Account(String id, String name, double balance) {
    this.id = id;
    this.name = name;
    this.balance = balance;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double credit(double amount) {
    this.balance = this.getBalance() + amount;
    return this.balance;
  }

  public double debit(double amount) {
    if (this.getBalance() >= amount) {
      this.balance -= amount;
    } else {
      System.out.println("Amount exceeded balance.");
    }
    return this.balance;
  }

  public double transferTo(Account otherAccount, double amount) {
    if (this.getBalance() >= amount) {
      otherAccount.setBalance(otherAccount.getBalance() + amount);
      this.balance -= amount;
    } else {
      System.out.println("Amound exceeded balance.");
    }
    return this.balance;
  }

  public String toString() {
    String output = "Account Information\n";
    output += "Account ID: " + this.getId() + "\nAccount holder's name: " + this.getName() + "\nCurrent balance: $" + this.getBalance();
    return output + "\n";
  }

}