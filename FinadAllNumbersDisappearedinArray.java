package arraysStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinadAllNumbersDisappearedinArray {

	public List<Integer> findDisappearedNumbers(int[] nums) {
		Arrays.sort(nums);
		List<Integer> list = new ArrayList<Integer>();
		int i = 1;
		int n = 0;
		while (n != nums.length - 1) {
			if (nums[n] != i) {
				list.add(i);
				i++;
			} else {
				n++;
				i++;
			}
		}

		return list;
	}

	public static void main(String[] args) {
		FinadAllNumbersDisappearedinArray disappearedinArray = new FinadAllNumbersDisappearedinArray();
		int[] array = { 4, 5, 6, 7, 8, 9 };
		List<Integer> list = new ArrayList<Integer>();
		list = disappearedinArray.findDisappearedNumbers(array);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
