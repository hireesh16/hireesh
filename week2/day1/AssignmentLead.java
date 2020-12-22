package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("infotech1");
		driver.findElementById("createLeadForm_firstName").sendKeys("Velkur1");
		driver.findElementById("createLeadForm_lastName").sendKeys("Hireesh1");
		WebElement source = driver.findElementByName("dataSourceId");
		Select a1= new Select(source);
		a1.selectByVisibleText("Employee");		
		WebElement Market = driver.findElementByName("marketingCampaignId");
		Select a2= new Select(Market);
		a2.selectByValue("9001");
		WebElement Owner = driver.findElementById("createLeadForm_ownershipEnumId");
		Select a3= new Select(Owner);
		a3.selectByIndex(5);
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select a4= new Select(country);
		a4.selectByVisibleText("India");
		driver.findElementByName("submitButton").click();
		System.out.println(driver.getTitle());

		
	}

}
