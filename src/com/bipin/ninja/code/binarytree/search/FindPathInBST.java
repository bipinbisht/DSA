package com.bipin.ninja.code.binarytree.search;

import java.util.ArrayList;

import com.bipin.ninja.code.binarytree.BinaryTreeNode;
import com.bipin.ninja.code.binarytree.BinaryTreeUse;

public class FindPathInBST {

	public static void main(String[] args) {
		
		
		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInputLevelWise();
		BinaryTreeUse.print(root);
		
		System.out.println(getPath(root, 9));

	}

	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data) {
		if (root == null)
			return new ArrayList<>();
		if (root.data == data) {
			ArrayList<Integer> a = new ArrayList<>();
			a.add(root.data);
			return a;
		}

		if (data > root.data) {
			ArrayList<Integer> rightArr = getPath(root.right, data);
			if (!rightArr.isEmpty())
				rightArr.add(root.data);
			return rightArr;
		} else {
			ArrayList<Integer> leftArr = getPath(root.left, data);
			if (!leftArr.isEmpty())
				leftArr.add(root.data);
			return leftArr;
		}

	}

}
