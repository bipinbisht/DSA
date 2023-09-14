package com.bipin.ninja.code.queue.priority;

import java.util.LinkedList;
import java.util.Queue;

public class CheckMaxHeap {

	public static void main(String[] args) {

		int[] a = { 8, 6, 4, 7, 3, 2, 0 };
//		int[] a = { 42, 20, 18, 6, 14, 11, 9, 4 };
		System.out.println(checkMaxHeapShort(a));
	}

	public static boolean checkMaxHeap(int arr[]) {
		int size = arr.length;
		Queue<Pair> que = new LinkedList<>();
		que.add(new Pair(arr[0], 0));

		while (!que.isEmpty()) {
			Pair removedQueue = que.poll();

			int leftChildIndex = 2 * removedQueue.index + 1;
			int rightChildIndex = 2 * removedQueue.index + 2;

			if (leftChildIndex < size || rightChildIndex < size) {
				if (removedQueue.value < arr[leftChildIndex]
						|| (rightChildIndex < size && removedQueue.value < arr[rightChildIndex])) {
					return false;
				} else {
					Pair leftChild = new Pair(arr[leftChildIndex], leftChildIndex);
					que.add(leftChild);
					if (rightChildIndex < size) {
						Pair rightChild = new Pair(arr[rightChildIndex], rightChildIndex);
						que.add(rightChild);
					}
				}
			}
		}
		return true;
	}

	// TC O(N) Sp O(1)
	public static boolean checkMaxHeapShort(int[] a) {
		int n = a.length;
		for (int i = 0; 2 * i + 1 < n; i++) {
			int leftChildIndex = 2 * i + 1;
			int rightChildIndex = leftChildIndex;
//if left child greater than parent then return false
			if (a[i] < a[leftChildIndex])
				return false;
// if right child exist and greater than parent then return false
			if (rightChildIndex < n && a[i] < a[rightChildIndex])
				return false;
		}
		return true;
	}

}

class Pair {
	int value;
	int index;

	public Pair(int value, int index) {
		this.value = value;
		this.index = index;
	}
}
