
public class Deck {
  public static void main(String[] args) {
    // Card[] deckOfCards = populateDeckOfCards();
    CardStack deck = populateDeckOfCards();
    printCardStack(deck);
  }

  public static CardStack populateDeckOfCards() {
    String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    CardStack stack = new CardStack(52);
    int i, j;
    int k = 0;
    for (i = 0; i < suits.length; i += 1) {
      for (j = 0; j < values.length; j += 1) {
        Card c = new Card(suits[i], values[j]);
        stack.push(c);
      }
    }
    return stack;
  }

  public static void printCardStack(CardStack c) {
    if (c.isEmpty()) {
      System.out.println("There are no cards in the deck.");
    } else {
      System.out.println("This deck has the following cards:");
      while (!c.isEmpty()) {
        System.out.println(c.peek());
        c.pop();
      }
    }
  }

}