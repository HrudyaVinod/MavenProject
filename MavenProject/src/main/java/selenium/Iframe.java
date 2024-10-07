package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		// driver.switchTo().frame("frame1"); //Exception will arise other wise it will
		// switch to the iframe using name or id of the iframe
		WebElement iframeElement = driver.findElement(By.id("sampleHeading")); // locate the element inside the iframe
		String iframeElementText = iframeElement.getText();
		System.out.println(iframeElementText); // print the text of the element
		driver.switchTo().defaultContent();
		// driver.switchTo().parentFrame();// defaultContent or parentFrame can use to
		// switch back to parent frame

	}

}
