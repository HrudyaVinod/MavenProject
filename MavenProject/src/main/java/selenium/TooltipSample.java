package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TooltipSample {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement aLL=driver.findElement(By.id("searchDropdownBox"));
		String toolTipvalue=aLL.getAttribute("title");
		System.out.println(toolTipvalue);
		
	}

}
