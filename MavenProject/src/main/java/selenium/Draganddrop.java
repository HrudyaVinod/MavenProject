package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/drag-drop.php");
		driver.manage().window().maximize();
		WebElement source = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement target = driver.findElement(By.id("mydropzone"));
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();

	}

}
