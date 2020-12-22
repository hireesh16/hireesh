package week2.assignment;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioXpath {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/radio.html");
		driver.findElementByXPath("//input[@id='yes']").click();
		System.out.println(driver.findElementByXPath("(//input[@name='news'])[2]/..").getAttribute("for"));
		driver.findElementByXPath("(//input[@name='news'])[2]/..");
			}

}
