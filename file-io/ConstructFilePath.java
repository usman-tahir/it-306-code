
import java.io.File;
import java.io.IOException;

public class ConstructFilePath {
  public static void main(String[] args) {
    try {
      String fileName = "sample_2.txt";
      String workingDirectory = System.getProperty("user.dir");
      
      String absoluteFilePath = "";
      absoluteFilePath = workingDirectory + File.separator + fileName;
      System.out.println("Final file path: " + absoluteFilePath);

      File file = new File(absoluteFilePath);
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