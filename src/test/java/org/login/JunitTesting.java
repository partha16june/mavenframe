package org.login;

import java.util.Date;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class JunitTesting extends LibGlobal {

	@BeforeClass
	public static void getDiver() {
		getDriver();
		getUrl("https://www.facebook.com/");

	}

	@Test
	public void findElements() {
		WebElement user = id("email");
		user.sendKeys("parthas");
		getAtrribute(user, "value");
		
	}

	@AfterClass
	public static void dat() {
		Date d1 = new Date();
		System.out.println(d1);

	}
	
	@After
	public void pass() {
		WebElement pass = id("pass");
		txtSender(pass, "090909");
		getAtrribute(pass, "value");

	}

	@Before
	public void date() {
		Date d = new Date();
		System.out.println(d);

	}

}
