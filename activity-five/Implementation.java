
public class Implementation {
  public static void main(String[] args) {
    String s = "(2 + 3) * [ (4 / 4 )]";
    System.out.println(validate(s));
  }

  public static boolean validate(String s) {
    // No space to the right
	final char LEFT_P = '(';
	
	// No space to the left
    final char RIGHT_P = ')';
	
	// No space to the right 
    final char LEFT_B = '[';
	
	// No space to the left
    final char RIGHT_B = ']';

    boolean failed = false;
	
	// Independent stack that sets the pace
    Stack mainStack = new Stack();
	
	// Dependent stack that stays one character ahead of the mainStack
	Stack oneAheadStack = new Stack();
	
	// Dependent stack that stays one character behind of the mainStack
	Stack oneBehindStack = new Stack();
	
	int strLength = s.length();
	
	LNode[] nodeArray = new LNode[strLength];
	
	/**
	* Store each character in a node.
	*/
	for(int i = 0; i < strLength; i += 1)
	{
		nodeArray[i] = new LNode(s.charAt(i), null);
	}
	
	/**
	* Link the nodes
	**/
	for(int i = 0; i < strLength; i += 1)
	{
		if(i!=strLength-1)
			nodeArray[i].setNext(nodeArray[++i]);
	}
	
	
	LNode currentNode = nodeArray[0];
	
	/**
	* Push each linked node on to the stack
	**/
	while(currentNode != null)
	{
		mainStack.push(currentNode);
		oneAheadStack.push(currentNode);
		oneBehindStack.push(currentNode);
		currentNode = currentNode.getNext();
	}
	
    System.out.println(mainStack.isEmpty());
	
	LNode currentNode2 = nodeArray[0];
    //char[] elements = new char[s.length()];
	
	int counter = 0;
	char peek = '\0';
	char peekAhead = '\0';
	char peekBehind = '\0';
	LNode nextNode = nodeArray[0];
	
    while(currentNode2 != null) {
		
		// gets ahead by popping first
		
		oneAheadStack.pop();
		peekAhead = oneAheadStack.pop();
		System.out.println("peekAhead: " + peekAhead);
		peek = mainStack.pop();
		
		System.out.println("peek: " + peek);
		
		nextNode = nextNode.getNext();
		
		if(peek=='(' && nextNode !=null)
		{	
			if(peekAhead==' ')
			{
				failed=true;
				System.out.println("No space to the right of open parenthesis allowed!");
			}
		}
		else if(peek==')' && nextNode !=null)
		{
			if(peekBehind==' ')
			{
				failed=true;
				System.out.println("No space to the right of close parenthesis allowed!");
			}
		}
		else if(peek=='[' && nextNode !=null)
		{
			if(peekAhead==' ')
			{
				failed=true;
				System.out.println("No space to the right of open bracket allowed!");
			}
		}
		else if(peek==']' && nextNode !=null)
		{
			if(peekBehind==' ')
			{
				failed=true;
				System.out.println("No space to the right of close bracket allowed!");
			}
		}
	
		// does not pop on the first iteration.
		// this allows it to be behind by one character.
		if(counter>0)
			peekBehind=oneBehindStack.pop();
		
		System.out.println("peekBehind: " + peekBehind);
		
		counter++;
		currentNode2 = currentNode2.getNext();
    }
    
    return failed;
  }

}