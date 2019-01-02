package com.qa.test;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoTest {
	
	@Test
	public void sum() {
		int a = 10;
		int b = 20;
		Assert.assertEquals(30, a+b);
		System.out.println("TEST CASE 1 -------------");
	}
	
}
