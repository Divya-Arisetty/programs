package arraysStrings;

public class monotoneArray {

	public boolean isMonotonic(int[] A) {
		if (isGreater(A)) {
			for (int i = 0; i < A.length - 1; i++) {
				if (A[i] < A[i + 1])
					return false;
			}

		} else {
			for (int i = 0; i < A.length - 1; i++) {
				if (A[i] > A[i + 1])
					return false;
			}

		}
		return true;

	}

	public boolean isGreater(int[] A) {
		for (int i = 0; i < A.length; i++) {
			if (A[i] < A[i + 1])
				return false;
			else if (A[i] > A[i + 1])
				return true;
		}
		return false;
	}

	public static void main(String[] args) {

		monotoneArray array = new monotoneArray();
		int[] A = { 4, 4, 4, 4, 5 };
		System.out.println(array.isMonotonic(A));

	}

}
