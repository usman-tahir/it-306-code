
import java.util.*;

public class Timer {
  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    /* Run algorithm */
    String s = repeatTwo('a', 100000000); // The algorithm that uses StringBuilder is more efficient with larger inputs
    long endTime = System.currentTimeMillis();
    long elapsedTime = endTime - startTime;
    System.out.println("Elapsed time: " + elapsedTime);
  }
  /**
    * Uses repeated concatenation to compose a String with n copies of a character c
  */
  public static String repeatOne(char c, int n) {
    String result = "";
    for (int j = 0; j < n; j++) {
      result += c;
    }
    return result;
  }

  /**
    * Uses StringBuilder to compose a String with n copies of character c
  */
  public static String repeatTwo(char c, int n) {
    StringBuilder s = new StringBuilder();
    for (int j = 0; j < n; j++) {
      s.append(c);
    }
    return s.toString();
  }
}