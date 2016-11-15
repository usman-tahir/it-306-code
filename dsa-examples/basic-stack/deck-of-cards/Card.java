
public class Card {
  private String suit;
  private String value;
  private String color;

  public Card() {
    this.suit = "";
    this.value = "";
    this.color = "";
  }

  public String getSuit() {
    return this.suit;
  }

  public String getValue() {
    return this.value;
  }

  public String getColor() {
    if (this.suit.equalsIgnoreCase("hearts") || this.suit.equalsIgnoreCase("diamonds")) {
      return "red";
    }
    return "black";
  }

  public void setSuit(String suit) {
    this.suit = suit;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String toString() {
    String output = this.getValue() + " of " + this.getSuit();
    return output;
  }
}