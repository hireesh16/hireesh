package week2.assignment;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxesXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.findElementByXPath("((//div[@class='example'])[1]//input)[1]").click();
		boolean sel = driver.findElementByXPath("(//div[@class='example'])[2]//input").isSelected();
		if(sel=true)
		{
			System.out.println("Selenium is selected");
		}else
		{
			System.out.println("not Selected");
		}

		driver.findElementByXPath("((//div[@class='example'])[3]//input)[2]").click();
		driver.findElementByXPath("((//div[@class='example'])[4]//input)[1]").click();
		driver.findElementByXPath("((//div[@class='example'])[4]//input)[2]").click();
		driver.findElementByXPath("((//div[@class='example'])[4]//input)[3]").click();
		driver.findElementByXPath("((//div[@class='example'])[4]//input)[4]").click();
		driver.findElementByXPath("((//div[@class='example'])[4]//input)[5]").click();
	}

}
