
public class Average {

  // This class does not need to be instantiated
  private Average() {

  }

  public static void main(String[] args) {
    
    int count = 0;
    double sum = 0.0;

    // Read the arguments in and compute the sum
    for (String number : args) {
      double value = Double.parseDouble(number);
      sum += value;
      count++;
    }

    // Compute the average
    double average = sum / count;

    // Print the results
    System.out.println("The average is: " + average);
    
  }

}