/* Write a method to replace all spaces in a string with '%20' */
package arraysStrings;

@SuppressWarnings("javadoc")
public class URLify {

	public String convertSpace(String word) {

		char[] stringToCharArray = word.toCharArray();
		for (int i = 0; i <= stringToCharArray.length; i++) {
			if (Character.isWhitespace(stringToCharArray[i])) {
				stringToCharArray[i] = 'a';
			}
		}
		return word;
	}

	public static void main(String[] args) {

	}

}
