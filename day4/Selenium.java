package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Selenium {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://login.salesforce.com/");
		driver.manage().window().maximize();        
        driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
        driver.findElement(By.id("password")).sendKeys("Leaf@1234");
        driver.findElement(By.name("login")).click();
        String title= driver.getTitle();
        System.out.println(title);
        //driver.close();
        
	}
}
