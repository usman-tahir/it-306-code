
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class HouseApplication {

  public static void main(String[] args) {

    readAndSortOnPrice("./data.txt");

  }

  public static House[] readAndSortOnPrice(String filePath) {

    House[] houses = new House[100];
    Scanner read = null;

    try {
      read = new Scanner(new FileInputStream(filePath));
      while (read.hasNextLine()) {
        String line = read.nextLine();
        String address = line.substring(0, line.indexOf(";"));
        double price = Double.parseDouble(line.substring(line.indexOf(";") + 3, line.indexOf(";", line.indexOf(";") + 1)));
        String status = line.substring(line.lastIndexOf(";"));
        House house = new House(address, price, status);
        houses[House.getTotal() - 1] = house;
      }

      houses = insertionSort(houses);
      return houses;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;

  }

  public static House[] insertionSort(House[] houses) {

    int sorted = 1; // Assume the first element is sorted

    while (sorted < House.getTotal()) {
      // Start from the second element
      int s = sorted - 1; // Rear index to the sorted list
      int u = s + 1; // Beginning index to the unsorted list

      if (houses[u].getPrice() < houses[s].getPrice()) {
        while (s >= 0 && u <= House.getTotal() && houses[u].getPrice() < houses[s].getPrice()) {
          House temp = houses[u];
          houses[u] = houses[s];
          houses[s] = temp;
          u--;
          s--;
        }
        sorted++;
      } else {
        u++;
        sorted++;
      }
    }
    return houses;

  }

}