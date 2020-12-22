package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		WebElement source = driver.findElementByName("dataSourceId");
		Select a1= new Select(source);
		int size2 = a1.getOptions().size();
		a1.selectByIndex(size2-2);
		System.out.println(a1.getFirstSelectedOption().getText());
		
		

}
}
