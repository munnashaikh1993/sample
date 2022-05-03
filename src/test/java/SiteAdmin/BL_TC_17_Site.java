package SiteAdmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Browsers.Browser;

public class BL_TC_17_Site extends Browser{
	public static void Onboarding_Information_tab() throws Exception 
	{
		System.out.println("***************************BL_TC_17_Site****************************************");
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
		Thread.sleep(4000);
		//Companies
		driver.findElement(By.xpath("//a[text()='Companies']")).click();
		Thread.sleep(4000);

		//Company Card View
		driver.findElement(SiteAdminLocatores.Company_Card_View).click();
		Thread.sleep(2000);

		//Click on learn more button
		driver.findElement(By.xpath("//h5[text()='Cashew Owner']/../..//button[text()=' LEARN MORE ']")).click();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		Thread.sleep(4000);
		

		//Onboarding Information
		driver.findElement(SiteAdminLocatores.Company_Data).click();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		Thread.sleep(6000);

		//Application Information
	WebElement AI=	driver.findElement(SiteAdminLocatores.Application_Information);
	Actions act=new Actions(driver);
	act.moveToElement(AI).perform();
	act.click(AI).perform();
		Thread.sleep(2000);

		//Contact Phone Number:*
		driver.findElement(SiteAdminLocatores.Application_Information_Contact_Phone_Number).clear();
		driver.findElement(SiteAdminLocatores.Application_Information_Contact_Phone_Number).sendKeys("9856325263");
         Thread.sleep(2000);
         
         //otherCompanyStage
         driver.findElement(By.xpath("//input[@formcontrolname='otherCompanyStage']")).clear();
         driver.findElement(By.xpath("//input[@formcontrolname='otherCompanyStage']")).sendKeys("Demo");

		//uplode companies logo and pitch dech
		driver.findElement(SiteAdminLocatores.uplode_logo_and_pitch_dech).click();
		Thread.sleep(4000);

		WebElement fileupled_Logo=	driver.findElement(SiteAdminLocatores.uplode_button_company_logo);
		fileupled_Logo.sendKeys("C:\\Users\\salman.shaikh\\Pictures\\1627377451_nature-1200x800.jpg");
		Thread.sleep(2000);



		Thread.sleep(5000);

		WebElement fileuplode_file=	driver.findElement(SiteAdminLocatores.uplode_button_pitch_dech);
		fileuplode_file.sendKeys("C:\\Users\\salman.shaikh\\Pictures\\Demo.pdf");


		Thread.sleep(4000);

		//Additional Application Information
		driver.findElement(SiteAdminLocatores.Additional_Application_Information).click();
		Thread.sleep(2000);

		//Would you like your company logo to be included in our member wall?
		WebElement your_company_logo_dropdown= driver.findElement(SiteAdminLocatores.your_company_logo);

	    act.click(your_company_logo_dropdown).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		//Would you like your company logo on your licensed space (desk/lab bench)?
		WebElement your_licensed_space_dropdown= driver.findElement(SiteAdminLocatores.your_licensed_space);

		act.click(your_licensed_space_dropdown).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		//What assistance are you most interested in tapping into within the BioLabs community?
		driver.findElement(SiteAdminLocatores.most_interested_in).clear();
		driver.findElement(SiteAdminLocatores.most_interested_in).sendKeys("dlfjdgljd sfjhsflh hlhgsfgl ghlfhglsd fghfah fglhflghf");    
		Thread.sleep(2000);

		//Have you published any papers related to your technology?
		WebElement published_any_papers_dropdown= driver.findElement(SiteAdminLocatores.published_any_papers);

		act.click(published_any_papers_dropdown).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		//How many patents have you filed?
		driver.findElement(SiteAdminLocatores.patentsFiled).clear();
		driver.findElement(SiteAdminLocatores.patentsFiled).sendKeys("5");
		Thread.sleep(2000);

		//How many patents have been granted to you?
		driver.findElement(SiteAdminLocatores.patentsGranted).clear();
		driver.findElement(SiteAdminLocatores.patentsGranted).sendKeys("7");
		Thread.sleep(2000);

		//Active Clinical Trials
		driver.findElement(SiteAdminLocatores.activeClinicalTrials).clear();
		driver.findElement(SiteAdminLocatores.activeClinicalTrials).sendKeys("6");
		Thread.sleep(2000);

		//Clinical Trial Participants
		driver.findElement(SiteAdminLocatores.clinicalTrialParticipants).clear();
		driver.findElement(SiteAdminLocatores.clinicalTrialParticipants).sendKeys("4");
		Thread.sleep(2000);

		//Leadership/Management Team
		driver.findElement(SiteAdminLocatores.Leadership_Management_Team).click();
		Thread.sleep(2000);

		//Leadership/Management Team Add button
		driver.findElement(SiteAdminLocatores.Leadership_Management_Team_Add_button).click();
		Thread.sleep(2000);

		//Leadership_Management Team Member button
		driver.findElement(SiteAdminLocatores.Leadership_Management_Team_Member_button).click();
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(4000);

		//Name
		String name="salman";
		driver.findElement(SiteAdminLocatores.Leadership_Management_Team_Name).clear();
		driver.findElement(SiteAdminLocatores.Leadership_Management_Team_Name).sendKeys(name);
		Thread.sleep(1000);

		//Title
		String title="QA";
		driver.findElement(SiteAdminLocatores.Leadership_Management_Team_Title).clear();
		driver.findElement(SiteAdminLocatores.Leadership_Management_Team_Title).sendKeys("QA");
		Thread.sleep(1000);

		//Email
		String email="salman123@gmail.com";
		driver.findElement(SiteAdminLocatores.Leadership_Management_Team_Email).clear();
		driver.findElement(SiteAdminLocatores.Leadership_Management_Team_Email).sendKeys("salman123@gmail.com");
		Thread.sleep(1000);

		//Phone
		driver.findElement(SiteAdminLocatores.Leadership_Management_Team_Phone).clear();
		driver.findElement(SiteAdminLocatores.Leadership_Management_Team_Phone).sendKeys("9856321245");
		Thread.sleep(1000);

		//LinkedIn link
		driver.findElement(SiteAdminLocatores.Leadership_Management_Team_linkedinLink).clear();
		driver.findElement(SiteAdminLocatores.Leadership_Management_Team_linkedinLink).sendKeys("www.linkin.com");
		Thread.sleep(1000);

		//Publications
		driver.findElement(SiteAdminLocatores.Leadership_Management_Team_publications).clear();
		driver.findElement(SiteAdminLocatores.Leadership_Management_Team_publications).sendKeys("Test");
		Thread.sleep(1000);

		//Academic Affiliation
		driver.findElement(SiteAdminLocatores.Leadership_Management_Team_academicAffiliation).sendKeys("TestDemo");
		Thread.sleep(1000);

		//Joining as a member?
		WebElement Joining_as_member_dropdown= driver.findElement(SiteAdminLocatores.Leadership_Management_Team_joiningAsMember);

		act.click(Joining_as_member_dropdown).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		//Main Executive POC for Company?
		WebElement Main_Executive_POC_Company_dropdown= driver.findElement(SiteAdminLocatores.Leadership_Management_Team_mainExecutivePOC);

		act.click(Main_Executive_POC_Company_dropdown).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		//Laboratory Executive POC for Company?
		WebElement Laboratory_Executive_POC_Company_dropdown=  driver.findElement(SiteAdminLocatores.Leadership_Management_Team_laboratoryExecutivePOC);

		act.click(Laboratory_Executive_POC_Company_dropdown).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

		//Invoicing Executive POC for Company?
		WebElement Invoicing_Executive_POC_Company_dropdown= driver.findElement(SiteAdminLocatores.Leadership_Management_Team_invoicingExecutivePOC);

		act.click(Invoicing_Executive_POC_Company_dropdown).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);


