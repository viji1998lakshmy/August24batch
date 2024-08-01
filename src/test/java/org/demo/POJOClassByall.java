package org.demo;

import org.helperclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOClassByall extends BaseClass{
	
	public POJOClassByall() {
		
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindAll({
		@FindBy(xpath="//input[@autofocus='1']"),
		@FindBy(name="emal")

	})
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}
    @CacheLookup 
	@FindAll({
		@FindBy(id="pass"),
		@FindBy(name="pass")
	})
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	@CacheLookup
	@FindAll({
		@FindBy(name="login"),
		@FindBy(xpath="//button[@type='submit']")
	})
	private WebElement loginbtn;

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
}
