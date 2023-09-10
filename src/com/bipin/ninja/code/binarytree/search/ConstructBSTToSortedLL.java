package com.bipin.ninja.code.binarytree.search;

import java.util.ArrayList;

import com.bipin.ninja.code.binarytree.BinaryTreeNode;
import com.bipin.ninja.code.linkedlist.Node;

public class ConstructBSTToSortedLL {

	public static Node<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
		return LLHelper(root);

	}

	public static Node<Integer> constructLinkedListNew(BinaryTreeNode<Integer> root) {
		if (root == null)
			return null;
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> makeArrayList = makeArrayList(root, arr);
		Integer integer = makeArrayList.get(0);
		Node<Integer> head = new Node<Integer>(integer);
		Node<Integer> temp = head;
		int index = 1;
		while (index < makeArrayList.size()) {

			Integer val = makeArrayList.get(index);

			Node<Integer> newNode = new Node<Integer>(val);

			temp.next = newNode;
			temp = temp.next;
			index++;

		}
		temp.next = null;
		return head;

	}

	public static Node<Integer> LLHelper(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return null;
		}
		Node<Integer> node = new Node<Integer>(root.data);

		Node<Integer> leftHead = LLHelper(root.left);
		if (leftHead != null)
			leftHead.next = node;
		Node<Integer> rightHead = LLHelper(root.right);
		node.next = rightHead;

		return node;

	}

	public static ArrayList<Integer> makeArrayList(BinaryTreeNode<Integer> root, ArrayList<Integer> arr) {
		if (root == null)
			return arr;

		makeArrayList(root.left, arr);
		arr.add(root.data);
		makeArrayList(root.right, arr);

		return arr;
	}
}
