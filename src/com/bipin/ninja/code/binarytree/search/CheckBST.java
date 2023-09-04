package com.bipin.ninja.code.binarytree.search;

import com.bipin.ninja.code.binarytree.BinaryTreeNode;

public class CheckBST {

	public static boolean isBinaryTreeBSTBad(BinaryTreeNode<Integer> root) {
		if (root == null)
			return true;

		int leftMax = maximum(root.left);
		int rightMin = minimum(root.right);

		if (leftMax >= root.data)
			return false;
		if (rightMin <= root.data)
			return false;
		boolean isLeftBST = isBinaryTreeBSTBad(root.left);
		boolean isRightBST = isBinaryTreeBSTBad(root.right);

		if (isLeftBST && isRightBST)
			return true;
		else
			return false;
	}

	public static int minimum(BinaryTreeNode<Integer> root) {
		if (root == null)
			return Integer.MAX_VALUE;

		int minLeft = minimum(root.left);
		int minRight = minimum(root.right);

		return Math.min(root.data, Math.min(minLeft, minRight));
	}

	public static int maximum(BinaryTreeNode<Integer> root) {
		if (root == null)
			return Integer.MIN_VALUE;

		int maxLeft = maximum(root.left);
		int maxRight = maximum(root.right);

		return Math.max(root.data, Math.max(maxLeft, maxRight));
	}

	public static IsBst isBSTbetter(BinaryTreeNode<Integer> root) {
		if (root == null)
			return new IsBst(Integer.MAX_VALUE, Integer.MIN_VALUE, true);

		IsBst leftOutput = isBSTbetter(root.left);
		IsBst rightOutput = isBSTbetter(root.right);
		int min = Math.min(root.data, Math.min(leftOutput.min, rightOutput.min));
		int max = Math.max(root.data, Math.max(leftOutput.max, rightOutput.max));
		boolean isbst = root.data > leftOutput.max && root.data <= rightOutput.min && leftOutput.isBst
				&& rightOutput.isBst;

		IsBst ans = new IsBst(min, max, isbst);

		return ans;

	}

	public static boolean isValidBstRange(BinaryTreeNode<Integer> root, int min, int max) {
		if (root == null)
			return true;
		if (root.data <= min || root.data >= max)
			return false;
		return isValidBstRange(root.left, min, root.data) && isValidBstRange(root.right, root.data, max);
	}

}

class IsBst {
	public int min;
	public int max;
	public boolean isBst;

	public IsBst(int min, int max, boolean isBst) {
		super();
		this.min = min;
		this.max = max;
		this.isBst = isBst;
	}

	public String toString() {
		return "Is BST = " + isBst;
	}

}
