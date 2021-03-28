package com.GenericsProblems;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxNumTest {
	@Test
	public void giventhreeIntegers_WhenNull_ShouldReturnMaxAt1stPosition() {
		int a = 40, b = 20, c = 10;
		FindMaxNum FindMax = new FindMaxNum();
		Assert.assertEquals(a, FindMax.findMax(a, b, c));

	}
	
	@Test
	public void giventhreeIntegers_WhenNull_ShouldReturnMaxAt2ndPosition() {
		int a = 40, b = 80, c = 10;
		FindMaxNum FindMax = new FindMaxNum();
		Assert.assertEquals(b, FindMax.findMax(a, b, c));

	}
		
}
