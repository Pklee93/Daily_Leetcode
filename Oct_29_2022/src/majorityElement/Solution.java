/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 */

package majorityElement;

import java.util.HashMap;
import java.util.Map;

public class Solution {
//    public int majorityElement(int[] nums) {
//    	float maj = nums.length / 2;
//    	Map<Integer, Integer> map = new HashMap<>();
//    	for (int i = 0; i < nums.length; i++) {
//    		if (map.containsKey(nums[i])) {
//    			map.put(nums[i], map.get(nums[i]) + 1);
//    		} else {
//    			map.put(nums[i], 1);
//    		}
//    	}
//    	int result = 0;
//    	for (Integer key : map.keySet()) {
//    		if (map.get(key) > maj) {
//    			result = key;
//    		}
//    	}
//    	
//        return result;
//    }
	
	public int majorityElement(int[] nums) {
		int result = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                result = nums[i];
                count = 1;
            } else if (result == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return result;
	}

}
