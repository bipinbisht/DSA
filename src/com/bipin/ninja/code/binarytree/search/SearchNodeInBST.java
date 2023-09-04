package com.bipin.ninja.code.binarytree.search;

import com.bipin.ninja.code.binarytree.BinaryTreeNode;

public class SearchNodeInBST {

	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {

		if (root == null)
			return false;

		if (root.data == k)
			return true;
		else if (k > root.data) {
			return searchInBST(root.right, k);
		} else
			return searchInBST(root.left, k);

	}

}
