package com.GenericsProblems;

public class FindMaxNum {
	
	public int findMax(int a, int b, int c) {
	int result = (a>b && a>c )? a : (b>a && b>c)? b : (c>a && c>b)? c :c;
	return result;
	}

	public static void main(String args[]) {
	    
		System.out.println();
		}


}

   