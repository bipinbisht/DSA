package com.bipin.ninja.code.hashmap;

import java.util.HashMap;

public class PairSumTo0 {

	public static void main(String[] args) {
//		int[] a = { 2, 1, -2, 2, 3 };
//		int[] a = { -2, 2, 6, -2, 2, -6, 3 };
		int[] a = {0,0,0,0,0};
//		-2 -12 2 11 12 -2 1 -2 2 -11 12 2 6
//		int[] a = { -2, -12, 11, 12, -2, 1, -2, 2, -11, 12, 2, 6 };
		int pairSum = PairSum(a, a.length);
		System.out.println(pairSum);
		System.out.println(PairSumShort(a, a.length));
//		HashMap<Integer, Integer> map = new HashMap<>();
//		System.out.println(map.getOrDefault(2, 0));
	}

	public static int PairSum(int[] input, int size) {

		if (size == 0)
			return 0;

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < input.length; i++) {
			if (map.containsKey(input[i])) {
				map.put(input[i], map.get(input[i]) + 1);
			} else
				map.put(input[i], 1);
		}

		int count = 0;
		for (int i = 0; i < input.length; i++) {
			int value = input[i];
			if (value > 0) {
				if (map.containsKey(-value) && map.get(-value) > 0) {
					int posFreq = map.get(value);
					int negFreq = map.get(-value);
					int n = 0;
					if (posFreq == 1 && negFreq == 1)
						n = 1;
					else
						n = posFreq * negFreq;
					count = count + n;

//					for (int j = 0; j < n; j++)
//						System.out.print(-value + " " + value + " ");
					map.put(value, 0);
					map.put(-value, 0);
					System.out.println();
				}

			} else {
				if (map.containsKey(-value) && map.get(-value) > 0) {
					int posFreq = map.get(-value);
					int negFreq = map.get(value);
					int n = 0;
					if (posFreq == 1 && negFreq == 1)
						n = 1;
					else
						n = posFreq * negFreq;
					count = count + n;

//					for (int j = 0; j < n; j++)
//						System.out.print(value + " " + -value + " ");
					map.put(value, 0);
					map.put(-value, 0);
					System.out.println();
				}
			}

		}
		return count;
	}

	public static int PairSumShort(int[] input, int size) {
		int count = 0;
		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < size; i++) {
			int complement = -input[i];
			count += hm.getOrDefault(complement, 0);
			hm.put(input[i], hm.getOrDefault(input[i], 0) + 1);
		}
		return count;
	}
}
