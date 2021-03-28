package com.GenericsProblems;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxFloatTest {
	@Test
	public void giventhreefloats_WhenShouldReturnMaxAt1stPosition() {
		float i = 3.2f, j = 2.4f , k = 1.5f;
		FindMaxFloat FindMax = new FindMaxFloat();
	Assert.assertTrue("Verifying maximum value", i==FindMax.findMax(i, j, k));

	}
	
	@Test
	public void giventhreefloats_WhenShouldReturnMaxAt2ndPosition() {
		float i = 3.2f, j = 4.5f , k = 1.5f;
		FindMaxFloat FindMax = new FindMaxFloat();
	Assert.assertTrue("Verifying maximum value", j==FindMax.findMax(i, j, k));

	}
	
	@Test
	public void giventhreefloats_WhenShouldReturnMaxAt3rdPosition() {
		float i = 3.2f, j = 4.5f , k = 7.3f;
		FindMaxFloat FindMax = new FindMaxFloat();
	Assert.assertTrue("Verifying maximum value", k==FindMax.findMax(i, j, k));

	}
	
}
