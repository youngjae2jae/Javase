package com.selenium.testing.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelCode {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login/");
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();;
	//	WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		//Select se=new Select(day);
	
		Thread.sleep(3000);
		//se.selectByValue("21");
		//Thread.sleep(3000);
		//se.selectByVisibleText("Day");
        driver.findElement(By.xpath("//a[@id='forgot-password-link']")).click();;
        driver.findElement(By.xpath("(//input[@class='inputtext'])[3]")).sendKeys("abcdefg");;
        
        Thread.sleep(3000);
        
        driver.close();
	}

}
