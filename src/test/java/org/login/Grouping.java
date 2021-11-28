package org.login;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups="@smoke")
	private void tc01() {
		System.out.println("test 1");

	}
	@Test(groups="@sanity")
	private void tc02() {
		System.out.println("test 2");

	}
	@Test(groups ="@smoke")
	private void tc03() {
		System.out.println("test 3");

	}
	@Test(groups="@reg")
	private void tc04() {
		System.out.println("test 4");

	}
	@Test(groups="@reg")
	private void tc05() {
		System.out.println("test 5");

	}
	@Test(groups="@smoke")
	private void tc06() {
		System.out.println("test 6");

	}
	@Test(groups="@sanity")
	private void tc07() {
		System.out.println("test 7");

	}
	
}
