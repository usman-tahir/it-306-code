
public class Warmup_1 {
  public static void main(String[] args) {
    System.out.println(sleepIn(false, false));
    System.out.println(sleepIn(true, false));
    System.out.println(sleepIn(false, true));
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
}