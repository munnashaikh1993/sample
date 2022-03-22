package LogoutAndClose;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Browsers.Browser;

public class Logout extends Browser{
   public static void logoutApplication() throws Exception 
   {    
	   Thread.sleep(5000);
	   //click on logout button
	  WebElement logoutbutton= driver.findElement(LogoutLocatores.logoutButton);
	  Actions act=new Actions(driver);
	  act.moveToElement(logoutbutton).perform();
	  act.click(logoutbutton).perform();
   }
   
   public static void Close() throws Exception 
   {    
	   Thread.sleep(3000);
	   //Close browser
	   driver.close();
   }
}
