import java.util.ArrayList;

public class CardStack {
  private int top;
  private ArrayList<Card> deck;

  public CardStack (int capacity) {
    if (capacity <= 0) {
      throw new IllegalArgumentException("You must place at least one card in the deck.");
    }
    this.deck = new ArrayList<Card>(capacity);
    this.top = -1;
  }

  public int top() {
    return this.top;
  }

  public int size() {
    return this.deck.size();
  }

  public void push(Card card) {
    if (this.top == this.deck.size()) {
      throw new StackException("This deck of cards is already full.");
    }
    this.top++;
    this.deck.add(this.top, card);
  }

  public Card peek() {
    if (this.top == -1) {
      throw new StackException("This deck is empty.");
    }
    return this.deck.get(this.top);
  }

  public void pop() {
    if (this.top == -1) {
      throw new StackException("This deck is empty.");
    }
    this.top--;
  }

  public boolean isEmpty() {
    return this.top == -1;
  }

  public class StackException extends RuntimeException {
    public StackException(String message) {
      super(message);
    }
  }
}