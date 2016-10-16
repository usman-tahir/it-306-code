/**
* Divide n by base of 16
* Remainder is converted to hex (symbol or number between 9).
* Base case: n is less than 16 therefore being able to be converted into a number or a symbol. Because if it is less
* than 16 it can't boil down into a smaller number because we're dealing with hex which is base 16.
* Recurse case: n is greater than 16 therefore being able to be simplified in order to be converted into a symbol
*/
public class ConvertHexToDec {

  public static void main(String[] args) {

    System.out.println(convert(909));

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