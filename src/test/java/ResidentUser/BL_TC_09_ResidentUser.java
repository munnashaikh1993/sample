package ResidentUser;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Browsers.Browser;

public class BL_TC_09_ResidentUser extends Browser
{

public static void change() throws Exception {
	System.out.println("***************************BL_TC_09_Resident_User****************************************");
		
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
        Thread.sleep(2000);
//		//MyCompany
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//a[text()='My Company']")).click();
//		Thread.sleep(2000);



		//Change Request
		driver.findElement(By.xpath("(//a[@routerlinkactive='active'])[4]")).click();
		Thread.sleep(2000);

		
		List<WebElement> dd=driver.findElements(By.xpath("//table[@class='table table-striped table-bordered table-sm row-border hover']"));
		
		for(WebElement s:dd)
		{
			System.out.println(s.getText()+"  ");
		}

		
		



		
	
	}
}
