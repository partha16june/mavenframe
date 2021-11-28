package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Push extends LibGlobal{
public Push() {
	PageFactory.initElements(driver, this);
	
  }
  @FindBys({@FindBy(xpath="//input[@type='text']"),@FindBy(id="email")})
  public WebElement user;
  
  @FindBys({@FindBy(id="pass"),@FindBy(xpath="//input[@type='password']")})
  public WebElement pass;
  
  @FindBys({@FindBy(name="login"),@FindBy(xpath="//button[@value='1']")})
  public WebElement btn;

public WebElement getUser() {
	return user;
}
 
public WebElement getPass() {
	return pass;
}

public WebElement getBtn() {
	return btn;
}
  
  
  


















}
