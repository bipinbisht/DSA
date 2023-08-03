package com.bipin.ninja.code.tree;

public class HeightOfTree {

	public static int getHeight(TreeNode<Integer> root) {
		int height = 0;
		if (root == null)
			return 0;
		else
			height++;

		int max = 0;
		for (int i = 0; i < root.children.size(); i++) {
			int temp = getHeight(root.children.get(i));

			if (temp > max)
				max = temp;
		}
		height = height + max;
		return height;

	}

}
