package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("infotech");
		driver.findElementById("createLeadForm_firstName").sendKeys("Velkur");
		driver.findElementById("createLeadForm_lastName").sendKeys("Hireesh");
		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select ab = new Select(ownership);
		ab.selectByVisibleText("Partnership");
		WebElement marketing = driver.findElementById("createLeadForm_marketingCampaignId");
		Select ac= new Select(marketing);
		//ac.selectByIndex(1);
		int size = ac.getOptions().size();
		System.out.println(size);	
		ac.selectByIndex(size-1);
		System.out.println(ac.getFirstSelectedOption().getText());
		
	}

}
