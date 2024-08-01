package org.elements;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.jcajce.provider.keystore.BC;
import org.demo.POJOClassBy;
import org.helperclass.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnit1 extends BaseClass{
	
	
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void test1() {
		launchChromeBrowser();
		windowMaximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        launchUrl("https://www.facebook.com/");
        
        String title = getTitle();
        // static method className.methodName
        Assert.assertTrue("To check the title", title.contains("Facebook"));
       // Assert.assertTrue("To check the title", getTitle().contains("Facebook"));  
        POJOClassBy p = new POJOClassBy();
        sendText(p.getUsername(), passDataFromExcel("Data", 3, 3));
	}
	
	@Test
	public void test2() {
		
		POJOClassBy p = new POJOClassBy();
        sendText(p.getPassword(), passDataFromExcel("Data", 1, 4));
        
        String actualValue = p.getPassword().getAttribute("Value");
        
        Assert.assertEquals("To check password","blue", actualValue);
        btnClick(p.getLoginbtn());
	}
	
}