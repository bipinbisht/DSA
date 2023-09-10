package com.bipin.ninja.code.binarytree;

import java.util.ArrayList;
import java.util.Collections;

public class PairSumBinaryTree {

	static ArrayList<Integer> arr = new ArrayList<>();

	public static void main(String[] args) {
		int sum = 11;
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputLevelWise();
		BinaryTreeUse.printLevelWise(root);

		getArrayFromTree(root, arr);

		System.out.println(arr);

		Collections.sort(arr);
		System.out.println(arr);
		int j = arr.size() - 1;
		int i = 0;
		while (i < j) {
			if (arr.get(i) + arr.get(j) > sum)
				j--;
			else if (arr.get(i) + arr.get(j) < sum)
				i++;
			else
			{
				System.out.println(arr.get(i) + " " + arr.get(j));
			i++;
			j--;
			}
		}

	}

	static void getArrayFromTree(BinaryTreeNode<Integer> root, ArrayList<Integer> arr) {
		if (root == null)
			return;

		getArrayFromTree(root.left, arr);
		getArrayFromTree(root.right, arr);

		arr.add(root.data);

	}

}
