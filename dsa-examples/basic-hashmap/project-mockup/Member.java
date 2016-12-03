
public class Member {
  private int memberID;
  private String name;
  private double amountSpent;

  public Member(int memberID, String name) {
    this.memberID = memberID;
    this.name = name;
    this.amountSpent = 0.00;
  }

  public int getMemberID() {
    return this.memberID;
  }

  public String getName() {
    return this.name;
  }

  public double getAmountSpent() {
    return this.amountSpent;
  }

  public void setMemberID(int memberID) {
    this.memberID = memberID;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAmountSpent(double amountSpent) {
    this.amountSpent = amountSpent;
  }

  public String toString() {
    String output = "\n--- Member Information ---\n";
    output += "Member ID: " + this.memberID + "\nMember name: " + this.name + "\nAmount spent: $" + this.amountSpent;
    return output + "\n";
  }
}