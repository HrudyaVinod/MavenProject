package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTable {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		List<WebElement> firstRow = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td"));//Locates all elements matching the specified XPath.
		for (int i = 0; i < firstRow.size(); i++) { //Starts a for loop that iterates over each element in the firstRow list. firstRow.size() returns the number of elements (cells) in the first row.
			String text = firstRow.get(i).getText();//Retrieves the WebElement at index i in the firstRow list.
			System.out.println(text);// first row of values

		}
		List<WebElement> firstColumn = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		for (int i = 0; i < firstColumn.size(); i++) {
			String text = firstColumn.get(i).getText();
			System.out.println(text);// first column of values
		}
	}

}
