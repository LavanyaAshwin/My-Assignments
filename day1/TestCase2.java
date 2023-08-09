package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCase2 {
	
	public static void main(String[] args) throws InterruptedException {
		
//		ChromeDriver driver =new ChromeDriver();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");		
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get(" https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
//		Thread.sleep(3000);
        WebElement opp = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", opp);
	    driver.findElement(By.xpath("//div[text()='New']")).click();
//	    driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).sendKeys("Lavanya");
//	    String text = driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).getText();
//		System.out.println(text);
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("10/8/2023");
//		driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']")).click();
//		driver.findElement(By.xpath("(//span[text()='Needs Analysis'])[5]")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		driver.findElement(By.xpath("//a[text()='Opportunity Name']")).click();
		driver.findElement(By.xpath("//a[text()='Stage']")).click();
		
}
}