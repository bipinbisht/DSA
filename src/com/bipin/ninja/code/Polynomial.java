package com.bipin.ninja.code;

public class Polynomial {
	private DynamicArray coefficient;
	
	public Polynomial()
	{
		coefficient = new DynamicArray();
	}
	public void setCoefficient(int deg,int coeff)
	{
		if(deg>coefficient.size())
		{
			for(int i = coefficient.size(); i<=deg;i++) {
				coefficient.add(0);
			}
		}
		coefficient.set(deg, coeff);
	}
	public void print() {
		System.out.println(coefficient);
	}

}
