package SeleniumPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleDemoMethods {
	static WebDriver driver=null;
	
	public static void main(String[] args) throws InterruptedException {
		// ctr shift o - to import		
		invokeBrowser("chrome");//user defined method
		driver.get("https://www.google.com");
		/*
		 * driver.navigate().back();//go back to the previous url
		 * driver.navigate().forward(); driver.navigate().refresh(); driver.close();
		 */
		WebElement search = driver.findElement(By.name("q"));//identify the search box
		String actualTitle=driver.getTitle();
		String expectedTitle="Googl";
		System.out.println(driver.getTitle());
		
		//Title Validation
		if(actualTitle.equals(expectedTitle))//true
		{
			System.out.println("Title is matching");
		}
		else
			System.out.println("Title doesn't match");
		
		
		  search.sendKeys("Testing");//entering the value on the search box
		  
		  Thread.sleep(2000); search.sendKeys(Keys.ENTER);//does the key board enter
		  System.out.println(driver.getTitle());//capture the title of the window
		  Thread.sleep(3000); closeBrowser();
		 
	}
	
	//@SuppressWarnings("deprecation")
	public static void invokeBrowser(String browser)//user defined method/function
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();//max window size
		
	}
	
	public static void closeBrowser() throws InterruptedException//close browser function
	{
		Thread.sleep(2000);
		driver.close();
	}

}
