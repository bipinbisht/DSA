package com.bipin.ninja.code.tree;

import java.util.ArrayList;

public class TreeNode<T> {

	public T data;
	public ArrayList<TreeNode<T>> children;

	public TreeNode(T data) {
		this.data = data;
		children = new ArrayList<>();
	}

	public String toString() {

		return children.toString();
	}
}
