
public class House {

  private String address;
  private double price;
  private String status;
  private static int total;

  public House(String address, double price, String status) {
    this.address = address;
    this.price = price;
    this.status = status;
    total += 1;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public static int getTotal() {
    return total;
  }

}