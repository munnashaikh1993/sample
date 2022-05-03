package ResidentUser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Browsers.Browser;

public class BL_TC_06_ResidentUser extends Browser
{
	public static void SponsorProfile() throws Exception {

		System.out.println("***************************BL_TC_06_Resident_User****************************************");
		//click on directory
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Directory']	")).click();
		Thread.sleep(4000);



		//click on Site Sponsor button
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Site Sponsors']")).click();
		Thread.sleep(4000);


		//click on learn more button		
		driver.findElement(By.xpath("(//button[text()=' LEARN MORE '])[2]")).click();
		Thread.sleep(4000);

//		
//		boolean isEnbled = driver.findElement(By.xpath("//a[text()='Connect']")).isEnabled();
//		boolean isDisplayed = driver.findElement(By.xpath("//a[text()='Connect']")).isDisplayed();
//		
//		
//		if (isEnbled) {
//			System.out.println("Btn is Enabled");
//		}else {
//				System.out.println("Btn is not Enabled");
//		}
//		
//		if (isDisplayed) {
//			System.out.println("Btn is Displayed");
//		}else {
//				System.out.println("Btn is not Displayed");
//		}

		//click on connect button		
		driver.findElement(By.xpath("//a[text()='Connect']")).click();
		Thread.sleep(4000);

		WebElement popup=driver.findElement(By.id("message"));
		Actions act=new Actions(driver);
		act.moveToElement(popup).perform();
		act.click(popup).perform();
		act.sendKeys(Keys.INSERT).perform();
		act.sendKeys("sitesponsor").perform(); 


		//click on learn more button		
		driver.findElement(By.xpath("//button[text()='Connect Now']")).click();
		Thread.sleep(4000);

		//click on learn more button		
		driver.findElement(By.xpath("//a[text()='CLOSE']")).click();
		Thread.sleep(4000);

	}
}
