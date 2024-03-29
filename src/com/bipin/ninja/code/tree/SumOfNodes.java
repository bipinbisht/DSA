package com.bipin.ninja.code.tree;

public class SumOfNodes {

	public static int sumOfAllNode(TreeNode<Integer> root) {
		if (root.data == null) {
			return -1;
		}
		int sum = root.data;

		for (int i = 0; i < root.children.size(); i++) {
			int data = sumOfAllNode(root.children.get(i));
			sum = sum + data;
		}
		return sum;
	}

}
