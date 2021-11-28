package org.login;

import org.openqa.selenium.WebElement;

import bsh.classpath.BshClassPath.GeneratedClassSource;

public class Twitter extends LibGlobal {
public static void main(String[] args) throws InterruptedException {
	getDriver();
	getUrl("https://twitter.com/login");
	Thread.sleep(5000);
	WebElement user = xpath("//input[@inputmode='text']");
	user.sendKeys("lkfghjlkjfgh");
	
}
}
