package com.bipin.ninja.code.queue.priority;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedArrays {

	public static void main(String[] args) {

		ArrayList<ArrayList<Integer>> a = new ArrayList<>();
		ArrayList<Integer> a0 = new ArrayList<>();
		a0.add(1);
		a0.add(2);
		a0.add(5);
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(0);
		a1.add(4);
		a1.add(7);
		a.add(a0);
		a.add(a1);
		System.out.println(mergeKSortedArrays(a));
	}

	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> arr) {
		Comparator<Triplet> comp = new Comparator<Triplet>() {

			@Override
			public int compare(Triplet o1, Triplet o2) {
				if (o1.element < o2.element)
					return -1;
				if (o1.element > o2.element)
					return 1;
				else
					return 0;
			}

		};
		int size = arr.size();
		PriorityQueue<Triplet> pq = new PriorityQueue<>(comp);
		int elementIndex = 0;
		int arrayIndex = 0;
		for (int i = 0; i < size; i++) {
			Triplet t = new Triplet(arr.get(i).get(elementIndex), i, elementIndex);
			pq.add(t);
		}

		ArrayList<Integer> output = new ArrayList<>();

		while (!pq.isEmpty()) {
			elementIndex = pq.peek().elementIndex + 1;
			arrayIndex = pq.peek().arrayIndex;
			output.add(pq.poll().element);
			if (elementIndex < arr.get(arrayIndex).size()) {
				Triplet t = new Triplet(arr.get(arrayIndex).get(elementIndex), arrayIndex, elementIndex);
				pq.add(t);
			}
		}

//		while (!pq.isEmpty()) {
//			System.out.print("element " + pq.peek().element + " ");
//			System.out.print(" arrayIndex " + pq.peek().arrayIndex + " ");
//			System.out.print(" elementIndex " + pq.peek().elementIndex + " ");
//			pq.poll();
//			System.out.println();
//		}
		return output;
	}

}

class Triplet {
	int element;
	int arrayIndex;
	int elementIndex;

	public Triplet(int element, int arrayIndex, int elementIndex) {
		this.element = element;
		this.arrayIndex = arrayIndex;
		this.elementIndex = elementIndex;
	}

}
