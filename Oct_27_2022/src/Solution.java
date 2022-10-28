/*
 * Maximum Depth of Binary Tree
 * 
 */

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
	public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
		int left = helper(1, root.left);
		int right = helper(1, root.right);
		
		if (left > right) {
			return left;
		} else {
			return right;
		}
    }
	
	public int helper(int depth, TreeNode root) {
		if (root == null) {
			return depth;
		}
		
		int left = helper(1 + depth, root.left);
		int right = helper(1 + depth, root.right);
		
		if (left > right) {
			return left;
		} else {
			return right;
		}
	}
}
