
public class ConvertHexToDec {

  public static void main(String[] args) {

    System.out.println(convert(15));

  }

  // Actual Decimal to Hex Conversion
  public static String convert(int n) {

    if (n < 16) {
      return symbol(n);
    } else {
      return convert(n / 16) + symbol(n % 16);
    }

  }

  // String conversion of numbers to characters
  public static String symbol(int n) {

    if (n <= 9) {
      return Integer.toString(n);
    }

    // Convert the number into the correct character
    switch(n) {
      case 10:
        return "A";
      case 11:
        return "B";
      case 12:
        return "C";
      case 13:
        return "D";
      case 14:
        return "E";
      case 15:
        return "F";
      default:
        return null;
    }

  }
  
}