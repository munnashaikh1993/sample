package ResidentAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import Browsers.Browser;

public class BL_TC_04_Resident extends Browser {

public static void sitecompanies() throws InterruptedException {
	System.out.println("***************************BL_TC_04_Resident_Admin****************************************");
		//site companies
		Thread.sleep(4000);
		 driver.findElement(By.xpath("	//a[text()= 'Site Companies']")).click();
		Thread.sleep(4000);
	
		java.util.List<WebElement> sitecompanies= driver.findElements(By.xpath("//div[@class='row row-cols-1 row-cols-xl-5 row-cols-lg-4 row-cols-md-3 row-cols-sm-2 mt-3']"));
		for(WebElement AC:sitecompanies) {
		System.out.println(AC.getText());
		}
	}
}
