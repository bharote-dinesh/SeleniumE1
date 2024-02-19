package dropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.spi.DelayablePolicy;

public class ToUmderstandDeselectMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/New%20folder/wcse2workspace/DropDownButoonMultiple.html");
		WebElement multiSelect = driver.findElement(By.name("menu"));

		Select sel=new Select(multiSelect);
		// To select an option by using index value
		/*sel.selectByIndex(1);
		Thread.sleep(5000);
	    sel.deselectByIndex(1);
	    
	 // To select an option by using value
	    sel.selectByValue("v3");
	    Thread.sleep(5000);
	    sel.deselectByValue("v3");
	    
	 // To select an option by using visible text
	    sel.selectByVisibleText("DOSA");
	    Thread.sleep(5000);
	    sel.deselectByVisibleText("DOSA");*/
	    
	 // To select all the options from the dropdown using for loop
	    for(int i=0;i<=7;i++)
	    {
	    	sel.selectByIndex(i);
	    	Thread.sleep(1000);
	    }
	    
	    Thread.sleep(1000);
	 // To Deselect all the options from the dropdown using for loop
	   /* for(int j=0;j<=7;j++)
	    {
	    	sel.deselectByIndex(j);
	    	Thread.sleep(1000);
	    }*/
	    sel.deselectAll();
	}

}
