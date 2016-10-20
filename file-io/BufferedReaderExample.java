
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
  public static void main(String[] args) {
    BufferedReader bufferedReader = null;

    try {
      String currentLine;
      bufferedReader = new BufferedReader(new FileReader("./sample_3.txt"));
      
      while ((currentLine = bufferedReader.readLine()) != null) {
        System.out.println(currentLine);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (bufferedReader != null) {
          bufferedReader.close();
        }
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }
  }
}