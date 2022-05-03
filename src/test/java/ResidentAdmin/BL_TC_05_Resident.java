package ResidentAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Browsers.Browser;


public class BL_TC_05_Resident extends Browser {

public static void CompanyInformation() throws Exception {
	System.out.println("***************************BL_TC_05_Resident_Admin****************************************");
		//click on Mycompany button
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text() = 'My Company']")).click();
		Thread.sleep(4000);



		//user can scroll down "Rtex"company profile page
		JavascriptExecutor a = (JavascriptExecutor) driver;
		a.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);



		JavascriptExecutor b = (JavascriptExecutor) driver;
		b.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);



		JavascriptExecutor c = (JavascriptExecutor) driver;
		c.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);



		JavascriptExecutor d = (JavascriptExecutor) driver;
		d.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);



		//user can scroll down "Rtex"company profile page
		JavascriptExecutor e = (JavascriptExecutor) driver;
		e.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(3000);



		JavascriptExecutor f = (JavascriptExecutor) driver;
		f.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(3000);



		JavascriptExecutor g = (JavascriptExecutor) driver;
		g.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(3000);



		JavascriptExecutor h = (JavascriptExecutor) driver;
		h.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(2000);



		//click on "Onboarding Information"button
		driver.findElement(By.xpath("//a[text()='Company Data']")).click();
		Thread.sleep(8000);



		//click on"Application Information"button
		driver.findElement(By.xpath("//a[text()=' Application Information ']")).click();
		Thread.sleep(2000);



		//click on "Company name"
		driver.findElement(By.xpath("//input[@formcontrolname='companyName']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='companyName']")).sendKeys("Newvision");
		Thread.sleep(2000);



		//Click on Contact Name:
		driver.findElement(By.xpath("//input[@type='text' and @formcontrolname ='name']")).clear();
		driver.findElement(By.xpath("//input[@type='text' and @formcontrolname ='name']")).sendKeys("priyanka");
		Thread.sleep(2000);



		//Click on Contact Phone Number:
		driver.findElement( By.xpath("//input[@formcontrolname='contactPhoneNumber']")).clear();
		driver.findElement( By.xpath("//input[@formcontrolname='contactPhoneNumber']")).sendKeys("9876543210");
		Thread.sleep(2000);



		//click on email
		driver.findElement(By.xpath("//input[@type = 'email' and @formcontrolname = 'email']")).clear();
		driver.findElement(By.xpath("//input[@type = 'email' and @formcontrolname = 'email']")).sendKeys("pri123@mailinator.com");
		Thread.sleep(2000);



		//click on company website
		driver.findElement(By.xpath("//input[@type = 'text' and @formcontrolname = 'website']")).clear();
		driver.findElement(By.xpath("//input[@type = 'text' and @formcontrolname = 'website']")).sendKeys("www.pri.com");
		Thread.sleep(2000);



		//click on "How did you hear about BioLabs"button[DROPDOWN]
		WebElement Biolabs_dropdown = driver.findElement( By.xpath("//select[@formcontrolname='biolabsSources']"));
		Select BioLabs=new Select(Biolabs_dropdown);
		BioLabs.selectByIndex(2);
		Thread.sleep(2000);



		//click on "Briefly summarize your technology. What are your differentiators"
		driver.findElement( By.xpath("//textarea[@formcontrolname='technology']")).clear();
		driver.findElement( By.xpath("//textarea[@formcontrolname='technology']")).sendKeys("BioLabs is an industry-leading full-service laboratory works day & night to deliver answers for your COVID-19 testing needs. We have been providing results with integrity nationwide.");
		Thread.sleep(2000);



		//click on "What is your R&D path & commercialization plan"
		driver.findElement(By.xpath("//textarea[@formcontrolname='rAndDPath']")).clear();
		driver.findElement(By.xpath("//textarea[@formcontrolname='rAndDPath']")).sendKeys("BioLabs are the premier co-working spaces for life science startups - unique places where you can test, develop and grow your game-changing ideas. As entrepreneurs and investors ourselves");
		Thread.sleep(2000);


//
//		//click on "When did you form your business?"
//		selectDate("14", "Jan", "2022");}
//
//
//
//		//@Test
//		public static void selectDate(String exDay, String exMonth, String exYear) throws Exception {
//
//
//
//		//click on calender
//		driver.findElement(locators.Calender).click();
//		Thread.sleep(200);
//
//
//
//		//select year
//
//
//
//		Select year = new Select(driver.findElement(locators.year));
//		year.selectByVisibleText(exYear);
//		Thread.sleep(200);
//
//
//
//		//select month
//
//
//
//		Select month = new Select(driver.findElement(locators.month));
//		month.selectByVisibleText(exMonth);
//		Thread.sleep(500);
//
//
//
//		//select date
//		driver.findElement(locators.date).click();
//		Thread.sleep(500);



		//click on "Where was your company founded?"
		driver.findElement(By.xpath("//input[@formcontrolname='foundedPlace']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='foundedPlace']")).sendKeys("NewYork");
		Thread.sleep(2000);



		//click on "Company stage of development"[DROPDOWN]
		WebElement stage_dropdown=driver.findElement(By.xpath("//select[@formcontrolname='companyStage']"));
		Select stage=new Select(stage_dropdown);
		stage.selectByIndex(2);
		Thread.sleep(2000);



