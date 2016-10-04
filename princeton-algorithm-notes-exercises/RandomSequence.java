import java.util.Random;

public class RandomSequence {

  // This class does not need to be instantiated
  private RandomSequence() {

  }

  /*
    Takes three command-line arguments (low, high, number), and prints out a list of
    random real numbers (equal to the number argument), between high and low
  */
  public static void main(String[] args) {

    switch (args.length) {
      // No arguments were entered
      case 0:
        System.out.println("You did not enter any arguments.");
        break;
      // Less than three arguments (required) were entered
      case 1:
      case 2:
        System.out.println("You did not enter enough arguments.");
        break;
      // The required number of arguments were entered
      case 3:
        int numberToGenerate = Integer.parseInt(args[2]);
        int lowerBound = Integer.parseInt(args[0]);
        int higherBound = Integer.parseInt(args[1]);
        Random random = new Random();

        for (int i = 0; i < numberToGenerate; i += 1) {
          System.out.println("Random number " + (i + 1) + ": " + ((random.nextInt(higherBound - lowerBound) + 1) + lowerBound));
        }
        break;
      // Too many arguments were entered
      default:
        System.out.println("You entered too many arguments.");
        break;
    }

  }

}