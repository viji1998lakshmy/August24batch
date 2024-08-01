package org.elements;

import org.junit.Assert;
import org.junit.Test;

public class JunitA {
	
	@Test
	public void test1() {
		System.out.println("Test1");

	}
	
	@Test
	public void test2() {
		Assert.assertTrue("check", false);
		System.out.println("Test2");

	}
	
	@Test
	public void test3() {
		System.out.println("Test3");

	}

}
