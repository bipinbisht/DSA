package com.bipin.ninja.code.strings;

public class ReverseStringWordWise {

	public static void main(String[] args) {
		String s = "Hi my name is bipin";

		String[] split = s.split(" ");
		String str = "";

		for (int i = split.length - 1; i >= 0; i--) {
			str += split[i]+" ";
		}

		System.out.println(str);
	}
	
	

}
