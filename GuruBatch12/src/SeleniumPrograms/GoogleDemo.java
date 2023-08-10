package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleDemo {

	public static void main(String[] args) throws Exception {
		// ctr shift o - to import		
		//WebDriver driver = new FirefoxDriver(); //To open the Chrome browser
		//WebDriver driver = new EdgeDriver();
	//	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chrome\\chromedriver114\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	WebDriver driver = new FirefoxDriver();
	//	WebDriver driver = new EdgeDriver();
	//	driver.get("https://www.selenium.dev/downloads/");
		driver.get("https://www.google.com");
		/*
		 * driver.navigate().back();//go back to the previous url
		 * driver.navigate().forward(); driver.navigate().refresh(); driver.close();
		 */
		WebElement search = driver.findElement(By.name("q"));//identify the search box
		System.out.println(driver.getTitle());
		search.sendKeys("testing");//entering the value on the search box
	//	search.sendKeys(Keys.ENTER);//does the key board enter
		/*
		 * try { Thread.sleep(3000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		Thread.sleep(2000);
		List<WebElement> suggestion = driver.findElements(By.xpath("//span[contains(text(),'testing')]"));
		Thread.sleep(2000);
		System.out.println(suggestion.size());//8 or 10
		
		
		  System.out.println(suggestion.get(3).getText());//first suggestion text
		  Thread.sleep(2000); suggestion.get(2).click();//first suggestion
		  
		//  driver.close();
	}

}
