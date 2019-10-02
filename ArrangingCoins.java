package arraysStrings;

public class ArrangingCoins {

	public int arrangeCoins(int n) {
		int i = 0;
		while (n != 0) {
			i++;
			if (n < i) {
				return i - 1;
			}
			n = n - i;

			System.out.println(i + "," + n);
		}
		return i;
	}

	public static void main(String[] args) {
		ArrangingCoins arrangingCoins = new ArrangingCoins();
		System.out.println(arrangingCoins.arrangeCoins(6));

	}

}
