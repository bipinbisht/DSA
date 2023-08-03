package com.bipin.ninja.code.tree;

public class CountNoOfNodesInTree {

	public static int countNodes(TreeNode<Integer> root) {
		if (root.data == null) {
			return -1;
		}
		int count = 1;

		for (int i = 0; i < root.children.size(); i++) {
			count += countNodes(root.children.get(i));
		}
		return count;
	}

}
