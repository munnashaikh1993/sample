package ResidentUser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browsers.Browser;

public class BL_TC_05_ResidentUser extends Browser
{
	public static void CompanyInformation() throws Exception {
		
		System.out.println("***************************BL_TC_05_Resident_User****************************************");
		//click on learn more button
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[text()=' LEARN MORE '])[1]")).click();
		Thread.sleep(4000);

		java.util.List<WebElement> sitecompanies= driver.findElements(By.xpath("//div[@class='col-md-9 col-sm-6 pl-0 pr-0 pb-0 bg-light']"));
		for(WebElement AC:sitecompanies) {
		System.out.println(AC.getText());
		}

		
}
}
