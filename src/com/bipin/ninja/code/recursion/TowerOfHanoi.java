package com.bipin.ninja.code.recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int disks = 3;
		char source = 'a';
		char auxiliary = 'b';
		char destination = 'c';
//		towerHanoi(3, 's', 'h', 'd');
		towerOfHanoi1(disks, source, auxiliary, destination);

	}

	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {

		if (disks == 0)
			return;
		if (disks == 1) {
			System.out.println(source + " " + destination);
			return;
		}
		towerOfHanoi(disks - 1, source, destination, auxiliary);
		System.out.println(source + " " + destination);
		towerOfHanoi(disks - 1, auxiliary, source, destination);

	}

	public static void towerOfHanoi(int disks, char source, char destination) {
		if (disks == 1) {
			System.out.println(source + "->" + destination);
			return;
		}
//		int r = 1 ^ 2 ^ 3 ^ destination ^ source;
		char r = (char) ('a' ^ 'b' ^ 'c' ^ destination ^ source);
		// towerOfHanoi(disks - 1, r, source);
		towerOfHanoi(disks - 1, source, destination);
		System.out.println(source + "->" + destination);
		towerOfHanoi(disks - 1, r, destination);

	}

	static void towerHanoi(int n, char s, char h, char d) {
		if (n == 0)
			return;
		if (n == 1) {
			System.out.println(s + "->" + d);
			return;
		}
		towerHanoi(n - 1, s, d, h);
		System.out.println(s + "->" + d);
		towerHanoi(n - 1, h, s, d);
	}

	public static void towerOfHanoi1(int disks, char a, char b, char c) {
		if (disks == 0)
			return;
		if (disks == 1) {
			System.out.println(a + " " + c);
			return;
		}
		towerOfHanoi1(disks - 1, a, c, b);
		System.out.println(a + " " + c);
		towerOfHanoi1(disks - 1, b, a, c);
	}

}
