package com.bipin.ninja.code.hashmap;

import java.util.HashMap;

public class ExtractUniqueCharacter {

	public static void main(String[] args) {
		String s = "aabccde";
		System.out.println(uniqueChar(s));
	}

	public static String uniqueChar(String str) {
		HashMap<Character, Boolean> map = new HashMap<>();
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch))
				continue;

			output += ch;
			map.put(ch, true);
		}
		return output;
	}

}
