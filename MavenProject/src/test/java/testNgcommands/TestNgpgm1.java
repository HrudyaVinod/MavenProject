package testNgcommands;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class TestNgpgm1 {
	WebDriver driver;

	@Test(enabled =false)//enabled=false ,it wont run
	public void verifyLoginwithValidUser() {
		WebElement userName = driver.findElement(By.id("loginform-username"));
		userName.sendKeys("carol");
		WebElement passWord = driver.findElement(By.id("loginform-password"));
		passWord.sendKeys("1q2w3e4r");
		WebElement loginButton = driver.findElement(By.name("login-button"));
		loginButton.click();
		WebElement payrollApplication = driver.findElement(By.xpath("//h1[text()='Payroll Application']"));
		String actual = payrollApplication.getText();// actual result
		String expected = "PAYROLL APPL";// error will arise
		// org.testng.Assert.assertEquals(actual, expected);
		SoftAssert sa = new SoftAssert();// soft Assertions -As we failed in 35st line in case of soft assertions,
											// execution wont terminate,it will show in console or testng report
		sa.assertEquals(actual, expected);
		System.out.println("***************");// hard assertions -execution will terminate as assertion fails on 31 st
												// line
		sa.assertAll();// assertAll will come when we give soft assert

	}

	@Test(retryAnalyzer = testNgcommands.RetryTest.class)
	public void VerifySearchButtonText() {
		WebElement userName = driver.findElement(By.id("loginform-username"));
		userName.sendKeys("carol");
		WebElement passWord = driver.findElement(By.id("loginform-password"));
		passWord.sendKeys("1q2w3e4r");
		WebElement loginButton = driver.findElement(By.name("login-button"));
		loginButton.click();
		WebElement worker = driver.findElement(By.xpath("//a[text()='Workers']"));
		worker.click();
		WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
		String actual = searchButton.getText();
		String expected = "SeArch";
		//org.testng.Assert.assertEquals(actual, expected);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();

	}

	@Test(enabled=false)

	public void VerifySearchButtonFontSize() {
		WebElement userName = driver.findElement(By.id("loginform-username"));
		userName.sendKeys("carol");
		WebElement passWord = driver.findElement(By.id("loginform-password"));
		passWord.sendKeys("1q2w3e4r");
		WebElement loginButton = driver.findElement(By.name("login-button"));
		loginButton.click();
		WebElement worker = driver.findElement(By.xpath("//a[text()='Workers']"));
		worker.click();
		WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
		String actualfontSize = searchButton.getCssValue("font-size");
		String expectedfontsize = "14px";
		//org.testng.Assert.assertEquals(actualfontSize, expectedfontsize);
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualfontSize, expectedfontsize);
		sa.assertAll();

	}

	@Test(enabled=false)
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

	@Test(enabled=false)
	public void VerifyRequiredPOCheckbox() {
		WebElement userName = driver.findElement(By.id("loginform-username"));
		userName.sendKeys("carol");
		WebElement passWord = driver.findElement(By.id("loginform-password"));
		passWord.sendKeys("1q2w3e4r");
		WebElement loginButton = driver.findElement(By.name("login-button"));
		loginButton.click();
		WebElement clients = driver.findElement(By.xpath("//a[text()='Clients']"));
		clients.click();
		WebElement createClient = driver.findElement(By.xpath("//a[text()='Create Client']"));
		createClient.click();
		WebElement requiredPo = driver.findElement(By.id("client-require_po"));
		requiredPo.click();
		Boolean checkBox = requiredPo.isSelected();

		org.testng.Assert.assertTrue(requiredPo.isSelected(), "The Required po checkbox should be selected");
		

	}

	@BeforeMethod
	@Parameters("browser")
	public void beforeMethod(String c) {
		if(c.equals("chrome"))
		{
			driver = new ChromeDriver();	
		}
		else if (c.equals("edge"))
		{
			driver= new EdgeDriver();
		}
		else if(c.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
