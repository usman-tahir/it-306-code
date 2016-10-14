
public class Circle {
  
  private double radius;
  private String color;

  // Default constructor
  public Circle() {
    this.radius = 0.0;
    this.color = "white";
  }

  // Parameterized constructor (accepts a radius)
  public Circle(double radius) {
    this.radius = radius;
    this.color = "white";
  }

  // Parameterized constructor (accepts a radius and a color)
  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  /**
   * Get and Set methods
   */
   public double getRadius() {
     return this.radius;
   }

   public void setRadius(double radius) {
     this.radius = radius;
   }

   public String getColor() {
     return this.color;
   }

   public void setColor(String color) {
     this.color = color;
   }

   public double getArea() {
     return (radius * radius) * Math.PI;
   }

   public String toString() {
     return "This circle is " + this.getColor() + " with a radius of " + this.getRadius() + " and an area of " + this.getArea() + "\n";
   }

}