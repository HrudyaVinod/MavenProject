package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		String locator = null;
		List<WebElement> firstColumn = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//td[1]")); // get the first column (contains names) of the table
		for (int i = 0; i < firstColumn.size(); i++) { //loop through each row in the first column 
			if (firstColumn.get(i).getText().equals("Ashton Cox")) {// check if the text matches with "Ashton cox"
				locator = "//table[@id='dtBasicExample']//tbody//tr[" + (i + 1) + "]//td[4]";// xpath to locate the 4 th column of the matched row
				break;
			}

		}
		WebElement dynamicTable = driver.findElement(By.xpath(locator));// retrieve the element and print its text
		String text = dynamicTable.getText();
		System.out.println(text);

	}

}

