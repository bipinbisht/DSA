package com.bipin.ninja.code.binarytree.search;

import com.bipin.ninja.code.binarytree.BinaryTreeNode;

public class ConstructBstFromSortedArray {
	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n) {

		return binaryTreeHelper(arr, 0, n - 1);
	}

	public static BinaryTreeNode<Integer> binaryTreeHelper(int[] arr, int s, int e) {
		if (s > e)
			return null;
		int mid = (s + e) / 2;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
		root.left = binaryTreeHelper(arr, s, mid - 1);
		root.right = binaryTreeHelper(arr, mid + 1, e);
		return root;
	}
}
