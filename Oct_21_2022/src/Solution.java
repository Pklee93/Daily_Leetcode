import java.util.ArrayList;
import java.util.List;

/*
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 */
public class Solution {
	
	public static List<Integer> spiralOrder(int[][] matrix) {
		
		boolean read[][] = new boolean[matrix.length][matrix[0].length];
		List<Integer> result = new ArrayList<>();
		int x = 0, y = 0, count = 0, total = matrix.length * matrix[0].length;
		while (count < total) {
			while (x < matrix[y].length && !read[y][x]) {
				result.add(matrix[y][x]);
				read[y][x] = true;
				x++;
				count++;
			}
			x--;
			y++;
			while (y < matrix.length && !read[y][x]) {
				result.add(matrix[y][x]);
				read[y][x] = true;
				y++;
				count++;
			}
			y--;
			x--;
			while (x >= 0 && !read[y][x]) {
				result.add(matrix[y][x]);
				read[y][x] = true;
				x--;
				count++;
			}
			x++;
			y--;
			while (y >= 0 && !read[y][x]) {
				result.add(matrix[y][x]);
				read[y][x] = true;
				y--;
				count++;
			}
			y++;
			x++;
		}
		
		return result;
	}

	public static void main(String[] args) {
		int matrix[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		List<Integer> result = spiralOrder(matrix);
		System.out.println(result.toString());
	}

}
