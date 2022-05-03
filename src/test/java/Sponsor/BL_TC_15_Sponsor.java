package Sponsor;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browsers.Browser;

public class BL_TC_15_Sponsor extends Browser{

	public static void verifyCompanyGrowth() throws Exception {
		System.out.println("***************************BL_TC_15_Sponsor****************************************");

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Thread.sleep(2000);
		//click on Company Growth
		driver.findElement(SponsorLocators.CompanyGrowth).click();
		Thread.sleep(2000);
		
		//Nirvana Theraputics Text
		List<WebElement> list1=	driver.findElements(SponsorLocators.NirvanaTheraputicsText);
		for(WebElement ss :list1)
		{
			System.out.println(ss.getText());

		}
		System.out.println();
		System.out.println();
		//Nirvana Theraputics Graph
		WebElement graph1=	driver.findElement(SponsorLocators.NirvanaTheraputicsGraph);
		if (graph1.isEnabled()) {
			System.out.println("Nirvana Theraputics Graph is Visible");
		}
		System.out.println();
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
		System.out.println();

		
		//Timeline Text
		List<WebElement> list3=	driver.findElements(SponsorLocators.TimelineText);
		for(WebElement ss :list3)
		{
			System.out.println(ss.getText());

		}
		System.out.println();
		System.out.println();
		//Timeline Graph
		WebElement graph3=	driver.findElement(SponsorLocators.TimelineGraph);
		if (graph3.isEnabled()) {
			System.out.println("Timeline Graph is Visible");
		}
		System.out.println();


	}

}
