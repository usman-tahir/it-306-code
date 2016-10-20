
import java.io.File;

public class DeleteFileExample {
  public static void main(String[] args) {
    try {
      File file = new File("./sample_2.txt");

      if (file.delete()) {
        System.out.println(file.getName() + " has been deleted.");
      } else {
        System.out.println("The delete operation failed.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}