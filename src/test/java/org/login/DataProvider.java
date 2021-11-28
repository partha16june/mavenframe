package org.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DataProvider extends LibGlobal {

	@Test(dataProvider="mydatas",dataProviderClass=BaseDataProvider.class)
	public void faceBook(String s,String s1) throws InterruptedException {
		getDriver();
		getUrl("https://www.instagram.com/");
		Thread.sleep(3000);
		WebElement txtUser = name("username");
		txtUser.sendKeys(s);
		Thread.sleep(3000);
		WebElement pass = name("password");
		pass.sendKeys(s1);
		
	}
	
	
	
}
