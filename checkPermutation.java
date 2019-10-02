/*Given twostrings, write a method to decide if one is a permutation of the other*/

package arraysStrings;

@SuppressWarnings("javadoc")
public class checkPermutation {

	public boolean checkParentstringWithchildString(String childString,
			String parentString) {

		return parentString.contains(childString);

	}

	public static void main(String[] args) {

		checkPermutation permutation = new checkPermutation();
		System.out.println(
				permutation.checkParentstringWithchildString("Ravi", "RaviKiran"));
	}
}