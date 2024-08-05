package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Execution {
	
	public static void main(String[] args) {
		
		//System.setProperty(key, value);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("viji");
		
		System.out.println("Work done by developer");
		System.out.println("Running in Local");
		System.out.println("Developer fixed the BUG");
		
		
	}

}
