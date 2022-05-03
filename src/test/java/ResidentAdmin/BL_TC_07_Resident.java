package ResidentAdmin;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;




import Browsers.Browser;





public class BL_TC_07_Resident extends Browser{

	public static void company_profile() throws InterruptedException {

		System.out.println("***************************BL_TC_07_Resident_Admin****************************************");
		Thread.sleep(5000);

		//click on my company
		driver.findElement(By.xpath("//a[text()='My Company']")).click();

		Thread.sleep(5000);

		//read only data
		java.util.List<WebElement> companyprofile1=driver.findElements(By.xpath("//div[@class='status']"));
		for(WebElement A:companyprofile1) {
	    System.out.println(A.getText());
			
		}

			//read only data
			java.util.List<WebElement> companyprofile2= driver.findElements(By.xpath("//div[@class='border-secondar text-dark text']"));
			for(WebElement B:companyprofile2) {
		    System.out.println(B.getText());
				
			}
	
			//read only data
			java.util.List<WebElement> companyprofile3= driver.findElements(By.xpath("//div[@class='col-md-3 col-sm-6 border']"));
			for(WebElement C:companyprofile3) {
		    System.out.println(C.getText());
				
			}
		
	}

}