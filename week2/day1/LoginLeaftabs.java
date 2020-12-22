package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginLeaftabs {

	public static void main(String[] args) {
		// pre condition
		WebDriverManager.chromedriver().setup();
		// open
		
	ChromeDriver driver = new ChromeDriver();
	//maximize methods
	driver.manage().window().maximize();
	
	// load application
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	// to close
	//driver.close();

	}

}
