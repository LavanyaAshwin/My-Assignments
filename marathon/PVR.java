package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVR {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		
		System.out.println("hii");
		
		Thread.sleep(2000);
        WebElement place = driver.findElement(By.name("city"));
		Select pic = new Select(place);
		pic.selectByValue("Chennai");
		
		WebElement type = driver.findElement(By.name("genre"));
		Select com = new Select(type);
		com.selectByVisibleText("ANIMATION");
		
		WebElement language = driver.findElement(By.name("lang"));
		Select mov =new Select(language);
		mov.selectByVisibleText("ENGLISH");
		
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		
		WebElement cinema = driver.findElement(By.name("cinemaName"));
		Select cnm = new Select(cinema);
		cnm.selectByVisibleText("PVR Heritage RSL ECR Chennai");
		
		driver.findElement(By.xpath("(//div[@class='form-group col-sm-6 input-list'])[4]")).click();
		driver.findElement(By.xpath("//span[@class='day-unit ng-star-inserted']")).click();
		
		WebElement showtime = driver.findElement(By.name("timings"));
		Select time = new Select (showtime);
		time.selectByVisibleText("09:00 AM - 12:00 PM");
		
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("2");
		driver.findElement(By.xpath("(//input[contains(@class,'input-text form-control')])[4]")).sendKeys("Lavanya");
		driver.findElement(By.xpath("(//input[contains(@class,'input-text form-control')])[5]")).sendKeys("lavvenkat@yahoo.in");
		driver.findElement(By.xpath("(//input[contains(@class,'input-text form-control')])[6]")).sendKeys("9677854853");
		
	    driver.findElement(By.name("food"));
	    driver.findElement(By.xpath("//option[text()='Yes']")).click();
	    driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
		driver.findElement(By.xpath("(//input[contains(@class,'input-text form-control')])[7]")).sendKeys("null");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		driver.findElement(By.xpath("//button[@class='swal2-close']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn already-member'])[4]")).click();
		
	}
}
