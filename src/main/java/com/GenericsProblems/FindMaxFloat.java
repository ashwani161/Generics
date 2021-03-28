package com.GenericsProblems;

public class FindMaxFloat {
	public float findMax(float i, float j, float k)  {
		float result = (i>j && i>k )? i : (j>i && j>k)? j: k;
		System.out.println(result+"");
		return result;
		}
}
