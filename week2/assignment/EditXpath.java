package week2.assignment;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElementByXPath("//input[@id='email']").sendKeys("123@gmail.com");
		driver.findElementByXPath("(//div[@class='large-6 small-12 columns']/input)[2]").sendKeys("hireesh");
		System.out.println(driver.findElementByXPath("(//input[@name='username'])[1]").getAttribute("value"));
		driver.findElementByXPath("(//input[@name='username'])[2]").clear();
		System.out.println(driver.findElementByXPath("//input[@disabled='true']").isEnabled());
	}

}
