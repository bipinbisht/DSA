package com.bipin.ninja.code.binarytree;

public class DiameterBinaryBetter {

	public static Pair<Integer, Integer> heightDiameter(BinaryTreeNode<Integer> root) {
		if (root == null) {
			Pair<Integer, Integer> p = new Pair<>(0, 0);
			return p;
		}
		Pair<Integer, Integer> lo = heightDiameter(root.left);
		Pair<Integer, Integer> ro = heightDiameter(root.right);
		int height = 1 + Math.max(lo.height, ro.height);
		int option1 = lo.height + ro.height;
		int option2 = lo.diameter;
		int option3 = ro.diameter;
		int diameter = Math.max(option1, Math.max(option2, option3));

		Pair<Integer, Integer> out = new Pair<>(height, diameter);
		return out;

	}

}

class Pair<T, V> {
	public T height;
	public V diameter;

	public Pair(T height, V diameter) {
		super();
		this.height = height;
		this.diameter = diameter;
	}
	
	public String toString()
	{
		return "height "+height +" " +"diameter "+diameter;
	}
}
