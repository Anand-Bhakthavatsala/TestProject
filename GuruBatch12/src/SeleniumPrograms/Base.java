package SeleniumPrograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Base {
	static WebDriver driver=null;
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
		
		public static void takeScreenShot() throws IOException
		{
			File src=null;	
			src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(src, new File("./scrshot/"+"screenshot-"+System.currentTimeMillis()+".png"));
		}

}
