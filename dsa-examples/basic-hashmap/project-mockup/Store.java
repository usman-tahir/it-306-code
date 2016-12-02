
public class Store {
  private int storeID;
  private String storeOwner;
  private double totalTransactionAmount;

  public Store(int storeID, String storeOwner) {
    this.storeID = storeID;
    this.storeOwner = storeOwner;
    this.totalTransactionAmount = 0.00;
  }

  public int getStoreID() {
    return this.storeID;
  }

  public String getStoreOwner() {
    return this.storeOwner;
  }

  public double getTotalTransactionAmount() {
    return this.totalTransactionAmount;
  }

  public void setStoreID(int storeID) {
    this.storeID = storeID;
  }

  public void setStoreOwner(String storeOwner) {
    this.storeOwner = storeOwner;
  }

  public void setTotalTransactionAmount(double totalTransactionAmount) {
    this.totalTransactionAmount = totalTransactionAmount;
  }

  public String toString() {
    String output = "--- Store Details ---\n";
    output += "Store ID: " + this.storeID + "\nStore Owner: " + this.storeOwner + "\nTotal transactions: $" + this.totalTransactionAmount;
    return output + "\n";
  }
}