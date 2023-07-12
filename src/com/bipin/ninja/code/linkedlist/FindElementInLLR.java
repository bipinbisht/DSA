package com.bipin.ninja.code.linkedlist;

public class FindElementInLLR {

	public static int findNodeRec(Node<Integer> head, int n) {
    	return find(head, n, 0);
	}

    public static int find(Node<Integer> head, int n,int c)
    {
        if(head == null)
        return -1;
        if(head.data == n)
        return c;
       int smallAns =  find(head.next, n, c+1);
       return smallAns;
    }
    
    public static int find1(Node<Integer> head, int n)
    {
        if(head == null)
        return -1;
        if(head.data == n)
        return 0;
       int smallAns =  find1(head.next, n);
       if(smallAns == -1)
    	   return -1;
       return smallAns+1;
    }
    
    

}
