/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
 */

package singleNumber;

import java.util.HashMap;
import java.util.Map;

public class Solution {
//	First Approach. Works, but slow and lots memory
//	
//	public int singleNumber(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//        	if (map.containsKey(nums[i])) {
//        		map.remove(nums[i]);
//        	} else {
//        		map.put(nums[i], 0);
//        	}
//        }
//        int val = 0;
//        for(Integer key : map.keySet()) {
//        	val = key;
//        }
//        return val;
//    }
	
//	XOR Operator? 
/*
A	 |B		| A XOR B
true |true	| false
T	 |F		| T
F	 |T		| T
F	 |F		| F
 */
	public int singleNumber(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result ^= nums[i];
		}
		return result;
	}
	/*
	EX) nums = [4, 1, 2, 1, 2]
	4 = 0100	    0101	    0111	    0110
	1 = 0001	2 = 0010	1 = 0001	2 = 0010
result= 0101	    0111	    0110	    0100 = 4
	 */

}
