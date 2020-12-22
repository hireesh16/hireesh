package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditWork {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElementById("email").sendKeys("123@gmail.com");
		driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input").sendKeys("Hireesh");
		System.out.println(driver.findElementByName("username").getAttribute("value"));
		driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input").clear();
		System.out.println(driver.getTitle());
		System.out.println(driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input").isEnabled());
		
		
		
	}

}
