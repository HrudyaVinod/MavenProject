package testNgcommands;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class NewTest2 {
	WebDriver driver;
  @Test
  public void SelectTitleFromDropDownAndVerify() {
	  WebElement userName = driver.findElement(By.id("loginform-username"));
		userName.sendKeys("carol");
		WebElement passWord = driver.findElement(By.id("loginform-password"));
		passWord.sendKeys("1q2w3e4r");
		WebElement loginButton = driver.findElement(By.name("login-button"));
		loginButton.click();
		WebElement worker = driver.findElement(By.xpath("//a[text()='Workers']"));
		worker.click();
		WebElement createWorker = driver.findElement(By.xpath("//a[text()='Create Worker']"));
		createWorker.click();
		WebElement title = driver.findElement(By.id("worker-title"));
		Select select = new Select(title);
		select.selectByValue("Ms");
		WebElement dropdown = select.getFirstSelectedOption();
		String actual = dropdown.getText();
		String expected = "Ms";
		//org.testng.Assert.assertEquals(actual, expected);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();
		
		
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterMethod
  public void afterMethod() {
	  
	 
  }

}
