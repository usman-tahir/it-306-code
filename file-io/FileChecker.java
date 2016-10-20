
import java.io.*;

public class FileChecker {
  private static final String FILE_DIRECTORY = "./";
  private static final String FILE_TEXT_EXTENSION = ".txt";

  public static void main(String[] args) {
    new FileChecker().deleteFile(FILE_DIRECTORY, FILE_TEXT_EXTENSION);
  }

  public void deleteFile(String folder, String extension) {
    GenericExtFilter filter = new GenericExtFilter(extension);
    File directory = new File(folder);

    String[] list = directory.list(filter);
    if (list.length == 0) {
      return;
    }

    File fileDelete;

    for (String file : list) {
      String temp = new StringBuffer(FILE_DIRECTORY).append(File.separator).append(file).toString();
      fileDelete = new File(temp);
      boolean isDeleted = fileDelete.delete();
      System.out.println("file '" + temp + "' was deleted: " + isDeleted);
    }
  }

  public class GenericExtFilter implements FilenameFilter {
    private String extension;

    public GenericExtFilter(String extension) {
      this.extension = extension;
    }

    public boolean accept(File directory, String name) {
      return (name.endsWith(this.extension));
    }
  }

}