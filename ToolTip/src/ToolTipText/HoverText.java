package ToolTipText;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HoverText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/");
		Thread.sleep(2000);
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("window.scroll(0,560)", "");
		Thread.sleep(2000);
		driver.navigate().to("http://www.leafground.com/pages/tooltip.html");
		Thread.sleep(2000);
		WebElement Tooltip=driver.findElementByXPath("//*[@id=\"age\"]");
		String tool=Tooltip.getAttribute("title");
		System.out.println("The Hover text is : " +tool);
		Thread.sleep(2000);
		driver.close();

	}

}
