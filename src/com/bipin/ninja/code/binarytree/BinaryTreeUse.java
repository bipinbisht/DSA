package com.bipin.ninja.code.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import com.bipin.ninja.code.binarytree.search.CheckBST;
import com.bipin.ninja.code.binarytree.search.ConstructBSTToSortedLL;
import com.bipin.ninja.code.binarytree.search.ConstructBstFromSortedArray;
import com.bipin.ninja.code.binarytree.search.PrintElementsInRange;
import com.bipin.ninja.code.binarytree.search.SearchNodeInBST;
import com.bipin.ninja.code.linkedlist.LinkedListUse;
import com.bipin.ninja.code.linkedlist.Node;

public class BinaryTreeUse {

	public static void main(String[] args) {
//		int in[] = { 1, 2, 3,4,5,6,7 };
//		int pre[] = { 1, 2, 4, 5, 3, 7 };
//		Scanner s = new Scanner(System.in);
		BinaryTreeNode<Integer> root = takeInputLevelWise();
//		BinaryTreeNode<Integer> root = ConstructBinaryTreeFromInorderAndPreOrder.buildTree(pre, in);
//		BinaryTreeNode<Integer> sortedArrayToBST = ConstructBstFromSortedArray.SortedArrayToBST(in, in.length);
		printLevelWise(root);
		System.out.println("==================================================");
//		Node<Integer> constructLinkedList = ConstructBSTToSortedLL.constructLinkedList(sortedArrayToBST);
		
//		LinkedListUse.print(constructLinkedList);
//		
//		Node<Integer> constructLinkedListNew = ConstructBSTToSortedLL.constructLinkedListNew(sortedArrayToBST);
//		
//		LinkedListUse.print(constructLinkedListNew);
		
		

		System.out.println(CheckBST.isValidBstRange(root, Integer.MIN_VALUE, Integer.MAX_VALUE));

//		s.close();
	}

	public static BinaryTreeNode<Integer> takeInput(Scanner s) {
		System.out.println("Enter the root");
		int data = s.nextInt();
		if (data == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
		root.left = takeInput(s);
		root.right = takeInput(s);

		return root;
	}

	public static void print(BinaryTreeNode<Integer> root) {
		String result = "";
		if (root != null)
			result = root.data + ":" + " ";
		else
			return;

		if (root.left != null)
			result += "L" + root.left.data + "," + " ";
		if (root.right != null)
			result += "R" + root.right.data + "," + " ";
		System.out.println(result);
		print(root.left);
		print(root.right);
	}

	public static BinaryTreeNode<Integer> takeInputLevelWise() {
		System.out.println("Enter the root data");
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		if (data == -1) {
			sc.close();
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
		Queue<BinaryTreeNode<Integer>> pendingNode = new LinkedList<>();
		pendingNode.add(root);
		while (!pendingNode.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = pendingNode.poll();
			System.out.println("Enter the left child of " + frontNode.data);
			int leftChild = sc.nextInt();
			if (leftChild != -1) {
				BinaryTreeNode<Integer> leftChildNode = new BinaryTreeNode<Integer>(leftChild);
				frontNode.left = leftChildNode;
				pendingNode.add(leftChildNode);
			}
			System.out.println("Enter the right child of " + frontNode.data);
			int rightChild = sc.nextInt();
			if (rightChild != -1) {
				BinaryTreeNode<Integer> rightChildNode = new BinaryTreeNode<Integer>(rightChild);
				frontNode.right = rightChildNode;
				pendingNode.add(rightChildNode);
			}

		}
		sc.close();
		return root;

	}

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if (root == null)
			return;
		String res = "";
		Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
		pendingNodes.add(root);
		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = pendingNodes.poll();
			res = frontNode.data + "" + ":";

			if (frontNode.left != null) {
				pendingNodes.add(frontNode.left);
				res = res + "L:" + frontNode.left.data + ",";
			} else {
				res = res + "L:" + -1 + ",";
			}
			if (frontNode.right != null) {
				pendingNodes.add(frontNode.right);
				res = res + "R:" + frontNode.right.data;
			} else {
				res = res + "R:" + -1;
			}
			System.out.println(res);
		}
	}
}
