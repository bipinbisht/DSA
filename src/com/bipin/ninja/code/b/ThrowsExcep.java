package com.bipin.ninja.code.b;

public class ThrowsExcep {
	static void fun() throws Exception {
		throw new Exception();
	}

	public static void main(String[] args){

	    try{
	        return;
	    }
	    finally{
	        System.out.println("Hello coding ninjas");
	    }
	  }
//	public static void main(String args[]) {
//		try {
//			fun();
//		} catch (Exception e) {
//			System.out.print("caught in main.");
//		}
//		System.out.print("All is well");
//	}
}
