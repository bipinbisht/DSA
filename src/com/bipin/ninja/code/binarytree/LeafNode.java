package com.bipin.ninja.code.binarytree;

public class LeafNode {

	public static int countLeafNode(BinaryTreeNode<Integer> root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;
		int count = 0;

		count = count + countLeafNode(root.left);
		count = count + countLeafNode(root.right);

		return count;
	}
}
