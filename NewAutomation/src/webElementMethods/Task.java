package webElementMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.neilalexander.jnacl.crypto.xsalsa20;

import net.bytebuddy.implementation.bytecode.Division;

public class Task {
	public static void main(String[] args) throws InterruptedException {	
	
     WebDriver driver =new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     driver.get("https://www.flipkart.com/");
     Thread.sleep(2000);
    // driver.switchTo().activeElement().sendKeys("hp laptop");
     //Thread.sleep(2000);
    WebElement searchBox = driver.findElement(By.name("q"));
    Thread.sleep(2000);
    //search hp laptop into search textfield
    searchBox.sendKeys("hp laptop");
    //click on search button
    //driver.findElement(By.xpath("//button[@type='submit'")).click();
    driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']")).click();
    Thread.sleep(1000);
   //click on brand
    driver.findElement(By.xpath("//div[text()='Brand']")).click();
    Thread.sleep(1000);
    //click on product
    driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='HP')]")).click();
    Thread.sleep(1000);
    //click on processor
    // driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (.='Processor')]")).click();
    // Thread.sleep(1000);
     //click select processor
     driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i5')]")).click();
     Thread.sleep(1000);
     //click on ram
     driver.findElement(By.xpath("(//div[text()='RAM Capacity'])[1]")).click();
     //select 8 gb
     driver.findElement(By.xpath("//div[text()='8 GB']")).click();
     Thread.sleep(1000);
     
     //operating system
     driver.findElement(By.xpath("//div[text()='Operating System']")).click();
     //select windows 11
     driver.findElement(By.xpath("//div[text()='Windows 11']/preceding-sibling::div[@class='_24_Dny']")).click();
     Thread.sleep(1000);
     //select 4*rating
     driver.findElement(By.xpath("//div[text()='4★ & above']/preceding-sibling::div[@class='_24_Dny']")).click();
     
     //driver.findElement(By.xpath("")).click();
     List<WebElement> allLaptos = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
     List<WebElement> allPrizes = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
     
     for(int i=0;i<allLaptos.size();i++) 
     {
    	 String lp = allLaptos.get(i).getText();
    	 Thread.sleep(1000);
    	 
    	 for(int j=i;j<=i;j++)
    	 {
    		 String pz = allPrizes.get(j).getText();
    		 System.out.print(lp+ " :"+pz);
    		 Thread.sleep(1000);
    	 }
    	 System.out.println();
     }
    
}
}