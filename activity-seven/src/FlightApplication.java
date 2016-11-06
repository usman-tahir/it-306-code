/**
 * Module 8 Activity (Activity 7)
 * Phillip Ramirez, Usman Tahir
 * IT 306
 * 
 */
public class FlightApplication {
  public static void main(String[] args) {
    UnsortedPriorityQueue flights = new UnsortedPriorityQueue();
    flights.add(new Flight("0001", false, 0));
    flights.add(new Flight("0002", true, 365));
    flights.add(new Flight("0003", true, 943));

     while (!flights.isEmpty()) {
       System.out.println(flights.removeMin());
     }
  }
}