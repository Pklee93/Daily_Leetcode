import java.util.ArrayList;
import java.util.List;

/*
 * Binary Tree Inorder Traversal
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
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
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		return helper(list, root);
	}
	
	List<Integer> helper(List<Integer> list, TreeNode root) {
		if (root == null) {
			return list;
		}
		helper(list, root.left);
		list.add(root.val);
		helper(list, root.right);
		
		return list;
	}
}