		//Advisory Board: (Board of Directors and/or Scientific Advisory Board)
		driver.findElement(SiteAdminLocatores.Advisory_Board).click();
		Thread.sleep(2000);

		//Company_Advisor
		driver.findElement(SiteAdminLocatores.Advisory_Board_Company_Advisor).click();
		Thread.sleep(2000);

		//Name
		String name1="salman";
		driver.findElement(SiteAdminLocatores.Advisory_Board_Name).clear();
		driver.findElement(SiteAdminLocatores.Advisory_Board_Name).sendKeys(name1);
		Thread.sleep(2000);

		//Title
		String title1="QA";
		driver.findElement(SiteAdminLocatores.Advisory_Board_Title).clear();
		driver.findElement(SiteAdminLocatores.Advisory_Board_Title).sendKeys(title1);
		Thread.sleep(2000);

		//organization
		String organization="DEMO";
		driver.findElement(SiteAdminLocatores.Advisory_Board_organization).clear();
		driver.findElement(SiteAdminLocatores.Advisory_Board_organization).sendKeys(organization);
		Thread.sleep(2000);

		//Technical/Laboratory/Business Team
		driver.findElement(SiteAdminLocatores.Technical_Laboratory_Business_Team).click();
		Thread.sleep(2000);

		//Add Button
		driver.findElement(SiteAdminLocatores.Technical_Laboratory_Business_Team_Add_button).click();
		Thread.sleep(2000);

