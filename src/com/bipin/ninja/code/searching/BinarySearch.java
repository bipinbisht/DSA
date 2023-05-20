package com.bipin.ninja.code.searching;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 2, 3, 4, 5, 6, 8 };
		int[] a1 = {1 ,2,3,4,5};
		int target = 1;
		System.out.println(search(a1, 0, a1.length - 1, target));
	

	}

	public static int search(int[] a, int start, int end, int target) {
		if (start > end)
			return -1;
		int mid = start + (end - start) / 2;
		if (target < a[mid])
			return search(a, start, mid - 1, target);
		else if (target > a[mid])
			return search(a, mid + 1, end, target);
		else
			return mid;
	}

}
