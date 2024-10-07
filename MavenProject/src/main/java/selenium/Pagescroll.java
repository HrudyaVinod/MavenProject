package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagescroll {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)", "");//js code
		js.executeScript("window.scrollBy(0,-1000)", "");
		//js.executeScript("arguments[0].click();", element);
		//WebElement hyperLink = driver.findElement(By.linkText("Bootstrap Alert"));
		// hyperLink.click();
		 WebElement partialhyperLink = driver.findElement(By.partialLinkText(" Alert"));
		 partialhyperLink.click();
	}

}
