package dropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.schema.SchemaElementChildrenContainer;

public class ToUnderstandSelectMethod {

	public static void main(String[] args) throws InterruptedException {
		
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("file:///E:/New%20folder/wcse2workspace/DropDownButoon.html");
       WebElement dropDown = driver.findElement(By.name("menu"));
       
       Select sel = new Select(dropDown);
    // To select an option by using the Index value
       sel.selectByIndex(1);
       Thread.sleep(5000);
       
    // To select an option by using the Value of the Option
        sel.selectByValue("v3");
        Thread.sleep(5000);
        
     // To select an option by using the Text of the Option
        sel.selectByVisibleText("DOSA");
        Thread.sleep(5000);

	}

}
