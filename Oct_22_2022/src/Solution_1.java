/*
 * Divide String s to 3 Strings a, b, c
 * Count if a + b, b + c, and c + a are all different String.
 * return the count
 */

public class Solution_1 {
	static int solution(String s) {
	    int count = 0;
	    for (int i = 1; i <= s.length() - 2; i++) {
	        String a = s.substring(0, i);
	        for (int j = 1; j <= s.length() - i - 1; j++) {
	            String b = s.substring(i, i + j);
	            String c = s.substring(i + j, s.length());
	            
	            String temp1 = a + b;
	            String temp2 = b + c;
	            String temp3 = c + a;
	            if (!temp1.equals(temp2) && !temp2.equals(temp3) && !temp3.equals(temp1)) {
	                count++;
	            }
	        }
	    }
	    
	    return count;

	}
	
	public static void main(String[] args) {
		String s = "xzxzxzxzxz";
		System.out.println(solution(s));
	}
}
