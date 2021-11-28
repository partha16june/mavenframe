 package org.login;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebElement;

import net.bytebuddy.implementation.bytecode.constant.SerializedConstant;

public class BaseClass extends LibGlobal{
public static void main(String[] args) throws InterruptedException, AWTException, IOException {
	getDriver();
	getUrl("https://adactinhotelapp.com/");
	
	AdactPom ad = new AdactPom();
	WebElement user = ad.getUser();
	user.sendKeys("parthaselvamani");
	WebElement pass = ad.getPass();
	pass.sendKeys("partha16_sai");
	WebElement login = ad.getLogin();
	login.click();
	WebElement locat = ad.getLocat();
	selectValue(locat, "Paris");
	WebElement hotel = ad.getHotel();
	selectIndex(hotel, 1);
	WebElement room = ad.getRoom();
	selectIndex(room, 2);
	WebElement roomqty = ad.getRoomqty();
	select(roomqty, "2 - Two");
	WebElement pickdate = ad.getPickdate();
	pickdate.sendKeys("15/11/2021");
	WebElement outdate = ad.getOutdate();
	txtSender(outdate, "20/11/2021");
	WebElement adult = ad.getAdult();
	selectIndex(adult, 2);
	WebElement child = ad.getChild();
	selectIndex(child, 2);
	Thread.sleep(9000);
	WebElement enter = ad.getEnter();
	enter.click();
	WebElement rad = ad.getRad();
	rad.click();
	
	
	
	
	
	
    
}
}
