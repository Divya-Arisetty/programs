package arraysStrings;

public class ValidMountainArray {

	public boolean validMountainArray(int[] A) {

		if (A.length < 3) {
			return false;
		}
		for (int i = 1; i < A.length - 1; i++) {
			if ((A[i - 1] < A[i]) & (A[i] > A[i + 1])) {
				if (checkMountainValue(A, i))
					return true;
			}
		}
		return false;
	}

	public boolean checkMountainValue(int[] A, int peakIndex) {
		for (int i = 0; i < peakIndex; i++) {

			if (A[i] >= A[i + 1]) {
				return false;
			}
		}
		for (int i = peakIndex; i < A.length - 1; i++) {

			if (A[i] <= A[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		ValidMountainArray mountainArray = new ValidMountainArray();
		int[] A = { 14, 82, 89, 84, 79, 70, 70, 68, 67, 66, 63, 60, 58, 54, 44,
				43, 32, 28, 26, 25, 22, 15, 13, 12, 10, 8, 7, 5, 4, 3 };
		System.out.println(mountainArray.validMountainArray(A));

	}

}
