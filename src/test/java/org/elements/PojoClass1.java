package org.elements;

import org.demo.POJOClassBy;
import org.helperclass.BaseClass;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass1 extends BaseClass {
	
public static void main(String[] args) {
	launchChromeBrowser();
	windowMaximize();
	launchUrl("https://www.facebook.com/");
	
	POJOClassBy p = new POJOClassBy();
	WebElement user = p.getUsername();
	
 sendText(user, passDataFromExcel("Data", 2, 3));	
	
 sendText(p.getPassword(),passDataFromExcel("Data", 3, 2));
 
 btnClick(p.getLoginbtn());

	
	
	
	
	
	
}

	

	
	
	}




 