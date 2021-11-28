package org.login;

import org.testng.annotations.Test;

public class TestNG {

	@Test(priority=2)
	private void empId() {
		System.out.println("emp id is 123");

	}
	@Test(priority=-1)
	private void empName() {
		System.out.println("emp name is yash");

	}
	@Test(priority=1)
	private void empAddress() {
		System.out.println("emp address is chennai");

	}
}
