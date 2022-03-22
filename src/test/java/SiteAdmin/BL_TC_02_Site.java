package SiteAdmin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Browsers.Browser;

public class BL_TC_02_Site extends Browser{
	public static void filterCompanys() throws Exception 
	{
		System.out.println("***************************BL_TC_02****************************************");
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		Thread.sleep(3000);

		//Company Onboarding
		WebElement Company_Onboarding1_dropdown=driver.findElement(SiteAdminLocatores.Company_Onboarding);
		Actions act=new Actions(driver);

		act.click(Company_Onboarding1_dropdown).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		//Company Visibility
		WebElement Company_Visibility_dropdown=driver.findElement(SiteAdminLocatores.Company_Visibility);

		act.click(Company_Visibility_dropdown).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);


		driver.findElement(SiteAdminLocatores.Company_Card_View).click();

		List<WebElement> ss=  driver.findElements(By.xpath("//div[@class='row row-cols-1 row-cols-xl-4 row-cols-lg-4 row-cols-md-3 row-cols-sm-2']"));

		for(WebElement d:ss)
		{
			System.out.println(d.getText());
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@title='Log Out']")).click();
	}
}
