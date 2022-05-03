package ResidentUser;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browsers.Browser;

public class BL_TC_08_ResidentUser extends Browser
{
public static void invoice() throws InterruptedException {
		
	System.out.println("***************************BL_TC_08_Resident_User****************************************");
		//MyCompany
	    driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		Thread.sleep(4000);
		 driver.findElement( By.xpath("//a[text() = 'My Company']")).click();
		 driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		Thread.sleep(4000);
		
		//invoicing
		driver.findElement(By.xpath("//a[text()='Invoicing']")).click();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		Thread.sleep(4000);

		//read only data
		List<WebElement> invoicing=driver.findElements(By.xpath("//table[contains(@id,'DataTables')]"));
		for(WebElement A:invoicing) {
		System.out.println(A.getText());
		}
}

}
