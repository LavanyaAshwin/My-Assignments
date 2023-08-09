package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
	
 public static void main(String[] args) throws InterruptedException {
	
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.leafground.com/alert.xhtml");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 //simple alert
     driver.findElement(By.xpath("//span[text()='Show']")).click();
	 Thread.sleep(3000);
	 Alert alert = driver.switchTo().alert();
	 System.out.println(alert.getText());
	 alert.accept();
	 
	 //confirmation alert
	 
	 driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
	 System.out.println(alert.getText());
	 alert.accept();
	 
	 //Sweet alert
	 driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
	 
	 //sweet modal alert
     driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
    Thread.sleep(5000);
   
   System.out.println("above last");
   driver.findElement(By.xpath("(//a[contains(@class,'ui-dialog-titlebar-icon')])[2]")).click();
//    Thread.sleep(5000);
//    alert.dismiss();
//	 
         //prompt alert
     driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
     alert.sendKeys("Lavanya");
     alert.accept();
     
     
   //Sweet Alert
     driver.findElement(By.xpath("//span[text()='Delete']")).click();
     Thread.sleep(5000);
     driver.findElement(By.xpath("//span[text()='Yes']")).click();
//     alert.accept();
     
     driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
     Thread.sleep((2000));
     driver.findElement(By.xpath("(//a[contains(@class,'ui-dialog-titlebar-icon')])[3]")).click();
     
     driver.close();
     }
     
     
 
}
