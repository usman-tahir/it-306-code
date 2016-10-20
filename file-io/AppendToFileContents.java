
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class AppendToFileContents {
  public static void main(String[] args) {
    try {
      String data = "\nLine 6\nLine 7\nLine 8\nLine 9\nLine 10";
      File file = new File("sample_5.txt");

      if (!file.exists()) {
        file.createNewFile();
      }

      FileWriter fileWriter = new FileWriter(file.getName(), true);
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
      bufferedWriter.write(data);
      bufferedWriter.close();
      System.out.println("Done writing to the file.");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}