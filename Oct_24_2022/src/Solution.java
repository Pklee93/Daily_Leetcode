/*
 * Climbing Stairs
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * 
 * Brute Force
 * Fibonacci sequence
 * BFS - Bottom Up
 */


public class Solution {
	public static int climbStairs(int n) {
        int dp[] = new int[n + 1];
        dp[n] = 1;
        dp[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
        	dp[i] = dp[i + 1] + dp[i + 2];
        }
        
        return dp[0];
    }
	
	public static void main(String[] args) {
		System.out.println(climbStairs(5));
	}
}

/*
 * n = 1 -> 1
 * n = 2 -> 11 2
 * n = 3 -> 111 21 12
 * n = 4 -> 1111 211 121 112 22
 * n = 5 -> 11111 2111 1211 1121 1112 221 212 122 
 * n = 6 -> 111111 21111 12111 11211 11121 11112 2211 2121 2112 1221 1212 1122 222
 */
