
import java.io.*;

public class FindCertainExtension {
  private static final String FILE_DIRECTORY = "./";
  private static final String FILE_TEXT_EXTENSION = ".txt";

  public static void main(String[] args) {
    new FindCertainExtension().listFile(FILE_DIRECTORY, FILE_TEXT_EXTENSION);
  }

  public void listFile(String folder, String extension) {
    GenericExtFilter filter = new GenericExtFilter(extension);
    File directory = new File(folder);

    if (directory.isDirectory() == false) {
      System.out.println(FILE_DIRECTORY + ": This directory does not exist");
      return;
    }

    String[] list = directory.list(filter);

    if (list.length == 0) {
      System.out.println("No files in this directory end with the extension '" + extension + "'.");
      return;
    }

    for (String file : list) {
      String temp = new StringBuffer(FILE_DIRECTORY).append(File.separator).append(file).toString();
      System.out.println("File found: '" + temp + "'");
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