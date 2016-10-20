
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileExample {
  public static void main(String[] args) {
    FileOutputStream fileOutputStream = null;
    File file;
    String content = "Line 1\nLine 2\nLine 3\nLine 4\nLine 5";

    try {
      file = new File("./sample_4.txt");
      fileOutputStream = new FileOutputStream(file);

      if (!file.exists()) {
        file.createNewFile();
      }

      byte[] contentInBytes = content.getBytes();
      fileOutputStream.write(contentInBytes);
      fileOutputStream.flush();
      fileOutputStream.close();
      System.out.println("Done writing to the file.");
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (fileOutputStream != null) {
          fileOutputStream.close();
        }
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }
  }
}