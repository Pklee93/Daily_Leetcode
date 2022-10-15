/*
 * Given an integer array num sorted in non-decreasing order.
 * Remove the duplicates in-place
 * Do not allocate extra space for another array.
 */
import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int removeDuplicates(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		int idx = 0;
		int length = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], null);
				nums[idx] = nums[i];
				idx++;
				length++;
			} 
		}
		
		return length;
	}

}
