package Sponsor;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



import Browsers.Browser;

public class BL_TC_04 extends Browser{
	public static void recentJoin() throws Exception {
		System.out.println("***************************BL_TC_04****************************************");

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
			}
			System.out.println();
			System.out.println();
			
			
			List<WebElement> element2= driver.findElements(By.xpath("(//div[@class='card'])["+(i+1)+"]"));
			
			for(WebElement demo2:element2)
			{
				System.out.println(demo2.getText());
			}
			System.out.println();
			System.out.println();
			
			
			List<WebElement> element3= driver.findElements(By.xpath("(//div[@class='card'])["+(i+2)+"]"));
			
			for(WebElement demo2:element3)
			{
				System.out.println(demo2.getText());
			}
			System.out.println();
			System.out.println();
			
			
			List<WebElement> element4= driver.findElements(By.xpath("(//div[@class='card'])["+(i+3)+"]"));

			for(WebElement demo4:element4)
			{
				System.out.println(demo4.getText());
			}
			System.out.println();
			System.out.println();

			
			i=i+4;
			driver.findElement(By.xpath("(//a[@class='carousel-control-next controlArrow']//span[@class='carousel-control-next-icon'])[2]")).click();

		}
	}
}
