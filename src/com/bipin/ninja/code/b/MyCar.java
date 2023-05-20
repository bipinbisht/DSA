package com.bipin.ninja.code.b;

public class MyCar {
	private int seats;
	private int speed;

	public MyCar() {
		System.out.print("This Is Car ");
	}
}

class Audi extends Car {
	Audi() {
		System.out.print("This Is Audi ");
//		super();
	}
}

class Main {
	public static void main(String args[]) {
		Audi a = new Audi();
	}
}
