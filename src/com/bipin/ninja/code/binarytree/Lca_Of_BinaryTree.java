package com.bipin.ninja.code.binarytree;

public class Lca_Of_BinaryTree {

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputLevelWise();
		BinaryTreeUse.printLevelWise(root);
		System.out.println(getLCA(root, 2, 6));
	}

	static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		if (root == null)
			return -1;
		if (root.data == a || root.data == b)
			return root.data;

		int left = getLCA(root.left, a, b);
		int right = getLCA(root.right, a, b);

		if (left != -1 && right != -1)
			return root.data;

		else if (left != -1)
			return left;
		else
			return right;
	}

}
