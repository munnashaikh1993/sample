package Sponsor;

import java.awt.Robot;

import java.util.List;



import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Browsers.Browser;

public class BL_TC_06 extends Browser{
	public static Actions act;
	public static Robot robot;


	public static void findAvalablesite() throws Exception
	{
		System.out.println("***************************BL_TC_06A****************************************");


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
			
			
		System.out.println(driver.getTitle());


		
			
		

			for(WebElement d1:demo1) {
				String s1= d1.getText();
				System.out.println(s1);

				driver.findElement(By.xpath("(//button[@class='btn btn-font card-btn siteMapBox ng-star-inserted'])["+j+"]")).click();

				WebElement msg=driver.findElement(SponsorLocators.poppupmsg);
				System.out.println("Salman Munnna shaikh :----"+msg.isEnabled());
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

	
	public static void recentjoin() throws Exception {
		System.out.println("***************************BL_TC_06B****************************************");

		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='carousel-control-prev controlArrow']//span[@class='carousel-control-prev-icon'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='carousel-control-next controlArrow']//span[@class='carousel-control-next-icon'])[2]")).click();


		for (int i = 2; i <= 63; ) {
			
			Thread.sleep(2000);
			List<WebElement> element1= driver.findElements(By.xpath("(//div[@class='card'])["+i+"]"));

			for(WebElement demo1:element1)
			{
				System.out.println(demo1.getText());
				driver.findElement(By.xpath("(//Button[@class='btn siteMapBox ng-star-inserted'])["+(i-1)+"]")).click();

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
                      
					System.out.println(driver.getTitle());
				}
				
				
			}
			System.out.println();
			System.out.println();
			
			
			List<WebElement> element2= driver.findElements(By.xpath("(//div[@class='card'])["+(i+1)+"]"));
			
			for(WebElement demo2:element2)
			{
				System.out.println(demo2.getText());
				driver.findElement(By.xpath("(//Button[@class='btn siteMapBox ng-star-inserted'])["+i+"]")).click();

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
                      
					System.out.println(driver.getTitle());
				}
				
				
			}
			System.out.println();
			System.out.println();
			
			
			List<WebElement> element3= driver.findElements(By.xpath("(//div[@class='card'])["+(i+2)+"]"));
			
			for(WebElement demo2:element3)
			{
				System.out.println(demo2.getText());
				
				driver.findElement(By.xpath("(//Button[@class='btn siteMapBox ng-star-inserted'])["+(i+1)+"]")).click();

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
                      
					System.out.println(driver.getTitle());
				}
				
				
			}
			System.out.println();
			System.out.println();
			
			
			List<WebElement> element4= driver.findElements(By.xpath("(//div[@class='card'])["+(i+3)+"]"));

			for(WebElement demo4:element4)
			{
				System.out.println(demo4.getText());
				driver.findElement(By.xpath("(//Button[@class='btn siteMapBox ng-star-inserted'])["+(i+2)+"]")).click();

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
                      
					System.out.println(driver.getTitle());
				}
				
				
			}
			System.out.println();
			System.out.println();

			
			i=i+4;
			driver.findElement(By.xpath("(//a[@class='carousel-control-next controlArrow']//span[@class='carousel-control-next-icon'])[2]")).click();

		}
		
	}
}
