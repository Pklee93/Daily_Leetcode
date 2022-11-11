/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.
 */

package plusOne;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static int[] plusOne(int[] digits) {
		List<Integer> list = new ArrayList<>();
		digits[digits.length - 1]++;
		list = helper(list, digits.length - 1, digits);
		
		int result[] = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		
		return result;
    }
	
	static List<Integer> helper(List<Integer> list, int i, int[] digits) {
		if (i == 0) {
			if (digits[i] > 9) {
				list.add(0, digits[i] % 10);
				digits[i] /= 10;
				list.add(0, digits[i] % 10);
			} else {
				list.add(0, digits[i]);
			}
			return list;
		}
		
		if (digits[i] > 9) {
			digits[i - 1]++;
			digits[i] = digits[i] % 10;
		}
		list.add(0, digits[i]);
		
		return helper(list, i - 1, digits);
	}
	
	public static void main(String[] args) {
		int test[] = {9,9};
		int result[] = plusOne(test);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ", ");
		}
		System.out.println(" ");
		
	}

}
