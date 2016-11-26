import java.util.HashSet;
import java.util.Set;
 
/**
 * @author Crunchify.com
 * 
 */
 
public class CrunchifyMarmutationExample {
 
	public static void main(String[] args) {
		String s = "ABC";
		//String s1 = "EBAY";
		//String s2 = "Yahoo";
		System.out.println("\nString " + s + ":\nPermutations: " + crunchifyPermutation(s));
		//System.out.println("\nString " + s1 + ":\nPermutations: " + crunchifyPermutation(s1));
		//System.out.println("\nString " + s2 + ":\nPermutations: " + crunchifyPermutation(s2));
	}
 
	public static Set<String> crunchifyPermutation(String str) {
		System.out.println("str: " + str);
		Set<String> crunchifyResult = new HashSet<String>();
		System.out.println("crunchifyResult: " + crunchifyResult);
		if (str == null) {
			System.out.println("str is null. Not added to crunchifyResult.");
			return null;
		} else if (str.length() == 0) {
			System.out.println("str is empty. Added to crunchifyResult");
			crunchifyResult.add("");
			System.out.println("crunchifyResult: " + crunchifyResult);
			return crunchifyResult;
		}
 
		char firstChar = str.charAt(0);
		System.out.println("firstchar: " + firstChar);
		String rem = str.substring(1);
		System.out.println("rem: " + rem);
		Set<String> words = crunchifyPermutation(rem);
		for (String newString : words) {
			System.out.println("newString: " + newString);
			System.out.println("words: " + words);
			for (int i = 0; i <= newString.length(); i++) {
				System.out.println("newString: " + newString);
				System.out.println("firstChar: " + firstChar);
				System.out.println("i: " + i);
				crunchifyResult.add(crunchifyCharAdd(newString, firstChar, i));
				System.out.println("crunchifyResult: " + crunchifyResult);
			}
		}
		return crunchifyResult;
	}
 
	public static String crunchifyCharAdd(String str, char c, int j) {
		System.out.println("str: " + str);
		System.out.println("c: " + c);
		System.out.println("j: " + j);
		String first = str.substring(0, j);
		String last = str.substring(j);
		System.out.println("first: " + first);
		System.out.println("last: " + last);
		System.out.println("return: " + first + c + last);
		return first + c + last;
	}
 
}