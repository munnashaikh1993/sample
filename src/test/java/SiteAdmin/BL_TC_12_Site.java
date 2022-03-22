package SiteAdmin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Browsers.Browser;

public class BL_TC_12_Site extends Browser
{
	  public static void Company_Growth() throws Exception 
	  {
		  System.out.println("***************************BL_TC_12****************************************");
		  driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		  Thread.sleep(3000);
		   WebElement Company_Growth_tab= driver.findElement(SiteAdminLocatores.Company_Growth);
		   Actions act=new Actions(driver);
		   act.moveToElement(Company_Growth_tab).perform();
		   act.click(Company_Growth_tab).perform();
		  Thread.sleep(2000);
		  
		List<WebElement> Diagon_Therapeutics = driver.findElements(By.xpath("(//div[@class='row pt-3 pb-3'])[1]"));
		      for(WebElement DT:Diagon_Therapeutics)
		      {
		    	  System.out.println(DT.getText());
		      }
		      Thread.sleep(1000);
		      List<WebElement> Financials = driver.findElements(By.xpath("(//div[@class='row pt-3 pb-3'])[2]"));
		      for(WebElement F:Financials)
		      {
		    	  System.out.println(F.getText());
		      }
		      Thread.sleep(1000);
		      
		      List<WebElement> Timeline = driver.findElements(By.xpath("(//div[@class='row pt-3 pb-3'])[3]"));
		      for(WebElement T:Timeline)
		      {
		    	  System.out.println(T.getText());
		      } 
		  
	  }

}
