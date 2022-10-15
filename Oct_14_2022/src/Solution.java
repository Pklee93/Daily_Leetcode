/*
 * Given an integer array num sorted in non-decreasing order.
 * Remove the duplicates in-place
 * Do not allocate extra space for another array.
 */
import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int removeDuplicates(int[] nums) {
		int count = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				count++;
			} else {
				nums[i - count] = nums[i];
			}
		}
		return nums.length - count;
	}

}
