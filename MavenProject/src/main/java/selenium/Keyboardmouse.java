package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardmouse {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);//which allows performing complex user interactions like mouse hover, double-click, and right-click.
		WebElement doubleClick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		action.doubleClick(doubleClick).perform();// to perform double click
		WebElement rightClick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		action.contextClick(rightClick).perform();// to perform right click
		action.sendKeys(Keys.F5).perform();// to perform keyboard actions
		action.moveToElement(doubleClick).perform();// to perform mouse over

	}

}
