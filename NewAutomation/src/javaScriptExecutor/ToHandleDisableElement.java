package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDisableElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.get("https://demoapps.qspiders.com/ui");
		// driver.findElement(By.	)
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		Thread.sleep(1000);
		WebElement disabledTextbox = driver.findElement(By.id("name"));
		
		//To Typecast into JavascriptExecutor
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//To pass input to Disabled Element
		js.executeScript("document.getElementById('name').value='Dinesh'");
		Thread.sleep(1000);
		
		// To clear the content from a disabled Textbox
		//js.executeScript("document.getElementById('name').value=''");
		
		// 2nd way of To clear the content from a disabled Textbox
		js.executeScript("arguments[0].value=''",disabledTextbox);
		//js.executeScript("arguments[].value=''",disabledTextbox);
		//js.executeAsyncScript("documents.getElementById('name').value=''");

	}

}
