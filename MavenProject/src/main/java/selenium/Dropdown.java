package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		WebElement dropDown = driver.findElement(By.id("single-input-field"));
		Select select = new Select(dropDown);// Object creation with Select class
		//select.selectByIndex(3);
		//select.selectByVisibleText("Green");
		select.selectByValue("Green");
		WebElement drop = select.getFirstSelectedOption();
		String text = drop.getText();
		System.out.println(text);

	}

}
