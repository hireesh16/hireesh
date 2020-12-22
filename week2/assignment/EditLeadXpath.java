package week2.assignment;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadXpath {

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
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Gopi");
		Thread.sleep(2000);
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		String b= driver.getTitle();
		System.out.println(b);
		String a= "View Lead | opentaps CRM";
		if(b.equals(a))
		{
			System.out.println("Title is Correct");
		}else
		{
			System.out.println("Title is not Matched");
		}
		driver.findElementByXPath("//a[contains(@href,'updateLeadForm?partyId')]").click();////a[@class='subMenuButton'][3]
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("hireesh");
		driver.findElementByXPath("(//input[@name='submitButton'])[1]").click();
		System.out.println(driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText());
		String c = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		if(c.contains("hireesh"))
			System.out.println("True");
		else
			System.out.println("False");
		driver.close();
		
			}


}
