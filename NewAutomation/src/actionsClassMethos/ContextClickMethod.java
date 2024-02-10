package actionsClassMethos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod {

	public static void main(String[] args) {
		
		 WebDriver	 driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		  
		  Actions act = new Actions(driver);
		 WebElement button = driver.findElement(By.xpath("//section[text()='Button']"));
		 act.click(button).perform();
		 WebElement rightClick = driver.findElement(By.xpath("//a[text()='Right Click']"));
		 act.click(rightClick).perform();
		 
		WebElement button1 = driver.findElement(By.xpath("//button[@id='btn30']"));
		act.contextClick(button1).perform();
	    WebElement yesButton = driver.findElement(By.xpath("//div[text()='Yes']"));
	    act.click(yesButton).perform();
		 
		 
		 WebElement button2 = driver.findElement(By.xpath("//button[@id='btn31']"));
		 act.contextClick(button2).perform();
		 WebElement noButton1 = driver.findElement(By.xpath("//div[text()='No']"));
		 act.click(noButton1).perform();
		 
		 WebElement button3 = driver.findElement(By.id("btn32"));
		 act.contextClick(button3).perform();
		WebElement numberButton = driver.findElement(By.xpath("//div[text()='3']"));
		act.click(numberButton).perform();
		 
		
		 
		
		 
		 
		 
		 
		 

	}

}
