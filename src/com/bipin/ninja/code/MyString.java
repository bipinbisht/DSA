package com.bipin.ninja.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyString {

	public static void main(String[] args) {
		String s1 = "L55--REWORK-2";
		String s2 = "L55-BATCH-1";
		String s3 = "L55-REWORK-2";
		String s4 = "L55-";

		List<String> l = new ArrayList<>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		// l.forEach(MyString::myRun);
		String n = "okk";
		// System.out.println(n.matches("okk"));
		myRun(s1);
	}

	public static void myRun(String name) {
		name = name.toLowerCase();
		System.out.println(name);
		if (name.contains("-rework")) {
			String camp = name.split("rework")[0];
//			System.out.println(Arrays.toString(split));
			return;
		}
		if (name.contains("-batch")) {
			String camp = name.split("rework")[0];
			System.out.println("Second If");
			return;
		}
		String camp = name;

	}

}
