package Sponsor;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browsers.Browser;

public class BL_TC_02_Sponsor extends Browser{

	public static void BioLabs_Global_Network() throws Exception 
	{
		System.out.println("***************************BL_TC_02_Sponsor****************************************");

		Thread.sleep(5000);
		List<WebElement> ll=driver.findElements(SponsorLocators.BiolabGlobaldiv);

		for(WebElement s:ll)
		{
			System.out.println(s.getText());
			System.out.println();
		}
	}


	public static void BioLabsBySite() throws Exception
	{
		
//		WebElement ss=driver.findElement(SponsorLocators.BioLabsBySite);
//		
//		Actions act=new Actions(driver);
//		act.moveToElement(ss);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class='carousel-control-prev controlArrow']//span[@class='carousel-control-prev-icon'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='carousel-control-next controlArrow']//span[@class='carousel-control-next-icon'])[1]")).click();
		
		for(int j=1 ;j<=14 ;) {
				Thread.sleep(5000);
				List<WebElement> demo1=driver.findElements(By.xpath("(//div[contains(@class,'row pb')])["+j+"]"));
				Thread.sleep(3000);
				List<WebElement> demo2=driver.findElements(By.xpath("(//div[contains(@class,'row pb')])["+(j+1)+"]"));
				

				for(WebElement d1:demo1) {
					System.out.println(d1.getText());
				}
				
				System.out.println();
				System.out.println();
				for(WebElement d2:demo2) {
					System.out.println(d2.getText());
				}
				
				System.out.println();
				System.out.println();
				driver.findElement(By.xpath("(//a[@class='carousel-control-next controlArrow']//span[@class='carousel-control-next-icon'])[1]")).click();
				j=j+2;
			}
			//driver.findElement(By.xpath("(//a[@class='carousel-control-next controlArrow']//span[@class='carousel-control-next-icon'])[1]")).click();
			
		
		
	}
}
