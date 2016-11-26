
import java.util.Vector;

public class ActivityApplication {
  public static void main(String[] args) {
	  
    Vector<String> v1 = new Vector<String>();
    Vector<Double> v2 = new Vector<Double>();

   
    
    //create two vectors of any type
    //then create a pair vector that gets the permutations
    // A Permutation is an ordered Combination
    
    v1.addElement(new String("Tom"));
    v1.addElement(new String("Jon"));
    v1.addElement(new String("Mary"));
    v1.addElement(new String("Sam"));
    v1.addElement(new String("Nina"));
    v1.addElement(new String("Tara"));

    
    
    for (int i = 0; i < 5; i += 1) {
      v2.addElement(new Double(i + 99));
    }

    Vector<Pair<String, Double>> product = DotProduct.calcDotProduct(v1, v2);
    System.out.println("Printing DotProduct: " + DotProduct.display(product));
    System.out.println("\n\n");
    
    Combination.displayPermutations(v1, v2);
    

  }
  
  
}