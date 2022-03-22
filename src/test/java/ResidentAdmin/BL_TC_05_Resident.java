package ResidentAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



import Browsers.Browser;


public class BL_TC_05_Resident extends Browser {

	public static void LearnMore() throws InterruptedException {
		System.out.println("***************************BL_TC_05****************************************");



		// Directory
		//driver.findElement(By.xpath("//a[text()= 'Directory']")).click();
		Thread.sleep(4000);

		//site companies
		driver.findElement(locators.sitecompanies).click();
		Thread.sleep(4000);


		//learn more
		driver.findElement(By.xpath("(//button[text() = ' LEARN MORE '])[1]")).click();
		Thread.sleep(4000);


		java.util.List<WebElement> left=driver.findElements(By.xpath("//div[@class='col-md-3 col-sm-6 border']"));
		for(WebElement D:left) {
			System.out.println(D.getText());
		}

		java.util.List<WebElement> UP=driver.findElements(By.xpath("//div[@class='status']"));

		for(WebElement D1:UP)
		{
			System.out.println(D1.getText());
		}

		java.util.List<WebElement> Right= driver.findElements(By.xpath("//div[@class='border-secondar text-dark text']"));
		for(WebElement D2:Right) {
			System.out.println(D2.getText());


		}

	}
}


