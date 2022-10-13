/*
 * Title: KnightProbability
 *
 * n x n chess board
 * A knight starts at cell (row, column)
 * Attempt to make exactly k moves.
 * Rows and columns are 0-indexed.
 * Top-left cell is (0, 0), bottom-right cell is (n - 1, n - 1)
 * 
 * Return the probability that the knight remains on the board after it has stopped moving.
 */

public class Solution {
	private int[][] directions = new int[][] {{-2, -1}, {-2, 1}, {-1, -2}, {-1, 2}, 
											  {2, -1}, {2, 1}, {1, -2}, {1, 2}};
	private double[][][] dp;
	
	private double find(int n, int k, int row, int column) {
		if (row < 0 || row > n - 1 || column < 0 || column > n - 1) {
			return 0;
		}
		if (k == 0) {
			return 1;
		}
		if (dp[row][column][k] != 0) {
			return dp[row][column][k];
		}
		
		double rate = 0;
		for (int i = 0; i < directions.length; i++) {
			rate += 0.125 * find(n, k - 1, row + directions[i][0], column + directions[i][1]);
			dp[row][column][k] = rate;
		}
		
		return rate;
	}
	
	public double knightProbability(int n, int k, int row, int column) {
		dp = new double[n][n][k + 1];
		return find(n, k, row, column);
	}

}
