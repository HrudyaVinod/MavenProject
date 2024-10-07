package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteButton {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicit wait
		WebElement userName = driver.findElement(By.id("loginform-username"));
		userName.sendKeys("carol");
		WebElement passWord = driver.findElement(By.id("loginform-password"));
		passWord.sendKeys("1q2w3e4r");
		WebElement loginButton = driver.findElement(By.name("login-button"));
		loginButton.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Workers']")));
		WebElement worker = driver.findElement(By.xpath("//a[text()='Workers']"));
		worker.click();
		WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
		WebDriverWait searchButtonwait = new WebDriverWait(driver, Duration.ofSeconds(10));
		searchButtonwait.until(ExpectedConditions.textToBe(By.xpath("//button[@type='submit']"), "Search"));
		
		
		String locator1 = null;

		List<WebElement> deleteButton = driver.findElements(By.xpath("//table[@class='table table-striped table-bordered']//tbody//td[1]"));//Finds all the elements in the first column (td[1]) of the table rows in the table

		for (int i = 0; i < deleteButton.size(); i++)
		{
			if (deleteButton.get(i).getText().equals("3"))
			{
			locator1 = "//table[@class='table table-striped table-bordered']//tbody//tr[" + (i + 1) + "]//td[8]//a[3]";
			break;

		    }
		}
		
		WebElement deleteBtn = driver.findElement(By.xpath(locator1));//Finds the delete button using the dynamically constructed XPath (locator1) and clicks it.
		deleteBtn.click();

		wait.until(ExpectedConditions.alertIsPresent());
	

		}
	}
	

