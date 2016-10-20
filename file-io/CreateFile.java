
import java.io.File;
import java.io.IOException;

public class CreateFile {
  public static void main(String[] args) {
    try {
      File file = new File("./sample.txt");
      if (file.createNewFile()) {
        System.out.println("The file was created.");
      } else {
        System.out.println("The file already exists.");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}