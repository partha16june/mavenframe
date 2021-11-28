package org.login;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Parameters extends LibGlobal {

	@BeforeClass
	private void tco1() {
		getDriver();
		getUrl("https://www.facebook.com/");
	}
	@org.testng.annotations.Parameters("username")
	@Test
	private void tc02(String s) {
		WebElement txtUser = id("email");
		txtUser.sendKeys(s);

	}
	@org.testng.annotations.Parameters("password")
	@Test
	private void tco3(String s) {
		WebElement txtPass = id("pass");
		txtPass.sendKeys(s);
		
	}
	@AfterClass
	private void tc03() {
		WebElement btn = name("login");
		btn.click();
	}
	
}
