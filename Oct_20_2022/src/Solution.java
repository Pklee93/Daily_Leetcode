/*
 * Given a string containing digits from 2-9 inclusive
 * return all possible letter combinations that the number could represent. 
 * Return the answer in any order.
 * 
 * 1 = "", 2 = "abc", 3 = "def", 4 = "ghi", 5 = "jkl"
 * 6 = "mno", 7 = "pqrs", 8 = "tuv", 9 = "wxyz"
 */

import java.util.LinkedList;
import java.util.List;

public class Solution {
	public static List<String> letterCombinations(String digits) {
		LinkedList<String> ans = new LinkedList<String>();
		if(digits.isEmpty()) return ans;
		String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		ans.add("");
		for(int i =0; i<digits.length();i++){
			int x = Character.getNumericValue(digits.charAt(i));
			while(ans.peek().length()==i){
				String t = ans.remove();
				for(char s : mapping[x].toCharArray())
					ans.add(t+s);
			}
		}
		return ans;
		
    }
	
	public static void main(String[] args) {
		String digits = "23";
		List<String> arr = letterCombinations(digits);
		System.out.println(arr.toString());
	}

}
