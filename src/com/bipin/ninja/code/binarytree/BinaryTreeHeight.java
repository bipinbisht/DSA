package com.bipin.ninja.code.binarytree;

public class BinaryTreeHeight {

	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null)
			return 0;
		int ht = 0;
		ht = Math.max(height(root.left), height(root.right));

		return ht + 1;
	}
}
