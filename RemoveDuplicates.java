package arraysStrings;

public class RemoveDuplicates {
	public int[] removeDuplicates(int[] nums) {
		int index = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[index] != nums[i]) {
				index++;
				nums[index] = nums[i];
			}
		}

		return nums;

	}

	public static void main(String[] args) {
		RemoveDuplicates duplicates = new RemoveDuplicates();
		int[] Array = { 1, 1, 2, 3, 4, 4 };
		Array = duplicates.removeDuplicates(Array);
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i]);
		}

	}

}
