package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ScienTechnologies");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lavanya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ashwin");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("lavany.ashwin@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9677852852");
		
		
		// Handling Dropdown
		
		WebElement dataSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(dataSource);
		dd.selectByIndex(5);
		
		WebElement marketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mdd = new Select(marketingCampaign);
		mdd.selectByVisibleText("Automobile");
		
		WebElement ownershipEnum = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select odd =new Select(ownershipEnum);
		odd.selectByValue("OWN_SCORP");
		
		WebElement industryEnum = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select idd =new Select(industryEnum);
		idd.selectByIndex(6);
		
		WebElement currencyUom =driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select cdd = new Select(currencyUom);
		cdd.selectByVisibleText("AUD - Australian Dollar");
		
		
		
		
		
	}

}
