
import java.io.*;

public class SuffixArrayImplementation {
  public static void main(String[] args) throws IOException {
    String text = "";
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the text string: ");
    text = bufferedReader.readLine();

    SuffixArray suffixArray = new SuffixArray(text);
    System.out.println();
    suffixArray.createSuffixArray();
  }
}