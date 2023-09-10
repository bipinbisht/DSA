package com.bipin.ninja.code.hashmap;

import java.util.HashMap;
import java.util.Set;

public class MaximumFrequencyOfANumber {

	public static void main(String[] args) {

//		int[] a = { 2, 2, 3, 2, 4, 5, 5, 5 };
		int[] a = {};
		System.out.println(maxFrequencyNumber(a));
	}

	public static int maxFrequencyNumber(int[] a) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				int value = map.get(a[i]);
				map.put(a[i], value + 1);
			} else {
				map.put(a[i], 1);
			}
		}
		System.out.println(map);
		int max = 0;
		int maxKey = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (map.get(a[i]) > max) {
				max = map.get(a[i]);
				maxKey = a[i];
			}

		}
		return maxKey;

	}

	public static int getMaxKey(Set<Integer> keys, HashMap<Integer, Integer> map) {
		int max = Integer.MIN_VALUE;
		int key = 0;
		for (Integer i : keys) {
			int val = map.get(i);
			if (val > max) {
				max = val;
				key = i;
			}
		}
		return key;
	}

}
