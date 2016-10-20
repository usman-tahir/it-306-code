
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
  public static void main(String[] args) {
    try {
      String content = "Line 1\nLine 2\nLine 3\nLine 4\nLine 5";

      File file = new File("./sample_5.txt");

      if (!file.exists()) {
        file.createNewFile();
      }

      FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
      bufferedWriter.write(content);
      bufferedWriter.close();
      System.out.println("Done writing to the file.");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}