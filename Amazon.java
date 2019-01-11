package com.selenium.testing.locators;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.util.ResourceBundle;

import javax.servlet.annotation.WebListener;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;

public class AmazonTest {
	WebDriver driver;
	ResourceBundle rb = ResourceBundle.getBundle("config");

	public void takeScreenShot(String screenshotname) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File(rb.getString("screenshot") + screenshotname + ".jpeg");
		FileUtils.copyFile(src, dest);

	}

	public void opening() throws IOException {
		System.setProperty(rb.getString("webdriver"), rb.getString("webbrowser"));

		driver = new ChromeDriver();
		driver.get(rb.getString("url"));
		driver.manage().window().maximize();
		takeScreenShot("shot1");

	}

	public void amazonAcess() throws IOException, InterruptedException {
		opening();
		driver.findElement(By.xpath("//a[text()='Your Amazon.in']")).click();
		;
		takeScreenShot("shot2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(rb.getString("usernmae"));
		;
		driver.findElement(By.id("continue")).click();
		;
		takeScreenShot("shot3");
		driver.findElement(By.id("ap_password")).sendKeys(rb.getString("password"));
		;
		driver.findElement(By.id("signInSubmit")).click();
		takeScreenShot("shot4");

		Thread.sleep(3000);
		// driver.close();

	}

	public void dynamicdropdown() throws IOException, InterruptedException {

		// System.setProperty(rb.getString("webdriver"), rb.getString("webbrowser"));
		// driver = new ChromeDriver();

		// driver.get(rb.getString("url"));
		// takeScreenShot("shot1");
		amazonAcess();
		/*
		 * WebElement shop= driver.findElement(By.xpath("//span[text()='Shop by']"));
		 * Actions ac=new Actions(driver); ac.moveToElement(shop).perform();;
		 * takeScreenShot("dp1"); Thread.sleep(3000);
		 * 
		 * WebElement
		 * comp=driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		 * ac.moveToElement(comp).perform();; takeScreenShot("dp2"); Thread.sleep(3000);
		 * WebElement
		 * powerbank=driver.findElement(By.xpath("//span[text()='Power Banks']"));
		 * ac.moveToElement(powerbank).click().perform(); takeScreenShot("dp3");
		 * Thread.sleep(3000); driver.navigate().back();
		 */
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("bluetooth headphones");
		search.submit();
		Thread.sleep(3000);
		WebElement h = driver.findElement(By.xpath(
				"//ul[@id='s-results-list-atf']/li[@id='result_1']//a[@class='a-link-normal s-access-detail-page  s-color-twister-title-link a-text-normal']/h2"));
		Thread.sleep(3000);
		if (h.isEnabled()) {
			System.out.println("yes");
			String z = h.getText();
			String x = h.getCssValue(z);
			System.out.println(x);
			h.click();
			Thread.sleep(3000);

		}
		WebElement m = driver.findElement(By.xpath("//input[@id='add-to-cart-button' and @name='submit.add-to-cart']"));
		Thread.sleep(3000);
		if (m.isEnabled()) {
			m.click();
		}
		driver.findElement(By.id("nav-cart")).click();
		;
		driver.findElement(By.name("proceedToCheckout")).click();
		;

		driver.close();

	}

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		AmazonTest a = new AmazonTest();
		// a.amazonAcess();
		a.dynamicdropdown();

	}

}
