package com.bipin.ninja.code.binarytree;

public class CountNodesGreaterThanX {

	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		if (root == null)
			return 0;
		int count = 0;
		if (root.data > x)
			count++;
		count = count + countNodesGreaterThanX(root.left, x);
		count = count + countNodesGreaterThanX(root.right, x);
		return count;
	}
}
