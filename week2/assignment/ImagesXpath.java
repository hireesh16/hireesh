package week2.assignment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagesXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElementByXPath("//div[@class='large-6 small-12 columns']/img").click();
		driver.navigate().back();
		driver.findElementByXPath("//label[text()='Am I Broken Image?']/following-sibling::img").click();
		driver.findElementByXPath("//label[text()='Am I Broken Image?']/following-sibling::img").sendKeys(Keys.TAB);;
		//img.click();
		System.out.println("invalid image");
		driver.findElementByXPath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img").click();
		System.out.println(driver.getTitle());
		
}
}