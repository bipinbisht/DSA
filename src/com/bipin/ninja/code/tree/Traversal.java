package com.bipin.ninja.code.tree;

public class Traversal {

	public static void printPostOrder(TreeNode<Integer> root) {
		if (root == null)
			return;
		if (root.children.size() == 0) {
			System.out.print(root.data + " ");
			return;
		}
		for (int i = 0; i < root.children.size(); i++) {
			printPostOrder(root.children.get(i));
		}
		System.out.print(root.data + " ");
	}

	//
	public static void printPreOrder(TreeNode<Integer> root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		for (int i = 0; i < root.children.size(); i++) {
			printPreOrder(root.children.get(i));
		}
	}

}
