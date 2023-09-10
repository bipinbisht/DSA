package com.bipin.ninja.code.hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDublicates {

	public static void main(String[] args) {
//		int[] arr = { 1, 2, 2, 4, 3, 3, 5, 5, 7 };
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDublicates(arr));
	}

	public static ArrayList<Integer> removeDublicates(int[] a) {
		ArrayList<Integer> output = new ArrayList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();

		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i]))
				continue;
			output.add(a[i]);
			map.put(a[i], true);
		}

		return output;

	}

}
