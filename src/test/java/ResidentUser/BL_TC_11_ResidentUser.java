package ResidentUser;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Browsers.Browser;

public class BL_TC_11_ResidentUser extends Browser
{


	public static void companydata() throws InterruptedException {

		System.out.println("***************************BL_TC_11_Resident_User****************************************");
		//click on Mycompany button
         driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text() = 'My Company']")).click();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		List<WebElement> ee=driver.findElements(By.xpath("//div[@class='col-md-3 col-sm-6 border']"));
		
		for(WebElement e:ee)
		   {
			System.out.println(e.getText());
		   }
		
		System.out.println();
		
		List<WebElement> ss=driver.findElements(By.xpath("//div[@class='status']"));
		for(WebElement s:ss)
		   {
			System.out.println(s.getText());
		   }
		System.out.println();
		
		List<WebElement> ff=driver.findElements(By.xpath("//div[@class='border-secondar text-dark text']"));
		    
		for(WebElement f:ff)
		   {
			System.out.println(f.getText());
		   }

		




	}
}
