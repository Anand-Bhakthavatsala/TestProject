package JavaPrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GoogleDemo {
	
	//String browser="chrome";
	static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException {
		// print
		System.out.println("Welcome to Selenium Automation using Java language");
		
		//SeleniumDemo1 sd = new SeleniumDemo1();//creating the instance
		invokeBrowser("firefox");//calling the method
		
		driver.manage().window().maximize();//Maximize the browser
		
		//Enter the URL
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("Title of the page is :"+title);//Display the title of the page
		
		//To identify the text box in google page
		WebElement txtBox = driver.findElement(By.name("q"));
		System.out.println(txtBox.getSize());
		txtBox.sendKeys("selenium");//It will enter Selenium 
		Thread.sleep(3000);
		List<WebElement> hints = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		int totalSuggestions = hints.size();
		System.out.println("Total number of suggestions given by google: "+totalSuggestions);
		
		Thread.sleep(5000);
		
		for(int i=0;i<hints.size();i++)
		{
			System.out.println(hints.get(i).getText());
			
			if(hints.get(i).getText().equals("selenium webdriver")) {
				   hints.get(i).click();
				   System.out.println("Keyword matched");
				   break;
			}
			else
				System.out.println("Keyword not matching");
		}
		
		//driver.close();//close the browser
		
		
	}
	
	public static void invokeBrowser(String browser)
	{
		if(browser.equals("chrome")) //false
		{				
			//Open the Chrome browser
			//System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver_104/chromedriver.exe");
		//	WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();//maximize the window size of chrome
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			
		}
		else if(browser.equalsIgnoreCase("FIREFOX"))
		{
			//Firefox browser
			//System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver-v0.31.0-win64/geckodriver.exe");
		//	WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else
			System.out.println("None of the browsers are matching");
	}
	
	public static void closeBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();//to close the browser
		
	}

}
