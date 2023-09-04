package com.bipin.ninja.code.binarytree;

public class ConstructBinaryTreeFromInorderAndPreOrder {
	
	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		
		return buildTreeHelper(preOrder, inOrder, 0, inOrder.length-1, 0, preOrder.length-1);
	}
	
	public static BinaryTreeNode<Integer> buildTreeHelper(int[] pre,int[] in, int inStart,int inEnd,int preStart,int preEnd)
	{
		if(inStart > inEnd)
			return null;
		int rootIndex =-1;
		int data = pre[preStart];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
		for(int i=inStart; i<=inEnd; i++)
		{
			if(in[i] == data)
			{
				rootIndex = i;
				break;
			}
		}
		if(rootIndex == -1)
			return null;
		
		int leftInOrderStart = inStart;
		int leftInOrderEnd = rootIndex-1;
		int leftPreOrderStart = preStart+1;
		int leftPreOrderEnd = leftInOrderEnd-leftInOrderStart+leftPreOrderStart ;
		int rightInOrderStart = rootIndex+1;
		int rightInorderEnd = inEnd;
		int rightPreOrderStart =  leftPreOrderEnd+1 ;
		int rightPreOrderEnd = preEnd;
		
		root.left = buildTreeHelper(pre, in, leftInOrderStart, leftInOrderEnd, leftPreOrderStart, leftPreOrderEnd);
		root.right = buildTreeHelper(pre, in, rightInOrderStart, rightInorderEnd, rightPreOrderStart, rightPreOrderEnd);
		
		return root;
	}

}
