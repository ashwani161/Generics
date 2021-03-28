package com.GenericsProblems;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FindMaxGenericTest {
	 
		public FindMaxGeneric findMax;

			@Test
		    public void whenGivenThreeNumbers_ShouldReturnMaximumInteger() {
		        Integer i1 = 10, i2 = 25, i3 = 20;
		        findMax = new FindMaxGeneric(i1, i2, i3);
		        Object result = findMax.findMaximum();               
		        Assert.assertEquals(i2, result);
		    }
		
			@Test
		    public void whenGivenThreeFloatValues_ShouldReturnMaximumFloat() {	
		    	Float f1=2.5f, f2=5.5f, f3=10.25f;
		    	findMax = new FindMaxGeneric(f1,f2,f3);
		    	Comparable result=findMax.findMaximum();            
		    	Assertions.assertEquals(f3, result);
		    }
			@Test
		    public void whenGivenThreeStrings_ShouldReturnMaximumString() {
		        String s1="Promogranate",s2="Orange",s3="Gua";
		        findMax=new FindMaxGeneric(s1,s2,s3);
		        String result=(String) findMax.findMaximum();         
		        Assertions.assertEquals(s1,result);
		    }
		   
		}