package com.bipin.ninja.code.tree;

public class FindElementInTree {

	public static boolean checkIfContainsX(TreeNode<Integer> root, int x) {
		boolean ans = false;
		if (root == null)
			return false;
		if (root.data == x) {
			return true;
		}
		for (int i = 0; i < root.children.size(); i++) {
			ans = checkIfContainsX(root.children.get(i), x);
			if (ans)
				return true;
		}
		return ans;
	}

}
