
public class Rectangle {

  private float width;
  private float length;

  // Default constructor
  public Rectangle() {
    this.width = 0.0f;
    this.length = 0.0f;
  }

  // Parameterized constructor (accepts a width and a length)
  public Rectangle(float width, float length) {
    this.width = width;
    this.length = length;
  }

  /**
   * Get and Set methods
   */
   public float getWidth() {
     return this.width;
   }

   public void setWidth(float width) {
     this.width = width;
   }

   public float getLength() {
     return this.length;
   }

   public void setLength(float length) {
     this.length = length;
   }

   public double getArea() {
     return (this.getWidth() * this.getLength());
   }

   public double getPerimeter() {
     return ((2 * this.getWidth()) + (2 * this.getLength()));
   }

   public String toString() {
     String output = "This rectangle has a width of " + this.getWidth() + " and a length of " + this.getLength();
     output += "\nIts area is " + this.getArea() + " and its perimeter is " + this.getPerimeter() + "";
     return output;
   }

}