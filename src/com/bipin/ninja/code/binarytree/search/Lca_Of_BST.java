package com.bipin.ninja.code.binarytree.search;

import com.bipin.ninja.code.binarytree.BinaryTreeNode;
import com.bipin.ninja.code.binarytree.BinaryTreeUse;

public class Lca_Of_BST {

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputLevelWise();
		BinaryTreeUse.printLevelWise(root);
		System.out.println(getLCA(root, 2, 6));
	}

	public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		if (root == null)
			return -1;
		if (root.data == a || root.data == b)
			return root.data;
		if (a < root.data && b < root.data)
			return getLCA(root.left, a, b);

		else if (a > root.data && b > root.data)
			return getLCA(root.right, a, b);

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
