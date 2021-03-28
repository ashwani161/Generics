package com.GenericsProblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsMax {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(438, 211, 876, 1345, 120, 44, 11);
		Integer Max = Collections.max(list, Collections.reverseOrder());
		System.out.println("result: "+Max);
		
	}

	
}
