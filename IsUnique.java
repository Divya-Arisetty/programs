
/* Implement an algorithm to determine if a string has all unique characters */

package arraysStrings;

import java.util.Hashtable;

@SuppressWarnings("javadoc")
public class IsUnique {

	// O(n*2)
	public boolean isUnique(String string) {
		for (int i = 0; i < string.length() - 1; i++) {
			for (int j = i; j < string.length() - 1; j++) {
				if (string.charAt(i) == string.charAt(j + 1))
					return false;
			}
		}
		return true;

	}

	// using hashtable -runtime O(1) in best, o(n)-worst

	public boolean isUniqueCheckingWithHash(String string) {
		Hashtable<Integer, String> hashTable = new Hashtable<Integer, String>();
		for (int i = 0; i < string.length(); i++) {
			if (hashTable.containsValue(String.valueOf(string.charAt(i)))) {
				return false;
			}
			hashTable.put(new Integer(i), String.valueOf(string.charAt(i)));
		}
		return true;

	}

	public static void main(String[] args) {
		IsUnique isUnique = new IsUnique();
		System.out.println(isUnique.isUniqueCheckingWithHash("Divya"));

	}
}
