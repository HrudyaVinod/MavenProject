package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebelement1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement message = driver.findElement(By.id("single-input-field"));
		message.sendKeys("Hello Selenium!");
		WebElement showmessageButton = driver.findElement(By.id("button-one"));
		showmessageButton.click();
		WebElement valueA = driver.findElement(By.id("value-a"));
		WebElement valueB = driver.findElement(By.id("value-b"));
		WebElement gettotalButton = driver.findElement(By.id("button-two"));
		gettotalButton.click();
		String showmessageButtonText = showmessageButton.getText();
		System.out.println(showmessageButtonText);
		String gettotalButtonText = gettotalButton.getText();
		System.out.println(gettotalButtonText);
		String showMessageColor = showmessageButton.getCssValue("background-color");
		System.out.println(showMessageColor);
		String gettotalColor = gettotalButton.getCssValue("background-color");
		System.out.println(gettotalColor);

	}

}
