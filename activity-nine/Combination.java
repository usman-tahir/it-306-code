import java.util.Iterator;
import java.util.Vector;

public class Combination {
	
	public static <T> Vector<Pair<T, T>> calcPermutations(Vector<String> v1, Vector<Double> v2, Vector<T> v1AnyType,
			Vector<T> v2AnyType) {
	    if (v1.isEmpty() || v2.isEmpty()) {
	        return null;
	      }
	      Vector<Pair<T, T>> product = new Vector<Pair<T, T>>();
	      int size = Math.min(v1.size(), v2.size());
	   
	      for (int i = 0; i < size; i += 1) {
	    	  v1AnyType.addElement((T) new String((v1.get(i))));
	    	  v2AnyType.addElement((T) new Double((v2.get(i))));
	    	  

	    	  
	    	  // swap order
	    	  v1AnyType.addElement((T) new Double((v2.get(i))));
	    	  v2AnyType.addElement((T) new String((v1.get(i))));
	    	  
	    	  Pair<T, T> p = new Pair<T, T>(v1AnyType.get(i), v2AnyType.get(i));
	    	  product.add(p);
	      }
	      return product;
	}
	
	public static <T> String getPermutations(Vector<Pair<T, T>> pairVect) {
		System.out.println(pairVect.size());
		String out = "";
	    Iterator<Pair<T, T>> iter = pairVect.iterator();
	    while (iter.hasNext()) {
	      Pair<T, T> cursor = ((Pair<T, T>)iter.next());
	      out += cursor.getFirst() + ", " + cursor.getSecond() + "\n";
	    }
	    return out;
	}
	
	public static <T> void displayPermutations(Vector<String> v1, Vector<Double> v2)
	  {
		  Vector<T> v1AnyType = new Vector <T>();
		  Vector<T> v2AnyType = new Vector <T>();
	  	  Vector<Pair<T, T>> anyType =  Combination.calcPermutations(v1, v2, v1AnyType, v2AnyType);
	  	  System.out.println("Printing Permutations: " + Combination.getPermutations(anyType));
	  			  
	  			  
	  }

}
