package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathCreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		/*driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("infotech");
		driver.findElementById("createLeadForm_firstName").sendKeys("Velkur");
		driver.findElementById("createLeadForm_lastName").sendKeys("Hireesh");
		driver.findElementByName("submitButton").click();
		*/
		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("(//a)[2]").click();
		driver.findElementByXPath("//a[contains(@href,'leadsMain')]").click();
		driver.findElementByXPath("//a[contains(@href,'createLeadForm')]").click();
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("infotech2");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Velkur2");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Hireesh2");
		driver.findElementByXPath("//input[@name='submitButton']").click();
	}
	

}


//         (//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]

//			(//img[@alt='Lookup'])[1]
//			(//img[@alt='Lookup'])[2]
			