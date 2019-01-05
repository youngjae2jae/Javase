package com.selenium.testing.locators;

import java.io.File;
import java.io.IOException;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonTest {
	WebDriver driver;
	ResourceBundle rb=ResourceBundle.getBundle("config");
	public void takeScreenShot(String screenshotname) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File(rb.getString("screenshot")+screenshotname+".jpeg");
		FileUtils.copyFile(src, dest);

	}

	public void amazonAcess() throws IOException, InterruptedException {
		System.setProperty(rb.getString("webdriver"), rb.getString("webbrowser"));
		
		driver = new ChromeDriver();
        driver.get(rb.getString("url"));
		takeScreenShot("shot1");
		driver.findElement(By.xpath("//a[text()='Your Amazon.in']")).click();;
		takeScreenShot("shot2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(rb.getString("usernmae"));;
		driver.findElement(By.id("continue")).click();;
		takeScreenShot("shot3");
		driver.findElement(By.id("ap_password")).sendKeys(rb.getString("password"));;
		driver.findElement(By.id("signInSubmit")).click();
		takeScreenShot("shot4");
		
		Thread.sleep(3000);
		driver.close();

	}
	public void dynamicdropdown() throws IOException, InterruptedException {
		
		System.setProperty(rb.getString("webdriver"), rb.getString("webbrowser"));
		driver = new ChromeDriver();
        driver.get(rb.getString("url"));
		takeScreenShot("shot1");
/*	WebElement shop=	driver.findElement(By.xpath("//span[text()='Shop by']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(shop).perform();;
		takeScreenShot("dp1");
		Thread.sleep(3000);
		
		WebElement comp=driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		ac.moveToElement(comp).perform();;
		takeScreenShot("dp2");
		Thread.sleep(3000);
		WebElement powerbank=driver.findElement(By.xpath("//span[text()='Power Banks']"));
		ac.moveToElement(powerbank).click().perform();
		takeScreenShot("dp3");
		Thread.sleep(3000);
		driver.navigate().back();*/
	WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("bluetooth headphones");
	search.submit();
	Thread.sleep(3000);
	WebElement hit=	driver.findElement(By.cssSelector("[data-attribute='Syvo Blaze Bluetooth 5.0 Headphones Waterproof IPX7, Wireless Earbuds Sport, Richer Bass HiFi Stereo in-Ear Earphones w/Mic, Case, 8-10 Hrs Playback Noise Cancelling Headsets (Comfy & Fast Pairing)']"));
		hit.click();
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-button")).click();;
		Thread.sleep(3000);
		driver.findElement(By.id("nav-cart")).click();;
		driver.findElement(By.name("proceedToCheckout")).click();;
		
		driver.close();
		
		
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		AmazonTest a=new AmazonTest();
		//a.amazonAcess();
		a.dynamicdropdown();

	}

}
