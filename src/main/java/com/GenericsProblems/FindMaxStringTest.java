package com.GenericsProblems;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxStringTest {
	@Test
	public void giventhreeStrings_WhenNull_ShouldReturnMaxAt1stPosition() {
		String a = "Banana", b = "Peach", c = "Apple";
		FindMaxString FindMax = new FindMaxString();
		Assert.assertEquals(a, FindMax.findMax(a, b, c));
	}
}
