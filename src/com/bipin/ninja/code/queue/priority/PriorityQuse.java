package com.bipin.ninja.code.queue.priority;

public class PriorityQuse {

	public static void main(String[] args) throws PriorityQException {
		Priority_Queue p = new Priority_Queue();
		Min_Heap_Sort mhs = new Min_Heap_Sort();
		int arr[] = { 5, 1, 9, 2, 0, 6 };
		for (int i = 0; i < arr.length; i++) {
			mhs.InsertIntoVirtualHeap(arr, i);
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			arr[arr.length - 1-i] = mhs.removeFromVirtualHeapNew(arr, arr.length - i);
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		int start =0;
		int end = arr.length-1;
		
		while(start < end)
		{
			int t = arr[start];
			arr[start] = arr[end];
			arr[end] = t;
			start ++;
			end --;
		}
		System.out.println();
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		
//		System.out.println(p.heap);
//		System.out.println(p.removeMin());
//		System.out.println(p.heap);
//		while (!p.isEmpty()) {
//			System.out.println(p.removeMin() + " ");
//		}
//		System.out.println();
	}

}
