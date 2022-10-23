/*
 * Have to form a team of 3 soldiers under the following rules
 * a) Choose 3 soldiers with index (i, j, k) with rating (rating[i], rating[j], rating[k]).
 * b) A team is valid if: (rating[i] < rating[j] < rating[k]) or (rating[i] > rating[j] > rating[k]) where (0 <= i < j < k < n).
 * 
 * return the number of teams
 */


public class Solution {
	
	public static int numTeams(int[] rating) {
		int dp_bigger[] = new int[rating.length];
		int dp_lower[] = new int[rating.length];
		int count = 0;
		for (int i = 0; i < rating.length - 2; i++) {
			for (int j = i + 1; j < rating.length - 1; j++) {
				if (rating[i] < rating[j]) {
					if (dp_bigger[j] > 0) {
						count += dp_bigger[j];
					} else {
						for (int k = j + 1; k < rating.length; k++) {
							if (rating[j] < rating[k]) {
								count++;
								dp_bigger[j] += 1;
							}
						}
					}
				}
				if (rating[i] > rating[j]) {
					if (dp_lower[j] > 0) {
						count += dp_lower[j];
					} else {
						for (int k = j + 1; k < rating.length; k++) {
							if (rating[j] > rating[k]) {
								count++;
								dp_lower[j] += 1;
							}
						}
					}
				}
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		int rating[] = {2, 5, 3, 4, 1};
		System.out.println(numTeams(rating));
	}

}
