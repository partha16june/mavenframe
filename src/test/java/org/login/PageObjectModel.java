package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel extends LibGlobal {

	public PageObjectModel() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement username;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(name="login")
	private WebElement btnLogin;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
