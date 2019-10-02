package arraysStrings;

public class RotateArray {

	public int[] rotate(int[] nums, int k) {
		int array[] = new int[nums.length];
		int shift = nums.length - (k);
		for (int i = shift, j = 0; i < array.length; i++, j++) {
			System.out.println(i + "," + j);
			array[j] = nums[i];
		}

		for (int i = 0, j = array.length - shift; i < shift; i++, j++) {
			array[j] = nums[i];
		}
		System.arraycopy(array, 0, nums, 0, nums.length);
		return nums;
	}

	public static void main(String[] args) {
		RotateArray array = new RotateArray();
		int tempArray[] = { 1, 2, 3, 4, 5, 6, 7 };
		tempArray = (array.rotate(tempArray, 3));

		for (int i = 0; i < tempArray.length; i++) {
			System.out.print(tempArray[i]);
		}

	}

}
