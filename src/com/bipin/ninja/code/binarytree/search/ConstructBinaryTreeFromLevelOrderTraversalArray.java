package com.bipin.ninja.code.binarytree.search;

import java.util.LinkedList;
import java.util.Queue;

import com.bipin.ninja.code.binarytree.BinaryTreeNode;
import com.bipin.ninja.code.binarytree.BinaryTreeUse;

public class ConstructBinaryTreeFromLevelOrderTraversalArray {

	public static void main(String[] args) {

//		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputLevelWise();
//		BinaryTreeUse.print(root);
		int BST[] = { 7, 4, 12, 3, 6, 8, 1, 5, 10 }; // level order wise

		BinaryTreeNode<Integer> root = constructBST(BST);
		BinaryTreeUse.printLevelWise(root);
	}

	public static BinaryTreeNode<Integer> constructBST(int[] arr) {

		int n = arr.length;
		Queue<Pair> queue = new LinkedList<>();
		queue.add(new Pair());
		BinaryTreeNode<Integer> root = null;
		int index = 0;
		while (!queue.isEmpty() && index < n) {
			Pair removed = queue.poll();
			int ele = arr[index];
			if (ele < removed.lb || ele > removed.rb)
				continue;
			BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>(ele);

			index++;

			if (removed.parent == null)
				root = node;
			else {
				BinaryTreeNode<Integer> oldParent = removed.parent;
				if (ele < oldParent.data)
					oldParent.left = node;
				else
					oldParent.right = node;
			}
			queue.add(new Pair(node, removed.lb, ele));
			queue.add(new Pair(node, ele, removed.rb));

		}

		return root;
	}

}

class Pair {
	BinaryTreeNode<Integer> parent = null;
	int lb = Integer.MIN_VALUE;
	int rb = Integer.MAX_VALUE;

	public Pair(BinaryTreeNode<Integer> parent, int lb, int rb) {
		super();
		this.parent = parent;
		this.lb = lb;
		this.rb = rb;
	}

	Pair() {

	}

}
