package com.bipin.ninja.code.queue.priority;

public class PriorityQuse {

	public static void main(String[] args) throws PriorityQException {
		Priority_Queue p = new Priority_Queue();
		int arr[] = { 5, 1, 9, 2, 0 };
		for (int i = 0; i < arr.length; i++) {
			p.insert(arr[i]);
		}
//		System.out.println(p.heap);
//		System.out.println(p.removeMin());
//		System.out.println(p.heap);
		while (!p.isEmpty()) {
			System.out.println(p.removeMin() + " ");
		}
		System.out.println();
	}

}
