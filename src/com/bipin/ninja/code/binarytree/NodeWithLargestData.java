package com.bipin.ninja.code.binarytree;

public class NodeWithLargestData {

	public static int largest(BinaryTreeNode<Integer> root) {
		if (root == null)
			return -1;

		int leftLargest = largest(root.left);
		int rightLargest = largest(root.right);

		return Math.max(root.data, Math.max(leftLargest, rightLargest));

	}

}
