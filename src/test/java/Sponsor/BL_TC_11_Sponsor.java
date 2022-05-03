package Sponsor;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Browsers.Browser;

public class BL_TC_11_Sponsor extends Browser {

	public static void search () throws InterruptedException {
		System.out.println("***************************BL_TC_11_Sponsor****************************************");
        Thread.sleep(1000);
		//search (leftside)
		driver.findElement(locators.search).click();
		driver.findElement(locators.search).clear();
		driver.findElement(locators.search).sendKeys("tufts");
		Thread.sleep(2000);
		
		//click on search button
	     driver.findElement(locators.search_button).click();
	     Thread.sleep(2000);

		//select an industry
		driver.findElement(locators.industry).click();
		Thread.sleep(2000);
		
		//select diagonistics/biomakers
		driver.findElement(locators.biomakers).click();
		Thread.sleep(2000);
	
		//select a Modality(Antibody)
		driver.findElement(locators.Antibody).click();
		Thread.sleep(2000);
	
		//select a Modality(Drug Delivery)
		driver.findElement(locators.Drug).click();
		Thread.sleep(2000);
		
		//select a Modality(gene therapy)
		driver.findElement(locators.Gene).click();
		Thread.sleep(4000);
		//button[text()='Clear' and @class='btn btn-font biolabBtn']
	WebElement clearButton=	driver.findElement(By.xpath("//button[@class='btn btn-font biolabBtn']"));
	Actions act=new Actions(driver);
	act.moveToElement(clearButton).perform();
	act.click(clearButton).perform();
	
	Thread.sleep(2000);
	
	}
	


}
