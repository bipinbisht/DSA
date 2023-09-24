package com.bipin.ninja.code.queue.priority;

import java.util.Collections;
import java.util.PriorityQueue;

public class GetKthLargestElementAndSmallestElement {

	public static void main(String[] args) {
		int[] a = { 20, 10, 60, 30, 50, 40 };
		System.out.println(kthSmallest(a.length, a, 4));
	}

	public static int kthLargest(int n, int[] input, int k) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < k; i++) {
			pq.add(input[i]);
		}

		for (int i = k; i < n; i++) {
			if (pq.peek() < input[i]) {
				pq.poll();
				pq.add(input[i]);
			}
		}
		return pq.peek();
	}

	public static int kthSmallest(int n, int[] input, int k) {

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < k; i++) {
			pq.add(input[i]);
		}

		for (int i = k; i < n; i++) {
			if (pq.peek() > input[i]) {
				pq.poll();
				pq.add(input[i]);
			}
		}
		return pq.peek();
	}

}
