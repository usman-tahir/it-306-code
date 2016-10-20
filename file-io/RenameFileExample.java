
import java.io.File;

public class RenameFileExample {
  public static void main(String[] args) {
    File oldFile = new File("old_file.txt");
    File newFile = new File("new_file.txt");

    if (oldFile.renameTo(newFile)) {
      System.out.println("The file renaming was successful.");
    } else {
      System.out.println("The file renaming failed.");
    }
  }
}