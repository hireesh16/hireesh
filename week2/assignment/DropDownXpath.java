package week2.assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement down1 = driver.findElementByXPath("//select[@id='dropdown1']");
		Select a1= new Select(down1);
		a1.selectByIndex(1);
		WebElement down2 = driver.findElementByXPath("//select[@name='dropdown2']");
		Select a2 = new Select(down2);
		a2.selectByVisibleText("Selenium");
		WebElement down3 = driver.findElementByXPath("//select[@id='dropdown3']");
		Select a3= new Select(down3);
		a3.selectByValue("1");
		WebElement down4 = driver.findElementByXPath("//select[@class='dropdown']");
		Select a4= new Select(down4);
		int var1 =a4.getOptions().size();
		System.out.println(var1);
		driver.findElementByXPath("//option[text()='You can also use sendKeys to select']/..").sendKeys("Selenium");
		WebElement down5 = driver.findElementByXPath("(//select)[6]");
		Select a5= new Select(down5);
		a5.selectByValue("1");
		
		
		
		
	}	
	}

