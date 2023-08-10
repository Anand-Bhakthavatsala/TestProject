package JavaPrograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {
  
	/*
	 * @Test (priority=0)//Annotation public void first() {
	 * System.out.println("Welcome to TestNG");
	 * 
	 * }
	 * 
	 * @Test (priority=-1) public void second() {
	 * System.out.println("Lets continue to learn"); }
	 */
	
	WebDriver driver=null;
	@Test
	public void invokeBrowser() throws IOException
	{
		//WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver112\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		FileInputStream fis1 = new FileInputStream("E:\\eclipse-workspace\\GuruSchools-Batch10\\data.properties");
		Properties prop = new Properties();
		prop.load(fis1);
		String url = prop.getProperty("url");
		String userName = prop.getProperty("userName");
		String password = prop.getProperty("password");
		System.out.println(url);
		driver.get(url);
	}
}
