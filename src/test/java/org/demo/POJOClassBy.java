package org.demo;

import org.helperclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class POJOClassBy extends BaseClass{
	
    public POJOClassBy() {
		
    	PageFactory.initElements(driver,this);
    	
	}
    
    
    @FindBy(id="email")
    private WebElement username;

    @FindBy(name="pass")
    private WebElement password;
    
    
    @FindBy(xpath="//button[text()='Log in']")
    private WebElement loginbtn;
    
    public WebElement getUsername() {
		return username;
	}


    public WebElement getPassword() {
		return password;
	}

    public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	




	
	
	
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
