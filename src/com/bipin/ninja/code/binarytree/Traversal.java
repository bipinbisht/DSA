package com.bipin.ninja.code.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Traversal {

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputLevelWise();
		BinaryTreeUse.print(root);
		System.out.println( "height of tree is " +height(root));
		
	}

	public static void inOrder(BinaryTreeNode<Integer> root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public static void preOrder(BinaryTreeNode<Integer> root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void postOrder(BinaryTreeNode<Integer> root) {
		if (root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

	public static void levelOrder(BinaryTreeNode<Integer> root) {
		if (root == null)
			return;
		Queue<BinaryTreeNode<Integer>> pendingNode = new LinkedList<>();
		pendingNode.add(root);
		while (!pendingNode.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = pendingNode.poll();
			System.out.println(frontNode.data + " ");
			if (frontNode.left != null)
				pendingNode.add(frontNode.left);
			if (frontNode.right != null)
				pendingNode.add(frontNode.right);
		}
	}

	public static ArrayList<Integer> levelOrderList(BinaryTreeNode<Integer> root) {
		if (root == null)
			return null;
		ArrayList<Integer> arr = new ArrayList<>();
		Queue<BinaryTreeNode<Integer>> pendingNode = new LinkedList<>();
		pendingNode.add(root);
		while (!pendingNode.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = pendingNode.poll();
			arr.add(frontNode.data);
			if (frontNode.left != null)
				pendingNode.add(frontNode.left);
			if (frontNode.right != null)
				pendingNode.add(frontNode.right);
		}
		return arr;
	}

	public static void levelOrderPrintFullLevel(BinaryTreeNode<Integer> root) {
		if (root == null)
			return;
		Queue<BinaryTreeNode<Integer>> pendingNode = new LinkedList<>();
		pendingNode.add(root);
		while (!pendingNode.isEmpty()) {
			int n = pendingNode.size();
			for (int i = 0; i < n; i++) {
				BinaryTreeNode<Integer> frontNode = pendingNode.poll();
				System.out.print(frontNode.data + " ");
				if (frontNode.left != null)
					pendingNode.add(frontNode.left);
				if (frontNode.right != null)
					pendingNode.add(frontNode.right);
			}
			System.out.println();

		}
	}

	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null)
			return 0;
		int lh = height(root.left);
		int rh = height(root.right);
		return 1 + Math.max(lh, rh);

	}

}
