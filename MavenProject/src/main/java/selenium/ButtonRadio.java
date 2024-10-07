package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonRadio {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement radioButton1=driver.findElement(By.cssSelector("input#inlineRadio1"));
		radioButton1.click();
		Boolean radio=radioButton1.isSelected();
		System.out.println(radio);
	}

}
