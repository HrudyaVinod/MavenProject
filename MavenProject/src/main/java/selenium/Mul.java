package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mul {
	public static void main(String[] args) {

		// Initialize WebDriver instance
		WebDriver driver = new ChromeDriver();

		// Navigate to the web page with the multi-select dropdown
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();

		// Locate the multi-select dropdown element
		WebElement multidropDown = driver.findElement(By.id("button-all")); // Replace with actual ID

		// Create an instance of the Select class and pass the multi-select dropdown
		// element
		Select select = new Select(multidropDown);

		// Select multiple values in the multi-select dropdown
		select.selectByValue("Green");
		select.selectByValue("Yellow");
		select.selectByValue("Red");

		// Get all selected options in the multi-select dropdown
		List<WebElement> multidrop = select.getAllSelectedOptions();

		// Verify the selected options
		for (WebElement option : multidrop) {
			System.out.println(option.getText());
		}

	}
}
