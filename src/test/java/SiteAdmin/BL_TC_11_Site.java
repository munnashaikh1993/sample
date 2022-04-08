package SiteAdmin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;

import Browsers.Browser;

public class BL_TC_11_Site extends Browser
{
	public static void Site_accesible() throws Exception 
	{
		System.out.println("***************************BL_TC_11_Site****************************************");
		driver.manage().timeouts().implicitlyWait(15000,TimeUnit.SECONDS);
		Thread.sleep(2000);

//		//click on site dropdown
		WebElement sitedropdown= driver.findElement(SiteAdminLocatores.Site_drop);
		Actions act=new Actions(driver);
		Select select = new Select(sitedropdown);
		WebElement ss = select.getFirstSelectedOption();
		System.out.println("Selected element: " + ss.getText());
		String s= ss.getCssValue("font-weight");
		//String c = Color.fromString(s).asHex();
		System.out.println("Fint weigth is "+s);
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		
		WebElement sitedropdown1= driver.findElement(SiteAdminLocatores.Site_drop);
		act.click(sitedropdown1).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		try {
			driver.navigate().refresh();
			WebElement sitedropdown11= driver.findElement(SiteAdminLocatores.Site_drop);
			Select select1 = new Select(sitedropdown11);
			WebElement sss = select1.getFirstSelectedOption();
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			Thread.sleep(2000);
			System.out.println("Selected element: " + sss.getText());
			String s1= sss.getCssValue("font-weight");
			System.out.println("font weigth is "+s1);
			
			select1.selectByVisibleText("Tufts");
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			
			driver.navigate().refresh();
			WebElement sitedropdown111= driver.findElement(SiteAdminLocatores.Site_drop);
			Select select11 = new Select(sitedropdown111);
			WebElement ssss = select11.getFirstSelectedOption();
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			Thread.sleep(2000);
			System.out.println("Selected element: " + ssss.getText());
			String s11= ssss.getCssValue("font-weight");
			System.out.println("font weigth is "+s11);
		} 
		catch (Exception e) {
			driver.navigate().refresh();
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			Thread.sleep(2000);
			WebElement sss = select.getFirstSelectedOption();
			System.out.println("Selected element: " + sss.getText());
			String s1= sss.getCssValue("font-weight");
			
			System.out.println(s1);
		}
		
		
		
		
	}
}
