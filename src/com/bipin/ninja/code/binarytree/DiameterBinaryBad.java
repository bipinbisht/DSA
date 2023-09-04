package com.bipin.ninja.code.binarytree;

public class DiameterBinaryBad {

	public static int getDiameter(BinaryTreeNode<Integer> root) {
		if (root == null)
			return 0;

		int option1 = height(root.left) + height(root.right);
		int option2 = getDiameter(root.left);
		int option3 = getDiameter(root.right);

		return Math.max(option1, Math.max(option2, option3));
	}

	private static int height(BinaryTreeNode<Integer> root) {
		if (root == null)
			return 0;
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return Math.max(leftHeight, rightHeight) + 1;
	}

}
