package JavaPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
*/

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chrome\\chromedriver114\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com/");
	
		WebElement textbox = driver.findElement(By.name("q"));//To identify the textbox
		textbox.sendKeys("Guru Schools"); //Action to enter the text
		textbox.sendKeys(Keys.RETURN);//Keyboard action
		
		String title = driver.getTitle(); //Get the title of the page
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		driver.getPageSource();
		Thread.sleep(2000);
		driver.close();
	}

}
