package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactPom extends LibGlobal {

	public AdactPom() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement user;
	@FindBy(name="password")
	private WebElement pass;
	@FindBy(xpath="//input[@type='Submit']")
	private WebElement login;
	@FindBy(id ="location")
	private WebElement locat;
	@FindBy(id ="hotels")
	private WebElement hotel;
	@FindBy(id="room_type")
	private WebElement room;
	@FindBy(id="room_nos")
	private WebElement roomqty;
	@FindBy(id="datepick_in")
	private WebElement pickdate;
	@FindBy(id="datepick_out")
	private WebElement outdate;
	@FindBy(name="adult_room")
	private WebElement adult;
	@FindBy(name="child_room")
	private WebElement child;
	@FindBy(id="Submit")
	private WebElement enter;
	@FindBy(id="radiobutton_0")
	private WebElement rad;
	
	
	public WebElement getRad() {
		return rad;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoom() {
		return room;
	}
	public WebElement getRoomqty() {
		return roomqty;
	}
	public WebElement getPickdate() {
		return pickdate;
	}
	public WebElement getOutdate() {
		return outdate;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getEnter() {
		return enter;
	}
	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getLocat() {
		return locat;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
