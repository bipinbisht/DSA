package com.bipin.ninja.code.tree;

import java.util.Scanner;

import com.bipin.ninja.code.queue.QueueImplByLL;

public class TreeUse {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		TreeNode<Integer> root = takeInput(s);
		TreeNode<Integer> root = takeInputLevelWise();
		printLevelWise(root);

//		int countNodes = CountNoOfNodesInTree.countNodes(root);
		System.out.println(SumOfNodes.sumOfAllNode(root));

	}

	public static TreeNode<Integer> takeInput(Scanner s) {
		int n;
		System.out.println("Enter next node data");
		n = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("Enter no of children for " + n);
		int childCount = s.nextInt();
		for (int i = 0; i < childCount; i++) {
			TreeNode<Integer> child = takeInput(s);
			root.children.add(child);
		}
		return root;
	}

	public static void print(TreeNode<Integer> root) {
		String s = root.data + ":";
		for (int i = 0; i < root.children.size(); i++) {
			s = s + root.children.get(i).data + ",";
		}
		System.out.println(s);
		for (int i = 0; i < root.children.size(); i++) {
			print(root.children.get(i));
		}

	}

	public static TreeNode<Integer> takeInputLevelWise() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the root data");
		int data = s.nextInt();
		TreeNode<Integer> root = new TreeNode<>(data);
		QueueImplByLL<TreeNode<Integer>> pendingNodes = new QueueImplByLL<TreeNode<Integer>>();
		pendingNodes.enqueue(root);

		while (!pendingNodes.isEmpty()) {
			TreeNode<Integer> frontNode = pendingNodes.dequeue();
			System.out.println("Enter the no of child for " + frontNode.data);
			int children = s.nextInt();
			for (int i = 0; i < children; i++) {
				System.out.println("Enter the " + (i + 1) + "th child for " + frontNode.data);
				int child = s.nextInt();
				TreeNode<Integer> childNode = new TreeNode<Integer>(child);
				frontNode.children.add(childNode);
				pendingNodes.enqueue(childNode);
			}
		}
		return root;

	}

	public static void printLevelWise(TreeNode<Integer> root) {
		QueueImplByLL<TreeNode<Integer>> pendingQueue = new QueueImplByLL<>();
		pendingQueue.enqueue(root);
		TreeNode<Integer> minus = new TreeNode<Integer>(-1);
		pendingQueue.enqueue(minus);
		while (!pendingQueue.isEmpty()) {
			TreeNode<Integer> frontNode = pendingQueue.dequeue();
			if (frontNode.data != -1) {
				System.out.print(frontNode.data + " ");

				for (int i = 0; i < frontNode.children.size(); i++) {
					pendingQueue.enqueue(frontNode.children.get(i));
				}
			} else {
				System.out.println();
				if (pendingQueue.getSize() > 0)
					pendingQueue.enqueue(minus);
			}
		}
	}
}
