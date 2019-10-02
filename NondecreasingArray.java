package arraysStrings;

public class NondecreasingArray {
	public boolean checkPossibility(int[] nums) {

		int count = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				nums[i + 1] = nums[i];
				count--;
			}
		}
		if (nums[nums.length - 2] > nums[nums.length - 1]) {
			nums[nums.length - 1] = nums[nums.length - 2];
			count--;
		}

		if (count < 0)
			return false;
		else {
			for (int i = 1; i < nums.length - 1; i++) {
				if (nums[i - 1] > nums[i] || nums[i] > nums[i + 1])
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		NondecreasingArray array = new NondecreasingArray();
		int[] Array = { 2, 3, 3, 2, 4 };
		System.out.println(array.checkPossibility(Array));

	}

}