		//Team Member button
		driver.findElement(SiteAdminLocatores.Technical_Laboratory_Business_Team_Team_Member).click();
		Thread.sleep(2000);

		//name
		String name2="salman";
		driver.findElement(SiteAdminLocatores.Technical_Laboratory_Business_Team_Name).clear();
		driver.findElement(SiteAdminLocatores.Technical_Laboratory_Business_Team_Name).sendKeys(name2);
		Thread.sleep(2000);

		//Title
		String title2="Tester";
		driver.findElement(SiteAdminLocatores.Technical_Laboratory_Business_Team_Title).clear();
		driver.findElement(SiteAdminLocatores.Technical_Laboratory_Business_Team_Title).sendKeys(title2);
		Thread.sleep(2000);

		//Email
		String email2="salman34@gmail.com";
		driver.findElement(SiteAdminLocatores.Technical_Laboratory_Business_Team_Email).clear();
		driver.findElement(SiteAdminLocatores.Technical_Laboratory_Business_Team_Email).sendKeys(email2);
		Thread.sleep(2000);

		//Phone
		driver.findElement(SiteAdminLocatores.Technical_Laboratory_Business_Team_Phone).clear();
		driver.findElement(SiteAdminLocatores.Technical_Laboratory_Business_Team_Phone).sendKeys("9956231452");
		Thread.sleep(2000);

		//linkedinLink
		driver.findElement(SiteAdminLocatores.Technical_Laboratory_Business_Team_linkedinLink).clear();
		driver.findElement(SiteAdminLocatores.Technical_Laboratory_Business_Team_linkedinLink).sendKeys("www.linlin.com");
		Thread.sleep(2000);

		//Publications
		driver.findElement(SiteAdminLocatores.Technical_Laboratory_Business_Team_publications).clear();
		driver.findElement(SiteAdminLocatores.Technical_Laboratory_Business_Team_publications).sendKeys("DEmo");
		Thread.sleep(2000);

		//Joining as a member?
		WebElement Technical_Laboratory_Business_Team_joiningAsMember_dropdown= driver.findElement(SiteAdminLocatores.Technical_Laboratory_Business_Team_joiningAsMember);

		act.click(Technical_Laboratory_Business_Team_joiningAsMember_dropdown).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		//Laboratory POC for Company?
		WebElement Technical_Laboratory_Business_Team_laboratoryExecutivePOC_dropdown= driver.findElement(SiteAdminLocatores.Technical_Laboratory_Business_Team_laboratoryExecutivePOC);

		act.click(Technical_Laboratory_Business_Team_laboratoryExecutivePOC_dropdown).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		//Emergency POC for Company?
		WebElement Technical_Laboratory_Business_Team_emergencyExecutivePOC_dropdown= driver.findElement(SiteAdminLocatores.Technical_Laboratory_Business_Team_emergencyExecutivePOC);

		act.click(Technical_Laboratory_Business_Team_emergencyExecutivePOC_dropdown).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		//Purchasing POC for Company?
		WebElement Technical_Laboratory_Business_Team_invoicingExecutivePOC_dropdown= driver.findElement(SiteAdminLocatores.Technical_Laboratory_Business_Team_invoicingExecutivePOC);

