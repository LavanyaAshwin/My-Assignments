package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Thread.sleep(3000);
		driver.findElement(By.id("pills-home-tab")).click();
		driver.findElement(By.id("source")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.id("destination")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.id("datepicker1")).click();
		driver.findElement(By.xpath("//a[text()='7']")).click();
        driver.findElement(By.xpath("//a[text()='Search']")).click();
        String text = driver.findElement(By.xpath("//h2[@class='TravelAgntNm ng-binding']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//input[contains(@class,'chkbox ng-pristine')])[4]")).click();
		String text2 = driver.findElement(By.xpath("//p[text()='24 Seats Available']")).getText();
		System.out.println(text2);
		driver.findElement(By.xpath("//span[text()='Select Seat']")).click();
		driver.findElement(By.xpath("//a[@class='tooltip tooltipstered']")).click();
		String text3 = driver.findElement(By.xpath("//span[@id='seatnos']")).getText();
		System.out.println(text3  + " seat is selected ");
		Thread.sleep(2000);
		String text4 = driver.findElement(By.xpath("//span[@id='ticketfare']")).getText();
		System.out.println(text4 + " Total fare");

		WebElement boardingpoint = driver.findElement(By.id("boardingpoint_id"));
		Select bp =new Select(boardingpoint);
		bp.selectByIndex(4);
		
		WebElement droppingpoint = driver.findElement(By.id("droppingpoint_id"));
		Thread.sleep(2000);
		Select dp = new Select(droppingpoint);
		dp.selectByIndex(4);
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
		
		
		
		
		
		
		
//		driver.findElement(By.id("source")).sendKeys("Chennai");
////		driver.findElement(By.xpath("//li[@class='ui-menu-item ui-state-focus'])"));
//		driver.findElement(By.xpath("(//li[@class='ui-menu-item'])[1]")).click();
//		
////		driver.findElement(By.xpath("//li[@class='ui-menu-item ui-state-focus'])"));
//		driver.findElement(By.xpath("(//li[@class='ui-menu-item'])[1]")).click();
//		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[1]")).click();
//		driver.findElement(By.xpath("(//a[contains(@class,'btn btn-main')])")).click();
//	    driver.findElement(By.xpath("//input[contains(@class,'chkbox ng-valid')]"));
//		driver.findElement(By.xpath("//span[@class='book']")).click();
//		driver.findElement(By.xpath("(//a[contains(@class,'tooltip tooltipstered')])[1]"));
//		
		
		
		//driver.findElement(null)
		
//		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}//li[@class='ui-menu-item ui-state-focus']
