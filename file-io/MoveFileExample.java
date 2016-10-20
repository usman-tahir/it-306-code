
import java.io.File;

public class MoveFileExample {
  public static void main(String[] args) {
    try {
      File fileOne = new File("./a.txt");
      if (fileOne.renameTo(new File("./dest/" + fileOne.getName()))) {
        System.out.println("The file was successfully moved.");
      } else {
        System.out.println("The file count not be moved.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}