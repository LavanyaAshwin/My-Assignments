package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		driver.findElement(By.xpath(" //div[@aria-label='bags for boys']")).click();
		String text = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[5]")).click();	
		driver.findElement(By.xpath("//span[text()='Featured']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		Thread.sleep(2000);
		String text2 = driver.findElement(By.xpath("//span[text()='Omega 30L Laptop Backpack with Raincover, school ']")).getText();
		System.out.println(text2);
		String text3 = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println(text3);
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
	}

}
