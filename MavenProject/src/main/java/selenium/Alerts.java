package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		WebElement clickMe = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickMe.click();
		//driver.switchTo().alert().accept();// to give ok for the prompt 
		driver.switchTo().alert().getText();// to get the text after clicking on ok
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().dismiss();//to cancel the prompt
		
		

	}

}
