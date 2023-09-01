package com.bipin.ninja.code.binarytree;

public class CountNodesInBinaryTree {

	public static int countNodes(BinaryTreeNode<Integer> root) {
		if (root == null)
			return 0;
		int ans = 1;
		ans += countNodes(root.left);
		ans += countNodes(root.right);

		return ans;
	}

	public static int sumOfNodes(BinaryTreeNode<Integer> root) {
		if (root == null)
			return 0;
		int ans = root.data;
		ans += sumOfNodes(root.left);
		ans += sumOfNodes(root.right);

		return ans;
	}

	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
		if (root == null)
			return false;

		if (root.data == x)
			return true;

		return isNodePresent(root.left, x) || isNodePresent(root.right, x);

	}

}
