package Sponsor;

import org.openqa.selenium.By;
import Browsers.Browser;

public class BL_TC_08 extends Browser {

	public static void resident_companies() throws InterruptedException {
		System.out.println("***************************BL_TC_08****************************************");

		    //resident companies
		     driver.findElement(By.xpath("//a[text()='Resident Companies']")).click();
             Thread.sleep(3000);
             
             
             //location
             driver.findElement(By.xpath("(//button[text()=' Select options '])[1]")).click();//open location
             driver.findElement(By.xpath("//label[text()=' Servier Incubator ']")).click();
             Thread.sleep(2000);
             driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();//close location
             Thread.sleep(2000);
             
       
	}
}
