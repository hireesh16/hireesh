package week2.assignment;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeadXpath {

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
		driver.findElementByXPath("(//a[@class='x-tab-right'])[2]").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String cap= driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").getText();
		System.out.println(cap);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
		driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(cap);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		System.out.println(driver.findElementByXPath("//div[@class='x-paging-info']").getText());
		driver.close();
		
	

	}

}
