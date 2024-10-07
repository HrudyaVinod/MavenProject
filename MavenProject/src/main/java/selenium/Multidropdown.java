package selenium;

import java.lang.StackWalker.Option;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multidropdown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		WebElement multidropDown = driver.findElement(By.id("multi-select-field"));
		
		Select select = new Select(multidropDown);
		select.selectByIndex(0);
		select.selectByIndex(1);
		select.selectByIndex(2);
		List<WebElement> multidrop = select.getAllSelectedOptions();
	

		for (int i = 0; i < multidrop.size(); i++) {
			String text = multidrop.get(i).getText();
			System.out.println(text);
			
			
			
		}

	}
}
