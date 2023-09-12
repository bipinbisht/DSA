package com.bipin.ninja.code.queue.priority;

import java.util.ArrayList;

public class Priority_Queue {
	// priority queue for min priority

	public ArrayList<Integer> heap;

	public Priority_Queue() {
		heap = new ArrayList<>();
	}

	public int size() {
		return heap.size();
	}

	public boolean isEmpty() {
		return heap.size() == 0;
	}

	public int getMin() throws PriorityQException {
		if (heap.isEmpty())
			throw new PriorityQException();
		return heap.get(0);
	}

	public void insert(int element) {
		heap.add(element);
		upwardHeapify();

	}

	private void upwardHeapify() {
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;
		while (childIndex > 0) {
			int childValue = heap.get(childIndex);
			int parentValue = heap.get(parentIndex);
			if (childValue < parentValue) {
				int temp = heap.get(parentIndex);
				heap.set(parentIndex, heap.get(childIndex));
				heap.set(childIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			} else {
				return;
			}
		}
	}

	private void downwardHeapify(int size) {
		int ParentIndex = 0;
		int leftChildIndex = 2 * ParentIndex + 1;
		int rightChildIndex = 2 * ParentIndex + 2;
		int parentValue = heap.get(ParentIndex);
		int leftChildValue = heap.get(leftChildIndex);
		int rightChildValue = heap.get(rightChildIndex);
		while (leftChildIndex < size) {
			int min = Math.min(leftChildValue, rightChildValue);
			if (min == leftChildValue) {

				if (parentValue > leftChildValue) {
					int temp = parentValue;
					heap.set(ParentIndex, leftChildValue);
					heap.set(leftChildIndex, temp);
					ParentIndex = leftChildIndex;
					parentValue = heap.get(ParentIndex);
					leftChildIndex = 2 * ParentIndex + 1;
					rightChildIndex = 2 * ParentIndex + 2;

					if (leftChildIndex < size && rightChildIndex < size) {
						System.out.println(rightChildIndex);
						leftChildValue = heap.get(leftChildIndex);
						rightChildValue = heap.get(rightChildIndex);
					}

				} else
					return;
			} else {
				if (parentValue > rightChildValue) {
					int temp = parentValue;
					heap.set(ParentIndex, min);
					heap.set(rightChildIndex, temp);
					ParentIndex = rightChildIndex;
					parentValue = heap.get(ParentIndex);
					leftChildIndex = 2 * ParentIndex + 1;
					rightChildIndex = 2 * ParentIndex + 2;
					if (leftChildIndex < size && rightChildIndex < size) {
						leftChildValue = heap.get(leftChildIndex);
						rightChildValue = heap.get(rightChildIndex);
					}
				} else
					return;
			}
		}
	}

	private void dHeapify() {
		int parentIndex = 0;
		int leftChildIndex = 1;
		int rightChildIndex = 2;

		while (leftChildIndex < heap.size() && rightChildIndex < heap.size()) {
			int minValue = Math.min(heap.get(leftChildIndex), heap.get(rightChildIndex));
			if (minValue == heap.get(leftChildIndex)) {
				if (heap.get(leftChildIndex) < heap.get(parentIndex)) {
					int temp = heap.get(parentIndex);
					heap.set(parentIndex, heap.get(leftChildIndex));
					heap.set(leftChildIndex, temp);
					parentIndex = leftChildIndex;
					if (leftChildIndex < heap.size() && rightChildIndex < heap.size()) {
						leftChildIndex = 2 * parentIndex + 1;
						rightChildIndex = 2 * parentIndex + 2;
					}
				}
			} else if (minValue == heap.get(rightChildIndex)) {
				if (heap.get(rightChildIndex) < heap.get(parentIndex)) {
					int temp = heap.get(parentIndex);
					heap.set(parentIndex, heap.get(rightChildIndex));
					heap.set(rightChildIndex, temp);
					parentIndex = rightChildIndex;
					if (leftChildIndex < heap.size() && rightChildIndex < heap.size()) {
						leftChildIndex = 2 * parentIndex + 1;
						rightChildIndex = 2 * parentIndex + 2;
					}
				}
			} else
				break;
		}

	}

	public int removeMin() {
		if (heap.isEmpty())
			return 0;
		int size = heap.size();
		int ans = heap.get(0);
		int lastNodeValue = heap.get(size - 1);
		heap.set(0, lastNodeValue);
		heap.remove(size - 1);
		dHeapify();
		return ans;

	}

}
