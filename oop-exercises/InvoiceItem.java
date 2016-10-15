
public class InvoiceItem {

  private String id;
  private String description;
  private int quantity;
  private double unitPrice;

  // Parameterized constructor
  public InvoiceItem(String id, String description, int quantity, double unitPrice) {
    this.id = id;
    this.description = description;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
  }

  /**
   *  Get and Set methods
   */
   public String getId() {
     return this.id;
   }

   public void setId(String id) {
     this.id = id;
   }

   public String getDescription() {
     return this.description;
   }

   public void setDescription(String description) {
     this.description = description;
   }

   public int getQuantity() {
     return this.quantity;
   }

   public void setQuantity(int quantity) {
     this.quantity = quantity;
   }

   public double getUnitPrice() {
     return this.unitPrice;
   }

   public void setUnitPrice(double unitPrice) {
     this.unitPrice = unitPrice;
   }

   // Quantity multiplied by unit price
   public double getTotal() {
     return (this.getQuantity() * this.getUnitPrice());
   }

   public String toString() {
     String output = "Invoice item information\n";
     output += "Item ID: " + this.getId() + "\nDescription: " + this.getDescription() + "\nQuantity: $" + this.getQuantity();
     output += "\nUnit Price: $" + this.getUnitPrice() + "\nTotal: $" + this.getTotal() + "\n";
     return output;
   }

}