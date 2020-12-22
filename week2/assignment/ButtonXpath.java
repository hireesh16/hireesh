package week2.assignment;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElementByXPath("//button[@id='home']").click();
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println(driver.findElementByXPath("//button[@id='position']").getLocation());
		System.out.println(driver.findElementByXPath("//button[@id='color']").getCssValue("background-color"));
		System.out.println(driver.findElementByXPath("//button[@id='size']").getSize());
		
	}

}
