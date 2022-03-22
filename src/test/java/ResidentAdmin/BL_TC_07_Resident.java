package ResidentAdmin;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;




import Browsers.Browser;





public class BL_TC_07_Resident extends Browser{

public static void dd() throws Exception {
	driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//a[text()='My Company']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Onboarding Information']")).click();
	Thread.sleep(2000);
	
	WebElement ss= driver.findElement(By.xpath("//a[@id='additional-accordion']"));
	Actions act=new Actions(driver);
	act.moveToElement(ss).perform();
	act.click(ss).build().perform();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//strong[text()='Leadership/Management Team']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//strong[text()='Leadership/Management Team']/../../../..//strong[text()='ADD']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//strong[text()=' Team Member   '])[2]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//strong[text()='Leadership/Management Team']/../../../..//input[@formcontrolname=\"name\" and @type=\"text\"])[2]")).sendKeys("salman");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//strong[text()='Leadership/Management Team']/../../../..//input[@formcontrolname=\"title\"])[2]")).click();
	Thread.sleep(2000);
	
}



}