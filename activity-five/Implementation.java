
public class Implementation {
  public static void main(String[] args) {
    String s = "(2 + 3) * [ (4 / 4 )]";
    System.out.println(validate(s));
  }

  public static boolean validate(String s) {
    final char LEFT_P = '(';
    final char RIGHT_P = ')';
    final char LEFT_B = '[';
    final char RIGHT_B = ']';
    boolean failed = false;
    Stack stack = new Stack();
	
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
	* Push each linked node to a stack
	**/
	while(currentNode != null)
	{
		stack.push(currentNode);
		currentNode = currentNode.getNext();
	}
    System.out.println(stack.isEmpty());
	
	LNode currentNode2 = nodeArray[0];
    //char[] elements = new char[s.length()];
    while(currentNode2 != null) {
      if(stack.pop()!=' ')
	  {
		failed=true;
		break;
	  }
	  else
		currentNode2 = currentNode2.getNext();
    }
    
    return failed;
  }

}