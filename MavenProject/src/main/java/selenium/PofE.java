package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PofE {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessage=driver.findElement(By.id("button-one"));
		Boolean show=showMessage.isDisplayed();
		Boolean show1 =showMessage.isEnabled();
		System.out.println(show);
		System.out.println(show1);
	}

}
