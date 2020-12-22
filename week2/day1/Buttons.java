package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElementById("home").click();
		Thread.sleep(2000);
		driver.navigate().back();
		//driver.findElementByLinkText("Button").click();
		System.out.println(driver.findElementById("position").getLocation());
		System.out.println(driver.findElementById("color").getCssValue("background-color"));
		System.out.println(driver.findElementById("size").getSize());
		
		}

}
