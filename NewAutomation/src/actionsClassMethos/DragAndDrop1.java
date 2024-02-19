package actionsClassMethos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");

		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[.='Drag & Drop']")).click();

		//store all drag value
		driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
		WebElement src1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement src2 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement src3 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement src4 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));

		//store all drop value	
		
		WebElement target1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement target2 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement target3 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		WebElement target4 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(src1, target1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src2, target2).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src3, target3).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src4, target4).perform();
		
	}

}
		
