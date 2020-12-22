package week2.assignment;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadsXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		driver.findElementByXPath("(//a[@class='x-tab-right'])[3]").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("gopinath@testleaf.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String cap= driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-companyName'])[1]/a").getText();
		System.out.println(cap);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-companyName'])[1]/a").click();
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		System.out.println(driver.findElementByXPath("//div[@id='sectionHeaderTitle_leads']").getText());
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		System.out.println(driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText());
		String gen=driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		if(gen.contains(cap))
			System.out.println("Duplicate lead created");
		else
			System.out.println("Duplicate Lead not Created");
		driver.close();
	}

}
