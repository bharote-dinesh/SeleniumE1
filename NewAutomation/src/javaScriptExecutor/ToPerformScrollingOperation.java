package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformScrollingOperation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();//to launch the browser
		driver.manage().window().maximize();//to maximize the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//to provide implicit wait
		driver.get("https://www.selenium.dev/");//to launch the web Application
		
		JavascriptExecutor js =(JavascriptExecutor)driver;//to typecast from webDriver to JavaScriptExecutor
		js.executeScript("window.scrollBy(0,1000);");//to perform scroll down operation
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-500);");

	}

}
