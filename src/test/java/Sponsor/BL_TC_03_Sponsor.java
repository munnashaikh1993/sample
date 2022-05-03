package Sponsor;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browsers.Browser;

public class BL_TC_03_Sponsor extends Browser
{
	public static void findAvalablesite() throws Exception
	{
		System.out.println("***************************BL_TC_03_Sponsor****************************************");
         driver.manage().timeouts().implicitlyWait(15000,TimeUnit.SECONDS);
         Thread.sleep(3000);
         
		driver.findElement(By.xpath("(//a[@class='carousel-control-prev controlArrow']//span[@class='carousel-control-prev-icon'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='carousel-control-next controlArrow']//span[@class='carousel-control-next-icon'])[1]")).click();

		for(int j=1 ;j<=14 ;) {
			Thread.sleep(5000);
			List<WebElement> demo1=driver.findElements(By.xpath("(//div[contains(@class,'row pb')])["+j+"]"));
			Thread.sleep(3000);
			List<WebElement> demo2=driver.findElements(By.xpath("(//div[contains(@class,'row pb')])["+(j+1)+"]"));


			System.out.println(driver.getTitle());






			for(WebElement d1:demo1) {
				String s1= d1.getText();
				System.out.println(s1);

				driver.findElement(By.xpath("(//button[@class='btn btn-font card-btn siteMapBox ng-star-inserted'])["+j+"]")).click();

				WebElement msg=driver.findElement(SponsorLocators.poppupmsg);
				Thread.sleep(2000);
				if (msg.isEnabled()) 
				{
					System.out.println();
					System.out.println(msg.getText());

					//WebElement crossbutton=
					driver.findElement(By.xpath("//button[@aria-label='Close']")).click();

				}
				else 
				{
					System.out.println("This site accesible");
					System.out.println(driver.getTitle());
					break;
				}

				//System.out.println(d1.getText());
			}
			Thread.sleep(2000);
			System.out.println();
			System.out.println();

			for(WebElement d2:demo2) {
				System.out.println(d2.getText());

				driver.findElement(By.xpath("(//button[@class='btn btn-font card-btn siteMapBox ng-star-inserted'])["+(j+1)+"]")).click();

				WebElement msg=driver.findElement(SponsorLocators.poppupmsg);
				Thread.sleep(2000);
				System.out.println("salman Munna Shaikh :---"+msg.isEnabled());
				if (msg.isEnabled()) 
				{
					System.out.println();
					System.out.println(msg.getText());

					//WebElement crossbutton=
					driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
				}
				else 
				{
					System.out.println("This Site accesible");
					System.out.println("salman shaikh :---"+msg.isEnabled());

					System.out.println(driver.getTitle());
					break;
				}


				System.out.println();
				System.out.println();
				driver.findElement(By.xpath("(//a[@class='carousel-control-next controlArrow']//span[@class='carousel-control-next-icon'])[1]")).click();
				j=j+2;

			}

			//driver.findElement(By.xpath("(//a[@class='carousel-control-next controlArrow']//span[@class='carousel-control-next-icon'])[1]")).click();



		}
	}
}
