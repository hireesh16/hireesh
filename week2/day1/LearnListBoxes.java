package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnListBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement down1 = driver.findElementById("dropdown1");
		Select a1= new Select(down1);
		a1.selectByIndex(1);
		WebElement down2 = driver.findElementByName("dropdown2");
		Select a2 = new Select(down2);
		a2.selectByVisibleText("Selenium");
		WebElement down3 = driver.findElementById("dropdown3");
		Select a3= new Select(down3);
		a3.selectByValue("1");

	}

}
