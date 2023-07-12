package com.bipin.ninja.code.stack;

import java.util.*;

public class StockSpan {

	public static void main(String[] args) {

		int[] a = { 100, 80, 60, 70, 60, 75, 85 };
		int[] a1 = { 60, 70, 80, 60 };
		int[] res = stockSpanEfficent(a1);
		System.out.println(Arrays.toString(res));
	}

	public static int[] stockSpan(int[] price) {
		int[] a = new int[price.length];
		int i = 0;
		int c = 1;
		int k = 0;
		while (i < price.length) {

			int temp = i;
			int max = price[i];
			while (temp > 0 && max > price[temp - 1]) {

				c++;
				temp--;
			}
			a[k] = c;
			k++;
			i++;
			c = 1;
		}
		return a;
	}

	public static int[] stockSpanEfficent(int[] price) {
		Stack<Integer> stk = new Stack<>();
		int[] output = new int[price.length];
		stk.push(0);
		output[0] = 1;
		for (int i = 1; i < price.length; ++i) {
			while (!stk.isEmpty() && price[stk.peek()] < price[i]) {
				stk.pop();
			}
			if (stk.isEmpty()) {
				output[i] = i + 1;
			} else {
				output[i] = i - stk.peek();
			}
			stk.push(i);

		}
		return output;
	}

}
