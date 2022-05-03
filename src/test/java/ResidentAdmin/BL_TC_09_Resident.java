package ResidentAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browsers.Browser;


public class BL_TC_09_Resident extends Browser{

public static void invoice() throws InterruptedException {
		
	System.out.println("***************************BL_TC_09_Resident_Admin****************************************");
		//MyCompany
		Thread.sleep(4000);
		 driver.findElement( By.xpath("//a[text() = 'My Company']")).click();
		Thread.sleep(4000);
		
		//invoicing
		driver.findElement(By.xpath("(//a[@routerlinkactive='active'])[4]")).click();
		Thread.sleep(4000);

		//read only data
		java.util.List<WebElement> invoicing=driver.findElements(By.xpath("//table[@class=\"table table-striped table-bordered table-sm row-border hover text-center no-footer dataTable\"]"));
		for(WebElement A:invoicing) {
		System.out.println(A.getText());
		}
		
	}


}
