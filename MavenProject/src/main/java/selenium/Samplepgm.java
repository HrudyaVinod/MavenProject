
package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Samplepgm {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com");// navigate to a url
		String currenturl = driver.getCurrentUrl();
		driver.navigate().to("https://www.google.com");// will not check if the page is loaded
		System.out.println(currenturl);// get the url
		String title = driver.getTitle();
		System.out.println(title);// to get the tab heading
		String pagehtml = driver.getPageSource();
		System.out.println(pagehtml);// the source of current page
		driver.manage().window().maximize();// to maximize the window
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().deleteAllCookies();// Delete all the cookies for the current domain.
		driver.close();// current window will be closed
		driver.quit();// close all the pages

	}
}
