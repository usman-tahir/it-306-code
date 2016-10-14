
public class TestCircle {

  public static void main(String[] args) {

    // Create a new circle (default)
    Circle circleOne = new Circle();

    // Create a new circle (radius only)
    Circle circleTwo = new Circle(12);

    // Create a new circle (radius and color)
    Circle circleThree = new Circle(6, "red");

    // Configure the first two circles
    circleOne.setRadius(2);
    circleOne.setColor("blue");

    circleTwo.setColor("green");

    // Print out the circle details with the toString() method
    System.out.println(circleOne.toString());
    System.out.println(circleTwo.toString());
    System.out.println(circleThree.toString());

  }

}