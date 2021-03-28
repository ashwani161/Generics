package com.GenericsProblems;


public class FindMaxString {
	public String findMax(String i, String j, String k)  {
		String result = (i.length()>j.length() && i.length()>k.length() )? i : (j.length()>i.length() && j.length()>k.length())? j: k;
		System.out.println(result+"");
		return result;
	}
}
