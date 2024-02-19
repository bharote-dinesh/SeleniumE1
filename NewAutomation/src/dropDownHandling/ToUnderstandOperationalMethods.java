package dropDownHandling;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandOperationalMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/New%20folder/wcse2workspace/DropDownButoonMultiple.html");
		WebElement multiSelect = driver.findElement(By.name("menu"));
		
		// To Check whether the dropdown is Single-Select Or Multi-Select
		Select sel =new Select(multiSelect);
		/*boolean result = sel.isMultiple();
		System.out.println(result);*/
		
		// To get all the options from a dropdown using for loop
		List<WebElement> options = sel.getOptions();
		/*for(int i=0;i<options.size();i++)
		{
			String op = options.get(i).getText();
			System.out.println(op);
		} 
		System.out.println();*/
		
		// To get all the options from a dropdown using for each loop 
		for (WebElement we:options)
		{
			String ops = we.getText();
			System.out.println(ops);
		
			
		}
		


	}

}
