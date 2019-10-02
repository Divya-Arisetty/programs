package arraysStrings;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {

	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			set.add(nums1[i]);
		}

		Set<Integer> set2 = new HashSet<Integer>();
		for (int i = 0; i < nums2.length; i++) {
			set2.add(nums2[i]);
		}

		set2.retainAll(set);

		int[] Array = new int[set2.size()];
		int i = 0;
		for (int i1 : set2)
			Array[i++] = i1;

		return Array;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
