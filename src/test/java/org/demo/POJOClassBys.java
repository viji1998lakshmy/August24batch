package org.demo;

import org.helperclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class POJOClassBys extends BaseClass{
	
	public POJOClassBys() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBys({
		
		@FindBy(xpath="//input[@autofocus='1']"),
		@FindBy(name="email")
	})
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}
	
	@FindBys({
		@FindBy(id="pass"),
		@FindBy(name="pass")
	})
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBys({
		@FindBy(name="login"),
		@FindBy(xpath="//button[@type='submit']")
	})
	private WebElement loginbtn;

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	

}
