package Sponsor;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import Browsers.Browser;

public class BL_TC_14 extends Browser{

	public static void verifyCompanyGrowth() throws Exception {
		System.out.println("***************************BL_TC_14****************************************");

		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		Thread.sleep(6000);
//		//Click Resident Companies
//		driver.findElement(SponsorLocators.ResidentCompanies).click();
//
//		Thread.sleep(1000);
//		// click on Nirvana Theraputics 
//		driver.findElement(SponsorLocators.NirvanaTheraputicsLearnMore).click();

//		Thread.sleep(4000);
		//click on Company Growth
		driver.findElement(SponsorLocators.CompanyGrowth).click();
        Thread.sleep(3000);
		//Nirvana Theraputics Text
		List<WebElement> list1=	driver.findElements(SponsorLocators.NirvanaTheraputicsText);
		for(WebElement ss :list1)
		{
			System.out.println(ss.getText());

		}
        System.out.println();
		//Nirvana Theraputics Graph
		WebElement graph1=	driver.findElement(SponsorLocators.NirvanaTheraputicsGraph);
		if (graph1.isEnabled()) {
			System.out.println("Nirvana Theraputics Graph is Visible");
		}
         System.out.println();
		//Financials Text
		List<WebElement> list2=	driver.findElements(SponsorLocators.FinancialsText);
		for(WebElement ss :list2)
		{
			System.out.println(ss.getText());

		}
           System.out.println();
		//Financials Graph
		WebElement graph2=	driver.findElement(SponsorLocators.FinancialsGraph);
		if (graph2.isEnabled()) {
			System.out.println("Financials Graph is Visible");
		}
		System.out.println();
		
		//Timeline Text
		List<WebElement> list3=	driver.findElements(SponsorLocators.TimelineText);
		for(WebElement ss :list3)
		{
			System.out.println(ss.getText());

		}
         System.out.println();
		//Timeline Graph
		WebElement graph3=	driver.findElement(SponsorLocators.TimelineGraph);
		if (graph3.isEnabled()) {
			System.out.println("Timeline Graph is Visible");
		}


	}

}
