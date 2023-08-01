package com.bipin.ninja.code.tree;

public class CountNoOfNodesInTree {

	public static int countNodes(TreeNode<Integer> root) {
		int count = 1;

		for (int i = 0; i < root.children.size(); i++) {
			count += countNodes(root.children.get(i));
		}
		return count;
	}

}
