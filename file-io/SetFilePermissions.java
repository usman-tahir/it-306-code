
import java.io.File;
import java.io.IOException;

public class SetFilePermissions {
  public static void main(String[] args) {
    try {
      File file = new File("./shellscript.sh");
      if (file.exists()) {
        System.out.println("Is execute allowed? " + file.canExecute());
        System.out.println("Is write allowed? " + file.canWrite());
        System.out.println("Is read allowed? " + file.canRead());
      }

      file.setExecutable(false);
      file.setReadable(false);
      file.setWritable(false);
      System.out.println("Is execute allowed? " + file.canExecute());
      System.out.println("Is write allowed? " + file.canWrite());
      System.out.println("Is read allowed? " + file.canRead());

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