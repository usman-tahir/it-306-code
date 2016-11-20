
public class GenericBoxTester {
  public static void main(String[] args) {
    GenericBox<String> boxOne = new GenericBox<String>("Hello");
    String string = boxOne.getContent();
    System.out.println(boxOne);

    GenericBox<Integer> boxTwo = new GenericBox<Integer>(100);
    Integer integer = boxTwo.getContent();
    System.out.println(boxTwo);
  }
}