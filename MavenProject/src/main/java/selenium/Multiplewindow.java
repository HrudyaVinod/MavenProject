package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindow {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		WebElement newTab = driver.findElement(By.xpath("//button[text()='New Tab']"));// Locate and click on the "New
																						// Tab" button
		newTab.click();
		String parentWindow = driver.getWindowHandle();// get the parent window handle
		System.out.println(parentWindow);
		Set<String> allWindows = driver.getWindowHandles();// set<String> will be used to get all window handles
		System.out.println(allWindows);
		for (String childWindow : allWindows) { // Iterate through the window handles

			if (!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow); // switch to the child window
				WebElement samplePge = driver.findElement(By.id("sampleHeading")); // perform actions in child window
				String SamplePageText = samplePge.getText();
				System.out.println(SamplePageText);
				driver.switchTo().window(parentWindow); // switch back to the parent window

			}
		}
	}

}
