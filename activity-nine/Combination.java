import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public class Combination {

	public static <T> Vector<Pair<T, T>> calcPermutations(Vector<T> vGeneric) {
		/**
		 * Initialize a generic vector pair that will hold all the permutations
		 * for v1 and v2
		 */
		Vector<Pair<T, T>> permutations = new Vector<Pair<T, T>>();

		if (vGeneric.isEmpty()) {
			return null;
		} else if (vGeneric.size() == 0) {
			permutations.add(new Pair((T) "", (T) ""));
			return permutations;
		}

		T firstElement = vGeneric.get(0);

		System.out.println("firstElement: " + firstElement);

		Vector<T> vGenericSub = new Vector<T>();

		/**
		 * Load sub
		 */
		for (int i = 0; i < vGeneric.size() - 1; i++) {
			if (vGeneric.get(i + 1) != null)
				vGenericSub.add(i, vGeneric.get(i + 1));
		}

		/**
		 * Print all that loaded in to sub
		 */
		for (int i = 0; i < vGenericSub.size(); i += 1) {
			System.out.println("vGeneric element " + i + ": " + vGenericSub.get(i));
		}

		/**
		 * Initialize Vector Pair to Recursive Method
		 */
		try {
			Vector<Pair<T, T>> pairs = calcPermutations(vGenericSub);

			System.out.println("pairs size: " + pairs.size());
			for (Pair<T, T> newPair : pairs) {
				for (int i = 0; i <= pairs.size(); i++) {
					permutations.add(pairSwap(newPair, firstElement));
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Pair Vector size: " + permutations.size());
		return permutations;
	}

	public static <T> Pair<T, T> pairSwap(Pair<T, T> newPair, T firstElement) {
		// swap
		Pair<T, T> pairSwap = new Pair<T, T>(newPair.getSecond(), firstElement);

		return pairSwap;
	}

	public static <T> String getPermutations(Vector<Pair<T, T>> pairVect) {
		System.out.println("Pair Vector size: " + pairVect.size());
		String out = "";
		Iterator<Pair<T, T>> iter = pairVect.iterator();
		while (iter.hasNext()) {
			Pair<T, T> cursor = ((Pair<T, T>) iter.next());
			out += cursor.getFirst() + ", " + cursor.getSecond() + "\n";
		}
		return out;
	}

	public static <T> void displayPermutations(Vector<String> v1, Vector<Double> v2) {
		/**
		 * Initialize a generic vector that will hold all elements for v1 and v2
		 */
		Vector<T> vGeneric = new Vector<T>();

		/**
		 * Load all elements of v1 and v2 into generic vector
		 */
		for (int i = 0; i < v1.size(); i += 1) {
			vGeneric.add((T) v1.get(i));
		}
		for (int i = 0; i < v2.size(); i += 1) {
			vGeneric.add((T) v2.get(i));
		}
		/**
		 * Print all that loaded in to vGeneric
		 */
		for (int i = 0; i < vGeneric.size(); i += 1) {
			System.out.println("vGeneric element " + i + ": " + vGeneric.get(i));
		}

		Vector<Pair<T, T>> anyType = Combination.calcPermutations(vGeneric);

		System.out.println("Printing Permutations: " + Combination.getPermutations(anyType));

	}

}
