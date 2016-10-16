
public class TestRectangle {

  public static void main(String[] args) {

    // Create two rectangles; a default one and a parameterized one
    Rectangle rectangleOne = new Rectangle();
    Rectangle rectangleTwo = new Rectangle(12, 14);

    // Modify the properties of the default rectangle;
    rectangleOne.setWidth(2);
    rectangleOne.setLength(2);

    // Display the information for each rectangle with toString()
    System.out.println(rectangleOne.toString());
    System.out.println(rectangleTwo.toString());

  }

}