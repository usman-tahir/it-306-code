
public class Warmup_1 {
  public static void main(String[] args) {
    // Tests conducted in the CodingBat editor before code is copied here
  }

  /*
    The parameter weekday is true if it is a weekday, and the parameter
    vacation is true if we are on vacation. We sleep in if it is not a
    weekday or we're on vacation. Return true if we sleep in.
  */
  public static boolean sleepIn(boolean weekDay, boolean vacation) {
    // Not a weekday / on vacation
    return (!weekDay || vacation);
  }

  /*
    We have two monkeys, a and b, and the parameters aSmile and bSmile
    indicate if each is smiling. We are in trouble if both of them are
    smiling, or neither of them are smiling. Return if we are in trouble.
  */
  public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    // If both monkeys match up, then return true
    return (aSmile == bSmile);
  }

  /*
    Given two int values, return their sum. Unless the two values are the
    same, then return double their sum.
  */
  public static int sumDouble(int a, int b) {
    if (a == b) {
      return (a + b) * 2;
    }
    return (a + b);
  }

  /*
    Given an int n, return the absolute difference between n and 21, except
    return double the absolute difference if n is over 21.
  */
  public static int diff21(int n) {
    int absoluteValue = Math.abs(21 - n);
    if (n > 21) {
      return absoluteValue * 2;
    }
    return absoluteValue;
  }

}