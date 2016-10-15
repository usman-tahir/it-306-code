
public class TestInvoiceItem {

  public static void main(String[] args) {

    // Create a new Invoice item
    InvoiceItem invoiceItemOne = new InvoiceItem("1000", "Small snow shovel", 2, 14.99);

    // Print out the details of the item using the toString() method
    System.out.println(invoiceItemOne.toString());

  }

}