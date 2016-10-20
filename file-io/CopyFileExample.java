
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileExample {
  public static void main(String[] args) {
    InputStream inputStream = null;
    OutputStream outputStream = null;

    try {
      File fileOne = new File("a.txt");
      File fileTwo = new File("b.txt");

      inputStream = new FileInputStream(fileOne);
      outputStream = new FileOutputStream(fileTwo);

      byte[] buffer = new byte[1024];
      int length;

      while ((length = inputStream.read(buffer)) > 0) {
        outputStream.write(buffer, 0, length);
      }

      inputStream.close();
      outputStream.close();

      System.out.println("The file was successfully copied.");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}