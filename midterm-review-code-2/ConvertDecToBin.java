
public class ConvertDecToBin {
  public static void main(String[] args) {
    System.out.println(convertDecToBin(123));
  }

  public static String convertDecToBin(int number) {
    if (number < 0) {
      return "";
    }
    if (number >= 0 && number < 2) {
      return number + "";
    } else {
      return convertDecToBin(number / 2) + (number % 2);
    }
  }
}