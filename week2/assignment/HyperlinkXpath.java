package week2.assignment;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperlinkXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElementByXPath("//a[text()='Go to Home Page']").click();
		driver.navigate().back();
		System.out.println(driver.findElementByXPath("//a[text()='Find where am supposed to go without clicking me?']").getAttribute("href"));		
		driver.findElementByXPath("//a[text()='Verify am I broken?']").click();
		String url = driver.getCurrentUrl();
		String a="http://leafground.com/pages/error.html";
		if(url.equals(a))
		{
			System.out.println("Broken");
		}
		else
		{
			System.out.println("Not Broken");
		}
		driver.navigate().back();
		driver.findElementByXPath("//a[text()='Go to Home Page']").click();//4
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElementByXPath("//a[text()='How many links are available in this page?']").click();
		List<WebElement> tags = driver.findElementsByTagName("a");//5
		System.out.println(tags.size());


	}

}
