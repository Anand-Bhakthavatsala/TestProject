package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImageClickExample {
	 public static void main(String[] args) {
	     
	        // Create a new instance of ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Navigate to the webpage
	        driver.get("https://example.com");

	        // Set the maximum time to wait for the image to load
	        int timeout = 4;

	        try {
	            // Wait until the image is clickable within the timeout period
	            WebElement image = new WebDriverWait(driver, null).until(
	                    ExpectedConditions.elementToBeClickable(By.cssSelector("img#image-id"))
	            );

	            // Click on the image
	            image.click();

	            // Perform further actions with the clicked image if needed

	        } catch (Exception e) {
	            // Handle any exceptions or timeout errors
	            System.out.println("Failed to click on the image: " + e.getMessage());
	        }

	    }
}
