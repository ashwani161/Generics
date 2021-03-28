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

	
}
