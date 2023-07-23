package week1.day4;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssign {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
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
		driver.findElement(By.name("submitButton")).click();
		driver.close();
		
	}

}