//		//click on "Primary Industry/ Sector"
//		driver.findElement(locators.sector).click();
//		Thread.sleep(2000);



		//click on "Industry Modality"
		driver.findElement(By.xpath("//label[contains(text(),'Small molecule')]")).click();
		Thread.sleep(2000);



		//Click on "Funding raised to-date"
		driver.findElement(By.xpath("//input[@formcontrolname='funding']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='funding']")).sendKeys("2000");
		Thread.sleep(2000);



		//click on "Funding source"[DROPDOWN]
		WebElement source_dropdown=driver.findElement( By.xpath("(//button[@type='button' and @class='dropdown-toggle btn'])[2]"));
		source_dropdown.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()=' Seed-Funding ']")).click();
		Thread.sleep(1000);
		source_dropdown.click();
		Thread.sleep(2000);

		//click on"Does your company own intellectual property related to your technology? "
		WebElement intellectual_dropdown=driver.findElement(By.xpath("//select[@formcontrolname='intellectualProperty']"));
		Select intellectual=new Select(intellectual_dropdown);
		intellectual.selectByIndex(4);
		Thread.sleep(2000);



		//click on "Are your leadership team, IP, or publications affiliated with an institutional technology transfer office or tech venture office?"
		// WebElement team_dropdown=driver.findElement(Companyprofilelocators.team);
		// Select team=new Select(team_dropdown);
		// team.selectByIndex(1);
		// Thread.sleep(2000);



		// driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		//click on "Institution(s)"
		//WebElement institutions = driver.findElement(By.xpath("Companyprofileloactors.institution"));
		// driver.findElement(By.xpath("Companyprofileloactors.institution")).sendKeys("NV.pvt.Ltd");
		//

		// Actions institution = new Actions(driver);
		// institution.click(institutions).perform();
		// institution.sendKeys("NV.PVT.LTD").perform();
		// Thread.sleep(2000);

		//JavascriptExecutor a = (JavascriptExecutor)driver;
		// a.executeScript("document.getElementsByClassName('form-control which-institution ng-touched ng-pristine ng-valid ng-star-inserted').value='NV.PVT.LTD';");


		//click on "How many full-time employees (Residents) do you expect to have on site to start" Field
		driver.findElement(By.xpath("//input[@formcontrolname='utilizeLab']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='utilizeLab']")).sendKeys("20");
		Thread.sleep(2000);



		//Click on "How many full-time employees do you expect to have on site in 6-12 months"Field
		driver.findElement( By.xpath("//input[@formcontrolname='empExpect12Months']")).clear();
		driver.findElement( By.xpath("//input[@formcontrolname='empExpect12Months']")).sendKeys("28");
		Thread.sleep(2000);



		//Click on "How many of these full-time Residents will utilize our lab facilities to start" Field
		driver.findElement(By.xpath("//input[@formcontrolname='utilizeLab']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='utilizeLab']")).sendKeys("25");
		Thread.sleep(2000);



		//click on "How many lab staff do you intend to have on site in 6-12 months?"
		driver.findElement(By.xpath("//input[@formcontrolname='expect12MonthsUtilizeLab']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='expect12MonthsUtilizeLab']")).sendKeys("15");
		Thread.sleep(2000);



		//Click on "When would you like to join BioLabs"(DropDown)Fields
		WebElement join_dropdown=driver.findElement(By.xpath("//select[@formcontrolname='preferredMoveIn']"));
		Select join=new Select(join_dropdown);
		join.selectByIndex(3);
		Thread.sleep(2000);



		//Click on "What equipment and facilities do you plan to primarily use on site"Fields
		driver.findElement(By.xpath("//textarea[@formcontrolname='equipmentOnsite']")).clear();
		driver.findElement(By.xpath("//textarea[@formcontrolname='equipmentOnsite']")).sendKeys("Whether you’re a small practice or a hospital, A2Z BioLabs offers customized testing based on the medical needs of patients.");
		Thread.sleep(2000);



		//click on "update"field
		driver.findElement(By.xpath("//button[@class='btn biolabBtn mt-3']")).click();
        Thread.sleep(4000);
		

}
}


