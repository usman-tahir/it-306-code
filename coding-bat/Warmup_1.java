
public class Warmup_1 {
  public static void main(String[] args) {
    System.out.println(sleepIn(false, false)); // true
    System.out.println(sleepIn(true, false)); // false
    System.out.println(sleepIn(false, true)); // true
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

}