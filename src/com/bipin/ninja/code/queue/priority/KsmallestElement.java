package com.bipin.ninja.code.queue.priority;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class KsmallestElement {

	public static void main(String[] args) {
//		2 12 9 16 10 5 3 20 25 11 1 8 6 
		int[] a = { 2, 12, 9, 16, 10, 5 };
//		int[] a = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 };
		System.out.println(kSmallest(a.length, a, 3));
	}

	public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < k; i++) {
			pq.add(input[i]);
		}

		for (int i = k; i < n; i++) {
			if (input[i] < pq.peek()) {
				pq.poll();
				pq.add(input[i]);
			}

		}

		ArrayList<Integer> ans = new ArrayList<>();
		while (!pq.isEmpty()) {
			ans.add(pq.poll());
		}
		return ans;
	}

	public static ArrayList<Integer> kSmallest1(int n, int[] input, int k) {
		ArrayList<Integer> ans = new ArrayList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < input.length; i++) {
			pq.add(input[i]);
		}

		for (int i = 0; i < k; i++) {
			ans.add(pq.remove());
		}
		return ans;
	}

}
