
public class SuffixArray {
  private String[] text;
  private int length;
  private int[] index;
  private String[] suffix;

  public SuffixArray(String text) {
    this.text = new String[text.length()];
    this.length = text.length();
    for (int i = 0; i < this.length; i += 1) {
      this.text[i] = text.substring(i, i + 1);
    }

    this.index = new int[this.length];
    for(int i = 0; i < this.length; i += 1) {
      this.index[i] = i;
    }

    this.suffix = new String[this.length];
  }

  public void createSuffixArray() {
    for (int i = 0; i < this.length; i += 1) {
      String text = "";
      for (int t = i; t < this.length; t += 1) {
        text += this.text[t];
      }
      this.suffix[i] = text;
    }
    int back;
    for (int iter = 1; iter < this.length; iter += 1) {
      String key = this.suffix[iter];
      int keyIndex = this.index[iter];

      for (back = iter - 1; back >= 0; back -= 1) {
        if (this.suffix[back].compareTo(key) > 0) {
          this.suffix[back + 1] = this.suffix[back];
          this.index[back + 1] = this.index[back];
        } else {
          break;
        }
      }
      this.suffix[back + 1] = key;
      this.index[back + 1] = keyIndex;
    }

    System.out.println("Suffix\tIndex");
    for (int iterate = 0; iterate < this.length; iterate += 1) {
      System.out.println(this.suffix[iterate] + "\t" + this.index[iterate]);
    }
  }
}