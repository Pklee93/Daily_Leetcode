/*
 * Symmetric Tree
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 */

package symmetricTree;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
	int val;
	TreeNode left, right;
	
	TreeNode () {}
	TreeNode (int val) { this.val = val; }
	TreeNode (int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class Solution {
	
	public boolean isSymmetric(TreeNode root) {
		return root == null || helper(root.left, root.right);
	}
	
	boolean helper(TreeNode left, TreeNode right) {
		if (left == null || right == null) {
			return left == right;
		}
		if (left.val != right.val) {
			return false;
		}
		return helper(left.left, right.right) && helper(left.right, right.left);
	}
	
}
