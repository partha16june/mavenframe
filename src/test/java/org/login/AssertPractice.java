package org.login;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertPractice {

	@Test
	private void tco1() {
		String s = "java";
		System.out.println(s);
		SoftAssert ss = new SoftAssert();
		ss.assertEquals(s, "Java");
		System.out.println(s);
		System.out.println("sarathi");
	}
	@AfterClass
	private void tco2() {
		System.out.println("partha");
	}
	
}
