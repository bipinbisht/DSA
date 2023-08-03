package com.bipin.ninja.code.tree;

public class CountLeafNodes {

	public static int countLeafNode(TreeNode<Integer> root) {
		if (root == null)
			return 0;
		int sum = 0;
		if (root.children.size() == 0)
			sum = sum + 1;

		for (int i = 0; i < root.children.size(); i++) {
			sum = sum + countLeafNode(root.children.get(i));
		}
		return sum;
	}

}
