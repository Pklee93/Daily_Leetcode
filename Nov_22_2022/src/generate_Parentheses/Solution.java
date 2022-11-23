package generate_Parentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<>();
		generate(new char[n * 2], 0, list);
		return list;
	}
	
	public static void generate(char[] cur, int pos, List<String> list) {
		if (cur.length == pos) {
			if (isValid(cur)) {
				list.add(new String(cur));
			}
		} else {
			cur[pos] = '(';
			generate(cur, pos + 1, list);
			cur[pos] = ')';
			generate(cur, pos + 1, list);
		}
	}
	
	public static boolean isValid(char[] cur) {
		int bal = 0;
		for (char c : cur) {
			if (c == '(') {
				bal++;
			} else {
				bal--;
			}
			if (bal < 0) {
				return false;
			}
		}
		
		return (bal == 0);
	}
	
	public static void main(String[] args) {
		List<String> list = generateParenthesis(3);
		System.out.println(list.toString());
		
	}

}
