package ResidentUser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Browsers.Browser;

public class BL_TC_07_ResidentUser extends Browser
{

public static void Company_Profile() throws InterruptedException {
	System.out.println("***************************BL_TC_07_Resident_User****************************************");
		//click on Mycompany button
	            driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
				Thread.sleep(5000);
				driver.findElement(By.xpath("//a[text() = 'My Company']")).click();
				Thread.sleep(4000);



				//user can scroll down "Rtex"company profile page
				JavascriptExecutor a = (JavascriptExecutor) driver;
				a.executeScript("window.scrollBy(0,500)", "");
				Thread.sleep(3000);



				JavascriptExecutor b = (JavascriptExecutor) driver;
				b.executeScript("window.scrollBy(0,500)", "");
				Thread.sleep(3000);



				JavascriptExecutor c = (JavascriptExecutor) driver;
				c.executeScript("window.scrollBy(0,500)", "");
				Thread.sleep(3000);



				JavascriptExecutor d = (JavascriptExecutor) driver;
				d.executeScript("window.scrollBy(0,500)", "");
				Thread.sleep(2000);



				//user can scroll down "Rtex"company profile page
				JavascriptExecutor e = (JavascriptExecutor) driver;
				e.executeScript("window.scrollBy(0,-500)", "");
				Thread.sleep(3000);



				JavascriptExecutor f = (JavascriptExecutor) driver;
				f.executeScript("window.scrollBy(0,-500)", "");
				Thread.sleep(3000);



				JavascriptExecutor g = (JavascriptExecutor) driver;
				g.executeScript("window.scrollBy(0,-500)", "");
				Thread.sleep(3000);



				JavascriptExecutor h = (JavascriptExecutor) driver;
				h.executeScript("window.scrollBy(0,-500)", "");
				Thread.sleep(2000);

				java.util.List<WebElement> ABCD= driver.findElements(By.xpath("//div[@class='border-secondar text-dark text']"));
				for(WebElement A:ABCD) {
				System.out.println(A.getText());
				
			}

				java.util.List<WebElement> Data= driver.findElements(By.xpath("//div[@class='col-md-3 col-sm-6 border']"));
				for(WebElement B:Data) {
				System.out.println(B.getText());
				
			}
	
				java.util.List<WebElement> UpData= driver.findElements(By.xpath("//div[@class='status']"));
				for(WebElement C:UpData) {
				System.out.println(C.getText());
				
			}
	}
}
