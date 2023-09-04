package com.bipin.ninja.code.binarytree;

public class ConstructBinaryTreeFromInorderAndPostOrder {
	
	
//	postorder left - right - root
//	int in[] = {4,2,5,7,3,1};
//	int post[] = {1,2,4,5,3,7};
	
public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		
		return buildTreeHelper(postOrder, inOrder, 0, inOrder.length-1, 0, postOrder.length-1);
	}
	
	public static BinaryTreeNode<Integer> buildTreeHelper(int[] pre,int[] in, int inStart,int inEnd,int postStart,int postEnd)
	{
		if(inStart > inEnd)
			return null;
		int rootIndex =-1;
		int data = pre[postEnd];
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
		
		int leftPostOrderStart = postStart;
		int leftPostOrderEnd = leftInOrderEnd-leftInOrderStart+leftPostOrderStart ;
		
		int rightInOrderStart = rootIndex+1;
		int rightInorderEnd = inEnd;
		
		int rightPostOrderStart =  leftPostOrderEnd+1 ;
		int rightPostOrderEnd = postEnd-1;
		
		root.left = buildTreeHelper(pre, in, leftInOrderStart, leftInOrderEnd, leftPostOrderStart, leftPostOrderEnd);
		root.right = buildTreeHelper(pre, in, rightInOrderStart, rightInorderEnd, rightPostOrderStart, rightPostOrderEnd);
		
		return root;
	}

}
