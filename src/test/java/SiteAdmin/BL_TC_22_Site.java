package SiteAdmin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browsers.Browser;

public class BL_TC_22_Site extends Browser
{
	public static void name() throws Exception 
	{
		System.out.println("***************************BL_TC_22_Site****************************************");
        driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		Thread.sleep(4000);
		
		//Companies
		driver.findElement(By.xpath("//a[text()='Companies']")).click();
		Thread.sleep(2000);

		//Company Card View icon
		driver.findElement(SiteAdminLocatores.Company_Card_View).click();
		Thread.sleep(4000);

		//LEARN MORE
		driver.findElement(By.xpath("//h5[text()='Cashew Owner']/../..//button[text()=' LEARN MORE ']")).click();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		//Company_Growth
		driver.findElement(SiteAdminLocatores.Company_Growth).click();
		Thread.sleep(2000);
		
	        List<WebElement> div1=driver.findElements(By.xpath("(//div[@class='col-md-6 col-sm-6'])[1]"));
	        for(WebElement d1:div1)
	             {
	        	      System.out.println(d1.getText());
	             }
	        System.out.println();
//	        List<WebElement> div2=driver.findElements(By.xpath("(//div[@class='col-md-6 col-sm-6'])[2]"));
//	        for(WebElement d2:div2)
//	             {
//	        	      System.out.println(d2.getText());
//	             }
	        System.out.println();
	        List<WebElement> div3=driver.findElements(By.xpath("(//div[@class='col-md-6 col-sm-6'])[3]"));
	        for(WebElement d3:div3)
	             {
	        	      System.out.println(d3.getText());
	             }
	        System.out.println();
//	        List<WebElement> div4=driver.findElements(By.xpath("(//div[@class='col-md-6 col-sm-6'])[4]"));
//	        for(WebElement d4:div4)
//	             {
//	        	      System.out.println(d4.getText());
//	             }
	        System.out.println();
	        List<WebElement> div5=driver.findElements(By.xpath("(//div[@class='col-md-6 col-sm-6'])[5]"));
	        for(WebElement d5:div5)
	             {
	        	      System.out.println(d5.getText());
	             }
	        System.out.println();
//	        List<WebElement> div6=driver.findElements(By.xpath("(//div[@class='col-md-6 col-sm-6'])[6]"));
//	        for(WebElement d6:div6)
//	             {
//	        	      System.out.println(d6.getText());
//	             }
	
	}
}
