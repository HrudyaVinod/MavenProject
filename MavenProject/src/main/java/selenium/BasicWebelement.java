package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebelement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();

		WebElement userName = driver.findElement(By.id("loginform-username")); // declaring username field
		userName.sendKeys("hrudya"); // sending data to be entered
		userName.clear(); // to clear the field
		String tagName = userName.getTagName();
		System.out.println(tagName);
		String attributeValue = userName.getAttribute("name");
		System.out.println(attributeValue);

		WebElement password = driver.findElement(By.name("LoginForm[password]"));
		password.sendKeys("hrudyapassword");
		WebElement loginButton = driver.findElement(By.name("login-button"));
		loginButton.click();
		String text = loginButton.getText(); // returns text on selected web element
		System.out.println(text);
		String fontsize = loginButton.getCssValue("font-size");// returns font size of selected web element
		System.out.println(fontsize);

	}

}
