
public class TransactionObject {
  private int memberID;
  private int storeID;
  private double amountSpent;

  public TransactionObject(int memberID, int storeID, double amountSpent) {
    this.memberID = memberID;
    this.storeID = storeID;
    this.amountSpent = amountSpent;
  }

  public int getMemberID() {
    return this.memberID;
  }

  public int getStoreID() {
    return this.storeID;
  }

  public double getAmountSpent() {
    return this.amountSpent;
  }

  public void setMemberID(int memberID) {
    this.memberID = memberID;
  }

  public void setStoreID(int storeID) {
    this.storeID = storeID;
  }

  public void setAmountSpent(double amountSpent) {
    this.amountSpent = amountSpent;
  }

  public String toString() {
    String output = "--- Transaction Information ---\n";
    output += "Member ID: " + this.memberID + "\nStore ID: " + this.storeID + "\nAmount spent: $" + this.amountSpent + "\n";
    return output;
  }
}