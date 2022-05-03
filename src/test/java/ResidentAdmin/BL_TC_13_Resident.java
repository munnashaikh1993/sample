package ResidentAdmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Browsers.Browser;

public class BL_TC_13_Resident extends Browser
{
	public static void onboardinginformation() throws InterruptedException {

		System.out.println("***************************BL_TC_13_Resident_Admin****************************************");
		//click on Mycompany button

		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[text() = 'My Company']")).click();
		Thread.sleep(6000);

		//click on "COMPANY DATA "button
		driver.findElement(By.xpath("//a[text()='Company Data']")).click();
		Thread.sleep(5000);

		//		//click on "Additional Information"button
		//		driver.findElement(locators.Additionalinformation).click();
		//		Thread.sleep(4000);


		// Would you like your company logo to be included in our member wall?

		WebElement logo_dropdown=driver.findElement(By.xpath("//select[@formcontrolname= 'logoOnWall']")); 
		Select logo=new Select(logo_dropdown);
		logo.selectByIndex(1);
		Thread.sleep(3000);

		//Would you like your company logo on your licensed space (desk/labbench)? 

		//driver.findElement(By.xpath("//select[@formcontrolname= 'logoOnLicensedSpace']")).click(); 
		WebElement company_dropdown =driver.findElement(By.xpath("//select[@formcontrolname= 'logoOnLicensedSpace']")); 
		Select company=new Select(company_dropdown); 
		company.selectByIndex(1);
		Thread.sleep(1000);


		//What assistance are you most interested in tapping into within the BioLabscommunity?

		//WebElement technology = driver.findElement(By.xpath("(//textarea[@formcontrolname='bioLabsAssistanceNeeded'])"));.click(); //technology //
		driver.findElement(By.xpath("(//textarea[@formcontrolname='bioLabsAssistanceNeeded'])")).clear(); Thread.sleep(3000);
		driver.findElement(By.xpath("(//textarea[@formcontrolname='bioLabsAssistanceNeeded'])")).sendKeys("technical" ); Thread.sleep(3000);
		 Thread.sleep(3000);



		//Have you published any papers related to your technology?			  

		WebElement papers=driver.findElement(By.xpath("//select[@formcontrolname ='technologyPapersPublished']")); 
		Select logo1=new Select(papers);
		logo1.selectByIndex(2);
		Thread.sleep(2000);



		//How many patents have you filed & been granted?

		driver.findElement(By.xpath("//input[@formcontrolname='patentsGranted']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='patentsGranted']")).sendKeys("20" );
		Thread.sleep(5000);

//		//  LEADERSHIP MANAGEMENT
//		driver.findElement(By.xpath("//a[@id ='leadership-accordion']")).click();
//		Thread.sleep(8000);
//		
//		//click on add
//		driver.findElement(By.xpath("//strong[text()='Leadership/Management Team']/../../../..//strong[text()='ADD']")).click();
//	    Thread.sleep(4000);

		// TEAM MANAGEMENT
//		driver.findElement(By.xpath("(//strong[text()=' Team Member   ']  ) [1]")).click();
//		Thread.sleep(8000); 
//
//		//NAME
//		driver.findElement(By.xpath("(//input[@formcontrolname='name'])[2]")).click();
//		driver.findElement(By.xpath("(//input[@formcontrolname='name'])[2]")).sendKeys("Priyanka" );
//
//		Thread.sleep(4000); 
//
//
//		//Title
//		driver.findElement(By.xpath("(//input[@formcontrolname ='title'])[1]")).sendKeys("QA" );
//		Thread.sleep(3000);
//
//		//Email
//		driver.findElement(By.xpath("(//input[@formcontrolname ='email'])[2]")).sendKeys("priyanka.prasad@mailinator.com" );
//		Thread.sleep(3000);
//
//		//phone
//		driver.findElement(By.xpath("//input[@formcontrolname ='phone'][1]")).sendKeys("2545252256" );
//		Thread.sleep(3000);
//
//		//linkdln link
//		driver.findElement(By.xpath("(//input[@formcontrolname='linkedinLink'])[1]")).sendKeys("www.linkdlink.com" );
//		Thread.sleep(3000);
//
//		//publications
//		driver.findElement(By.xpath("(//input[@formcontrolname='publications'])[1]")).sendKeys("xyz" );
//		Thread.sleep(3000);
//
//		//Academic Affiliation
//		driver.findElement(By.xpath("(//input[@formcontrolname='academicAffiliation'])[1]")).sendKeys("Abcdefg" );
//		Thread.sleep(3000);
//
//		//joining as a member
//		WebElement JM=driver.findElement(By.xpath("(//select[@formcontrolname = 'joiningAsMember'])[1]")); 
//		Select ABC=new Select(JM);
//		ABC.selectByIndex(2);
//		Thread.sleep(2000);
//
//		//Main Executive POC for Company?
//		WebElement POC=driver.findElement(By.xpath("(//select[@formcontrolname = 'mainExecutivePOC'])")); 
//		Select CompanyPOC=new Select(POC);
//		CompanyPOC.selectByIndex(2);
//		Thread.sleep(2000);
//
//		//Laboratory Executive POC for Company?
//		WebElement laboratory=driver.findElement(By.xpath("(//select[@formcontrolname = 'laboratoryExecutivePOC'])[1]")); 
//		Select object=new Select(laboratory);
//		object.selectByIndex(2);
//		Thread.sleep(2000);
//
//		//Invoicing Executive POC for Company?
//		WebElement invoicing = driver.findElement(By.xpath("(//select[@formcontrolname = 'invoicingExecutivePOC'])[1]")); 
//		Select object1=new Select(invoicing);
//		object1.selectByIndex(2);
//		Thread.sleep(2000);
//
//

//		//Advisory Board
//		driver.findElement(By.xpath("//a[@id = 'advisor-accordion']")).click();
//		Thread.sleep(2000);
//		
//		//click on add
//		driver.findElement(By.xpath("//strong[text()='Advisory Board: (Board of Directors and/or Scientific Advisory Board)']/../../../..//a[@class='btn biolabBtn']")).click();
//	    Thread.sleep(4000);
//
//		//company advisory
//		driver.findElement(By.xpath("//strong[text() = ' Company Advisor   ']")).click();
//		Thread.sleep(2000);
//
//		//NAME
//		//driver.findElement(By.xpath("(//input[@formcontrolname='name'])[2]")).click();
//		driver.findElement(By.xpath("//strong[text()=' Company Advisor   ']/../../../..//input[@formcontrolname='name']")).sendKeys("Priyanka" );
//
//		Thread.sleep(4000);
//
//
//		//Title
//		driver.findElement(By.xpath("(//a[@id = 'advisor-accordion']/../../../..//input[@formcontrolname='title'])[1]")).sendKeys("QA" );
//		Thread.sleep(2000);
//
//		//organization
//		driver.findElement(By.xpath("(//a[@id = 'advisor-accordion']/../../../..//input[@formcontrolname='organization'])[1]")).sendKeys("New Vision" );
//		Thread.sleep(3000); 
//
////		//click on add
////		driver.findElement(By.xpath("//strong[text()='Advisory Board: (Board of Directors and/or Scientific Advisory Board)']/../../../..//a[@class='btn biolabBtn']")).click();
////	    Thread.sleep(4000);
////		
////		
////		//Technical/laboratory/buisness team
////		driver.findElement(By.xpath("//strong[text() = 'Technical/Laboratory/Business Team']")).click();
////		Thread.sleep(2000);
////
////		
////		//click on add
////		driver.findElement(By.xpath("//strong[text()='Technical/Laboratory/Business Team']/../../../..//a[@class='btn biolabBtn']")).click();
////	    Thread.sleep(4000);
////		
////		
////		//Team Member
////		driver.findElement(By.xpath("(//strong[text()=' Team Member   '])[2]")).click();
////		Thread.sleep(2000);
////
////
////		//NAME
////		//driver.findElement(By.xpath("(//input[@formcontrolname='name'])[2]")).click();
////		driver.findElement(By.xpath("(//strong[text() = 'Technical/Laboratory/Business Team']/../../../..//input[@formcontrolname='name'])[2]")).sendKeys("Priyanka" );
////
////		Thread.sleep(4000);
////
////
////		//Title
////		driver.findElement(By.xpath("(//strong[text() = 'Technical/Laboratory/Business Team']/../../../..//input[@formcontrolname='title'])[2]")).sendKeys("QA" );
////		Thread.sleep(3000);
////
////		//Email
////		//driver.findElement(By.xpath("//strong[text()='Technical/Laboratory/Business Team']/../../../..//input[@formcontrolname='email' and @class='form-control ng-pristine ng-valid ng-touched']")).sendKeys("priyanka.prasad@mailinator.com" );
////		//Thread.sleep(3000);
////
////		//EMAIL
////		WebElement email_id= driver.findElement(By.xpath("(//input[contains(@class,'form-control') and @formcontrolname ='email' and @type='email' ])[5]"));
////
////		Actions act=new Actions(driver);
////		//act.click(email_id).perform();
////		act.moveToElement(email_id).perform();
////		act.click(email_id).perform();
////		//act.sendKeys(Keys.INSERT).perform();
////		act.sendKeys("pri123@m.com").perform();
////		
////		Thread.sleep(5000);
////		
////		
//////		//phone
//////		driver.findElement(By.xpath("(//strong[text() = 'Technical/Laboratory/Business Team']/../../../..//label[text()='Phone'])[1]")).sendKeys("2545252256" );
//////		Thread.sleep(3000);
////		
////		//phone
////		WebElement phone= driver.findElement(By.xpath("(//input[@formcontrolname='phone'])[2]"));
////
////		
////		act.moveToElement(phone).perform();
////		act.click(phone).perform();
////		act.sendKeys("5244152255").perform();
////		
////		Thread.sleep(5000);
////
//////		//linkdln link
//////		driver.findElement(By.xpath("(//strong[text() = 'Technical/Laboratory/Business Team']/../../../..//label[text()='LinkedIn link'])[1]")).sendKeys("www.linkdlink.com" );
//////		Thread.sleep(3000);
////
////		//linkdln link
////		WebElement linkdln= driver.findElement(By.xpath("(//input[@formcontrolname='linkedinLink'])[2]"));
////
////
////		act.moveToElement(linkdln).perform();
////		act.click(linkdln).perform();
////		act.sendKeys("https://www.linkedin.com/login").perform();
////		
////		Thread.sleep(5000);
////
//////		//publications
//////		driver.findElement(By.xpath("(//strong[text() = 'Technical/Laboratory/Business Team']/../../../..//label[text()='Publications'])[1]")).sendKeys("xyz" );
//////		Thread.sleep(3000);
////		
////		//publications
////		WebElement publication= driver.findElement(By.xpath("(//input[@formcontrolname='publications'])[2]"));
////
////
////		act.moveToElement(publication).perform();
////		act.click(publication).perform();
////		act.sendKeys("www.publications.com").perform();
////		
////		Thread.sleep(5000);
////
////
////		//joining as a member
////		WebElement JM1=driver.findElement(By.xpath("(//select[@formcontrolname='joiningAsMember'])[2]")); 
////		Select ABC1=new Select(JM1);
////		ABC1.selectByIndex(2);
////		Thread.sleep(2000);
////
////
////		//Laboratory Executive POC for Company?
////		WebElement laboratory1=driver.findElement(By.xpath("(//select[@formcontrolname='laboratoryExecutivePOC'])[2]")); 
////		Select object2=new Select(laboratory1);
////		object2.selectByIndex(2);
////		Thread.sleep(2000);
////
////		// Emergency POC for Company?
////		WebElement Emergency =driver.findElement(By.xpath("(//select[@formcontrolname='emergencyExecutivePOC'])[1]"));
////		Select object31=new Select(Emergency);
////		object31.selectByIndex(2);
////		Thread.sleep(2000);
////
////		// Purchasing POC for Company?
////		WebElement purchasing =driver.findElement(By.xpath("(//select[@formcontrolname='invoicingExecutivePOC'])[2]"));
////		Select object41=new Select(purchasing);
////		object41.selectByIndex(2);
////		Thread.sleep(2000);


		//Have any of your founders started a business in this industry before?
		driver.findElement(By.xpath("//select[@formcontrolname='foundersBusinessIndustryBefore']")).click();
		WebElement founders=driver.findElement(By.xpath("//select[@formcontrolname='foundersBusinessIndustryBefore']"));
		Select industry=new Select(founders); 
		industry.selectByIndex(2);
		Thread.sleep(2000);

		//Does your company currently have any recognized partnerships with academia?
		driver.findElement(By.xpath("//select[@formcontrolname='academiaPartnerships']")).click();
		WebElement patnership=driver.findElement(By.xpath("//select[@formcontrolname='academiaPartnerships']"));
		Select A1=new Select(patnership);
		A1.selectByIndex(1);
		Thread.sleep(1000);

		//Does your company currently have any recognized partnerships with industry?
		driver.findElement(By.xpath("//select[@formcontrolname='industryPartnerships']")).click();
		WebElement company3 = driver.findElement(By.xpath("//select[@formcontrolname='industryPartnerships']"));
		Select A2 = new Select(company3); 
		A2.selectByIndex(1);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);



		// Would you like us to announce the fact that you’re joining us on oursocial media accounts and newsletters?
		driver.findElement(By.xpath("//select[@formcontrolname='newsletters']")). click();
		WebElement newsletter=driver.findElement(By.xpath( "//select[@formcontrolname='newsletters']"));
		Select SM=new Select(newsletter);
		SM.selectByIndex(1); 
		Thread.sleep(1000);


		// What is your power statement (elevator pitch) about your company? This will be used to give potential investors, collaborators, sponsors, partners
		//insight into who you are and what you do. Please limit the most concise
		//paragraph possible.
		driver.findElement(By.xpath("//textarea[@formcontrolname ='elevatorPitch']")).clear();
		
		driver.findElement(By.xpath("//textarea[@formcontrolname ='elevatorPitch']")).sendKeys("Before the 20th century, the term was uncommon in English, and it was used either to refer to the description or study of the useful arts or to allude to technical");
		Thread.sleep(3000);

		//UPDATE
		driver.findElement(By.xpath("//button[text() = ' Update ']")).click(); // update
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);




	}
}
