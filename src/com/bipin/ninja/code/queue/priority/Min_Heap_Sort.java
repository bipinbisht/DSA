package com.bipin.ninja.code.queue.priority;

public class Min_Heap_Sort {

	public void InsertIntoVirtualHeap(int[] arr, int index) {
		int childIndex = index;
		int parentIndex = (childIndex - 1) / 2;

		while (childIndex > 0) {
			if (arr[childIndex] < arr[parentIndex]) {
				int temp = arr[childIndex];
				arr[childIndex] = arr[parentIndex];
				arr[parentIndex] = temp;
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			} else
				return;
		}
	}

	public int removeFromVirtualHeap(int[] arr, int heapSize) {
		int ans = arr[0];
		arr[0] = arr[heapSize - 1];
		heapSize--;
		int parentIndex = 0;
		int leftChildIndex = 2 * parentIndex + 1;
		int rightChildIndex = 2 * parentIndex + 2;

		while (leftChildIndex < heapSize && rightChildIndex <= heapSize) {
			int minValue = Math.min(arr[leftChildIndex], arr[rightChildIndex]);
			if (arr[leftChildIndex] == minValue) {
				if (arr[leftChildIndex] < arr[parentIndex]) {
					int t = arr[leftChildIndex];
					arr[leftChildIndex] = arr[parentIndex];
					arr[parentIndex] = t;
					parentIndex = leftChildIndex;
					leftChildIndex = 2 * parentIndex + 1;
					rightChildIndex = 2 * parentIndex + 2;
				}
			} else if (arr[rightChildIndex] == minValue) {
				if (arr[rightChildIndex] < arr[parentIndex]) {
					int t = arr[rightChildIndex];
					arr[rightChildIndex] = arr[parentIndex];
					arr[parentIndex] = t;
					parentIndex = rightChildIndex;
					leftChildIndex = 2 * parentIndex + 1;
					rightChildIndex = 2 * parentIndex + 2;
				} else
					break;
			} else
				break;

		}
		return ans;

	}

	public int removeFromVirtualHeapNew(int[] arr, int heapSize) {
		int ans = arr[0];
		arr[0] = arr[heapSize - 1];
		heapSize--;
		int index = 0;
		int LI = 2 * index + 1;
		int RI = 2 * index + 2;

		while (LI < heapSize) {
			int minIndex = index;

			if (arr[LI] < arr[minIndex]) {
				minIndex = LI;
			}
			if (RI < heapSize && arr[RI] < arr[minIndex])
				minIndex = RI;
			if (minIndex != index) {
				int t = arr[index];
				arr[index] = arr[minIndex];
				arr[minIndex] = t;
				index = minIndex;
				LI = 2 * index + 1;
				RI = 2 * index + 2;
			} else
				break;
		}

		return ans;

	}

}
