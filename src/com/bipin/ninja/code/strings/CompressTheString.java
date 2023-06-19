package com.bipin.ninja.code.strings;

public class CompressTheString {

	public static void main(String[] args) {

		String s = "aabbdccc";
		String s1 = "xxxxx";
		System.out.println(getCompressedString(s1));
	}

	public static String getCompressedString(String str) {

		int c = 1;
		int len = str.length();
		int i = 1;
		int j = 0;
		String output = "";
		while (j < len) {
			if (i < len && str.charAt(j) == str.charAt(i)) {
				c++;
			} else {
				if (c == 1)
					output = output + str.charAt(i - 1);
				else {
					output = output + str.charAt(i - 1) + "";
					if (c > 1)
						output = output + c;
					c = 1;
				}
			}
			j++;
			i++;
		}
		return output;
	}

}
