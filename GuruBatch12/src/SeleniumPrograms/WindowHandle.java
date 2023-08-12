package SeleniumPrograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class WindowHandle extends Base{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		invokeBrowser("chrome");
		driver.navigate().to("https://accounts.google.com/InteractiveLogin/signinchooser?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=AeDOFXiNw5hAHcMismtIUNiHm9ga1HK_0XE6dO975MKl9-3H6FINdiz8PMGflIQLEGOwC-pBVT0vCw&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		Thread.sleep(2000);
		//Capture the link
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Help")).click();//click the Help link 
		
		//Iterator concept
		Set<String> ids = driver.getWindowHandles();//impt interview ques
		Iterator<String> ir = ids.iterator();
		String parent = ir.next();//parent window
		String privacy = ir.next();//child window
		String help = ir.next();//child window
		
		//Switch from parent window to child window
		driver.switchTo().window(privacy);//->privacy window
		Thread.sleep(2000);
		System.out.println(driver.getTitle());//privacy title
		//Switch back to parent window from child window
		Thread.sleep(2000);
		driver.switchTo().window(help);
		System.out.println(driver.getTitle());//help title
		
		
	}

}
