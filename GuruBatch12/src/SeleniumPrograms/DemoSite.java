package SeleniumPrograms;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DemoSite extends Base{

	public static void main(String[] args) throws InterruptedException, IOException {
		//Invoke the browser
		invokeBrowser("edge");
		
		//enter the url
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		/*
		 * WebElement radio3 = driver.findElement(By.xpath("//input[@value='radio3']"));
		 * boolean b = radio3.isSelected();//false
		 * System.out.println("Before click of a radio 3 btn "+b); radio3.click();
		 * System.out.println("After click of a radio 3 btn "+radio3.isSelected());//
		 * true
		 * 
		 * //checkbox
		 * driver.findElement(By.cssSelector("input[id='checkBoxOption3']")).click();
		 * driver.findElement(By.cssSelector("input[id='checkBoxOption3']")).isSelected(
		 * );
		 * 
		 * //select WebElement optionObject =
		 * driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		 * Select options = new Select(optionObject); options.selectByIndex(1);
		 * Thread.sleep(2000); options.selectByValue("option2"); Thread.sleep(2000);
		 * options.selectByVisibleText("Option3");
		 */
		
		//Alert handling
		WebElement alertOk= driver.findElement(By.id("alertbtn"));
		alertOk.click();//click alert btn
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("Alert window clicked");
		
		//Confirm window
		driver.findElement(By.cssSelector("input[id='confirmbtn']")).click();
		Thread.sleep(2000);
		String alertTxt = driver.switchTo().alert().getText();
		System.out.println(alertTxt);
		//driver.switchTo().alert().dismiss();
	//	driver.navigate().to("https://book.spicejet.com/");
	//	takeScreenShot();
	//	closeBrowser();
		
		
	}

}
