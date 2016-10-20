
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {
  public static void main(String[] args) {
    File file = new File("./sample_3.txt");

    FileInputStream fileInputStream = null;
    BufferedInputStream bufferedInputStream = null;
    DataInputStream dataInputStream = null;

    try {
      fileInputStream = new FileInputStream(file);
      bufferedInputStream = new BufferedInputStream(fileInputStream);
      dataInputStream = new DataInputStream(bufferedInputStream);

      while (dataInputStream.available() != 0) {
        System.out.println(dataInputStream.readLine());
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        fileInputStream.close();
        bufferedInputStream.close();
        dataInputStream.close();
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }
  }
}