
public class Recursion {
  public static void main(String[] args) {

    int factorialOfFive = factorial(5);
    System.out.printf("5 factorial is %d\n", factorialOfFive);
  }

  // Factorial with Recursion
  public static int factorial(int number) {
    if (number == 0) {
      return 1;
    } else {
      return number * factorial(number - 1);
    }
  }

  // English ruler example from class
  public static void drawRuler(int numberOfInches, int majorLength) {
    drawLine(majorLength, 0);
    for (int j = 1; j < numberOfInches; j += 1) {
      drawInterval(majorLength - 1);
      drawLine(majorLength, j);
    }
  }

  private static void drawLine(int tickLength, int tickLabel) {
    for (int j = 0; j < tickLength; j += 1) {
      System.out.print("-");
    }
    if (tickLabel >= 0) {
      System.out.print(tickLabel);
      System.out.print("\n");
    }
  }

  private static void drawInterval(int centralLength) {
    if (centralLength >= 1) {
      drawInterval(centralLength - 1);
      drawLine(centralLength, -1);
      drawInterval(centralLength - 1);
    }
  }

}