		act.click(Technical_Laboratory_Business_Team_invoicingExecutivePOC_dropdown).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);


		//Have any of your founders started a business in this industry before?
		WebElement founders_started_business_dropdown= driver.findElement(SiteAdminLocatores.founders_started_business);

		act.click(founders_started_business_dropdown).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();

		Select select = new Select(founders_started_business_dropdown);
		WebElement option = select.getFirstSelectedOption();
		System.out.println(option.getText());
		if ((option.getText()).equals("Yes")) {
			Thread.sleep(1000);

			//Please provide names of business
			driver.findElement(SiteAdminLocatores.provide_names_of_business).sendKeys("Demo");
			Thread.sleep(2000);
		}
		Thread.sleep(2000);





		//Does your company currently have any recognized partnerships with academia?
		WebElement partnerships_with_academia_dropdown= driver.findElement(SiteAdminLocatores.partnerships_with_academia);

		act.click(partnerships_with_academia_dropdown).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		Select select1 = new Select(partnerships_with_academia_dropdown);
		WebElement option1 = select1.getFirstSelectedOption();
		System.out.println(option1.getText());
		if ((option1.getText()).equals("Yes")) {
			Thread.sleep(1000);
			//Which institution/institutions?
			driver.findElement(SiteAdminLocatores.institution_institutions).sendKeys("Test Test");
			Thread.sleep(2000);
		}




		//Does your company currently have any recognized partnerships with industry?
		WebElement partnerships_with_industry_dropdown= driver.findElement(SiteAdminLocatores.partnerships_with_industry);

		act.click(partnerships_with_industry_dropdown).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		Select select2 = new Select(partnerships_with_industry_dropdown);
		WebElement option2 = select2.getFirstSelectedOption();
		System.out.println(option2.getText());
		if ((option2.getText()).equals("Yes")) {
			Thread.sleep(1000);
			//Which company/companies?
			driver.findElement(SiteAdminLocatores.company_companies).sendKeys("Test");
			Thread.sleep(1000);
		}



		//Total Employees?
		driver.findElement(SiteAdminLocatores.Total_Employees).clear();
		driver.findElement(SiteAdminLocatores.Total_Employees).sendKeys("19");
		Thread.sleep(2000);

		//Would you like us to announce the fact that you’re joining us on our social media accounts and newsletters?
		WebElement accounts_and_newsletters_dropdown= driver.findElement(SiteAdminLocatores.accounts_and_newsletters);

		act.click(accounts_and_newsletters_dropdown).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);

		//What is your power statement (elevator pitch) about your company?
		driver.findElement(SiteAdminLocatores.elevator_pitch).clear();
		driver.findElement(SiteAdminLocatores.elevator_pitch).sendKeys("jhsldjljf lkhfhsglks dfhdsghld  hfshg");
		Thread.sleep(5000);

		//click on update button
		WebElement UB= driver.findElement(SiteAdminLocatores.update_button1);
		act.moveToElement(UB).build().perform();
		act.click(UB).build().perform();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		Thread.sleep(5000);

		//click on onboarding information
		driver.findElement(SiteAdminLocatores.Company_Data).click();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,700)", "");
		Thread.sleep(2000);

		//click on Leadership Management Team Member
		WebElement LMT=	driver.findElement(SiteAdminLocatores.Leadership_Management_Team);
		act.moveToElement(LMT).build().perform();
		act.click(LMT).build().perform();
		Thread.sleep(2000);
		
		//delete button Leadership Management Team Member
		driver.findElement(By.xpath("//strong[text()='Leadership/Management Team']/../../../..//strong[text()=' "+name+"  | "+title+"  | "+email+" ']/../..//i[@class='fa fa-trash-alt pull-right font-20']")).click();
		Thread.sleep(2000);

		//Advisory Board: (Board of Directors and/or Scientific Advisory Board)
		driver.findElement(SiteAdminLocatores.Advisory_Board).click();
		Thread.sleep(2000);
		
		//delete button Advisory Board: data
		driver.findElement(By.xpath("//strong[text()='Advisory Board: (Board of Directors and/or Scientific Advisory Board)']/../../../..//strong[text()=' "+name1+"  | "+title1+"  | "+organization+" ']/../..//i[@class='fa fa-trash-alt pull-right font-20']")).click();
        Thread.sleep(2000);

      //Technical/Laboratory/Business Team
      	WebElement TLBT=driver.findElement(SiteAdminLocatores.Technical_Laboratory_Business_Team);
      	act.moveToElement(TLBT).build().perform();
      	act.click(TLBT).build().perform();
      		Thread.sleep(2000);
      		
        //delete
        driver.findElement(By.xpath("//strong[text()='Technical/Laboratory/Business Team']/../../../..//strong[text()=' "+name2+"  | "+title2+"  | "+email2+" ']/../..//i[@class='fa fa-trash-alt pull-right font-20']")).click();
         driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
         Thread.sleep(2000);
      //click on update button
      		driver.findElement(SiteAdminLocatores.update_button1).click();
      		Thread.sleep(3000);

	}
}