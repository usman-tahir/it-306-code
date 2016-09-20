
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

  /*
    We have a loud talking parrot. The "hour" parameter is the current hour time
    in the range 0..23. We are in trouble if the parrot is talking and the hour
    is before 7 or after 20. Return true if we are in trouble.
  */
  public static boolean parrotTrouble(boolean talking, int hour) {
    boolean beforeSeven = hour < 7;
    boolean afterTwenty = hour > 20;
    return (talking && (beforeSeven || afterTwenty));
  }

  /*
    Given two ints, a and b, return true if one of them is 10 or if their sum is 10.
  */
  public static boolean makes10(int a, int b) {
    return ((a == 10 || b == 10) || (a + b == 10));
  }

  /*
    Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num)
    computes the absolute value of a number.
  */
  public static boolean nearHundred(int n) {
    boolean withinTen = (Math.abs(100 - n) <= 10);
    boolean withinTwenty = (Math.abs(200 - n) <= 10);
    return (withinTen || withinTwenty);
  }

}