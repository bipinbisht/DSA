package com.bipin.ninja.code.tree;

public class DepthOfNode {

	public static void getDepthOfTree(TreeNode<Integer> root, int k) {
		if (k < 0)
			return;
		if (k == 0)
			System.out.println(root.data);

		for (int i = 0; i < root.children.size(); i++) {
			getDepthOfTree(root.children.get(i), k - 1);
		}
	}

}
