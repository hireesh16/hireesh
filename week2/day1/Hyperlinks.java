package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElementByLinkText("Go to Home Page").click(); // 1
		//driver.findElementByLinkText("HyperLink").click();
		driver.navigate().back();
		System.out.println(driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href"));
		// 1 & 2 Completed
		
		driver.findElementByLinkText("Verify am I broken?").click();
		String url = driver.getCurrentUrl();
		if(url=="http://leafground.com/pages/error.html")
		{
			System.out.println("Broken");
		}
		else
		{
			System.out.println("Not Broken");
		}
		driver.navigate().back();
		driver.findElementByLinkText("Go to Home Page").click();//4
		Thread.sleep(2000);
		driver.findElementByLinkText("HyperLink").click();
		List<WebElement> tags = driver.findElementsByTagName("a");//5
		System.out.println(tags.size());
		
	}

}
