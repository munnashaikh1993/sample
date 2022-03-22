package ResidentAdmin;

import org.openqa.selenium.By;



import Browsers.Browser;


public class BL_TC_09_Resident extends Browser{

	public static void onboarding() throws InterruptedException {
		System.out.println("***************************BL_TC_09****************************************");

		Thread.sleep(8000);

		//MyCompany

		driver.findElement(locators.comapny).click();
		Thread.sleep(5000);


		//Onboarding information

		driver.findElement(locators.OnboardingInformation).click();
		Thread.sleep(8000);

		//		//upload Logo & Pitch Deck
		//
		driver.findElement(By.xpath("//a[@id='upload-accordion'][text()=' Upload Logo & Pitch Deck ']")).click();
		Thread.sleep(4000);
		//

		driver.findElement(By.xpath("(//input[@formcontrolname='deckLogo'])[1]")).sendKeys("C:\\Users\\salman.shaikh\\Pictures\\1627377451_nature-1200x800.jpg");
		Thread.sleep(2000);


		driver.findElement(By.xpath("(//input[@accept='.pdf,.pptx,.pptm,.ppt,.potx,.ppsx,.pps'])")).sendKeys("C:\\Users\\salman.shaikh\\Pictures\\Demo.pdf");
		Thread.sleep(2000);


		/*
		 * // //Upload Company Logo WebElement element =
		 * driver.findElement(By.xpath("(//input[@formcontrolname='deckLogo'])[1]"));
		 * JavascriptExecutor executor =(JavascriptExecutor)driver;
		 * executor.executeScript("arguments[0].click();", element);
		 */
		/*
		 * driver.findElement(By.xpath("(//input[@formcontrolname='deckLogo'])[1]")).
		 * sendKeys("C:\\Users\\NV\\Pictures\\Camera Roll\\priyanka.jpg");
		 * Thread.sleep(4000);
		 * 
		 * 
		 */


		//Upload Pitch Deck
		/*
		 * WebElement pitchDeck = driver.findElement(By.xpath(
		 * "(//input[@accept='.pdf,.pptx,.pptm,.ppt,.potx,.ppsx,.pps'])"));
		 * JavascriptExecutor upload =(JavascriptExecutor)driver;
		 * upload.executeScript("arguments[0].click();", pitchDeck);
		 * 
		 * driver.findElement(By.xpath(
		 * "(//input[@accept='.pdf,.pptx,.pptm,.ppt,.potx,.ppsx,.pps'])")).
		 * sendKeys("c"
		 * ); Thread.sleep(5000);
		 * 
		 */

		//Click on Application Form

		//		driver.findElement(By.xpath("//a[text()=' Application Information ']")).click();
		//		Thread.sleep(2000);
		//
		//		//Click on Company Name
		//
		//		driver.findElement(By.xpath("//input[@formcontrolname='companyName']")).clear();
		//		driver.findElement(By.xpath("//input[@formcontrolname='companyName']")).sendKeys("NewVision Software");
		//		Thread.sleep(2000);
		//
		//		//Click on Contact Name:
		//		driver.findElement(By.xpath("//input[@type='text' and @formcontrolname ='name']")).clear();
		//		driver.findElement(By.xpath("//input[@type='text' and @formcontrolname ='name']")).sendKeys("Isha");
		//		Thread.sleep(2000);
		//
		//		//Click on Contact Phone Number:
		//		driver.findElement(By.xpath("//input[@formcontrolname='contactPhoneNumber']")).clear();
		//		driver.findElement(By.xpath("//input[@formcontrolname='contactPhoneNumber']")).sendKeys("9876543210");
		//		Thread.sleep(2000);
		//
		//		//Click on Email
		//		driver.findElement(By.xpath("//input[@type = 'email' and @formcontrolname = 'email']")).clear();
		//		driver.findElement(By.xpath("//input[@type = 'email' and @formcontrolname = 'email']")).sendKeys("ishapuri123@mailinator.com");
		//		Thread.sleep(2000);
		//
		//		//Click on company Website
		//		driver.findElement(By.xpath("//input[@type = 'text' and @formcontrolname = 'website']")).clear();
		//		driver.findElement(By.xpath("//input[@type = 'text' and @formcontrolname = 'website']")).sendKeys("www.isha.com");
		//		Thread.sleep(2000);
		//
		//		//click on "How did you hear about BioLabs" DropDown Field
		//		WebElement BioLabs_dropdown=driver.findElement(By.xpath("//select[@formcontrolname='biolabsSources']"));
		//		Select BioLabs=new Select(BioLabs_dropdown);
		//		BioLabs.selectByIndex(2);
		//		Thread.sleep(2000);
		//
		//		//Click on "Briefly summarize your technology. What are your differentiators"Field
		//		driver.findElement(By.xpath("//textarea[@formcontrolname='technology']")).clear();
		//		driver.findElement(By.xpath("//textarea[@formcontrolname='technology']")).sendKeys("BioLabs is an industry-leading full-service laboratory works day & night to deliver answers for your COVID-19 testing needs. We have been providing results with integrity nationwide.");
		//		Thread.sleep(2000);
		//
		//		//click on "What is your R&D path & commercialization plan"Field
		//		driver.findElement(By.xpath("//textarea[@formcontrolname='rAndDPath']")).clear();
		//		driver.findElement(By.xpath("//textarea[@formcontrolname='rAndDPath']")).sendKeys("BioLabs are the premier co-working spaces for life science startups - unique places where you can test, develop and grow your game-changing ideas. As entrepreneurs and investors ourselves, we have first-hand experience with the pain-points biotech start-ups face.");
		//		Thread.sleep(2000);

		//Click on "When did you form your business"field

		//		selectDate("14", "Jan", "2022");
		//		}
		//
		//
		//
		//		@Test
		//		public static void selectDate(String exDay, String exMonth, String exYear) throws Exception {
		//
		//
		//
		//		WebElement calender = driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary fa fa-calendar']"));
		//		calender.click();
		//		Thread.sleep(200);
		//
		//
		//
		//		// Select Year
		//
		//
		//
		//		Select year = new Select(driver.findElement(By.xpath("//select[@title='Select year']")));
		//		year.selectByVisibleText(exYear);
		//		Thread.sleep(200);
		//
		//
		//
		//		// Select Month
		//
		//
		//
		//		Select month = new Select(driver.findElement(By.xpath("//select[@title='Select month']")));
		//		month.selectByVisibleText(exMonth);
		//		Thread.sleep(500);
		//
		//
		//
		//		// Select Date
		//
		//
		//
		//		WebElement date = driver.findElement(By.xpath("//div[@class='btn-light ng-star-inserted' and text()='"+exDay+"']"));
		//		date.click();
		//		Thread.sleep(500);

		//		//Click on "Where was your company founded"Field
		//		driver.findElement(By.xpath("//input[@formcontrolname='foundedPlace']")).clear();
		//		driver.findElement(By.xpath("//input[@formcontrolname='foundedPlace']")).sendKeys("NewYork");
		//		Thread.sleep(2000);
		////
		//		//Click on "Company stage of development" DropDown Field
		//		WebElement stage_dropdown=driver.findElement(By.xpath("//select[@formcontrolname='companyStage']"));
		//		Select stage=new Select(stage_dropdown);
		//		stage.selectByIndex(2);
		//		Thread.sleep(2000);
		////
		//		//click on "Industry/Sector" Field
		//		driver.findElement(By.xpath("//label[text()=' Agriculture ']")).click();
		//		Thread.sleep(2000);
		////
		//		//Click on "Industry Modality"Field
		////
		//		WebElement Modality = driver.findElement(By.xpath("//label[contains(text(),'Small molecule')]"));
		//		Modality.click();
		//		Thread.sleep(2000);
		//
		//		//click on" Funding raised to-date"Field
		//		driver.findElement(By.xpath("//input[@formcontrolname='funding']")).clear();
		//		driver.findElement(By.xpath("//input[@formcontrolname='funding']")).sendKeys("15.00");
		//		Thread.sleep(2000);
		//
		//		//Click on "Does your company own intellectual property related to your technology" dropDown Field
		//		WebElement property_dropdown=driver.findElement(By.xpath("//select[@formcontrolname='intellectualProperty']"));
		//		Select property=new Select(property_dropdown);
		//		property.selectByIndex(2);
		//		Thread.sleep(2000);
		//
		//		//Click on "Are your leadership team, IP, or publications affiliated with an institutional technology transfer office or tech venture office"(Dropdown Field)
		//		WebElement team_dropdown=driver.findElement(By.xpath("//select[@formcontrolname='isAffiliated']"));
		//		Select team=new Select(team_dropdown);
		//		team.selectByIndex(1);
		//	Thread.sleep(2000);
		////
		//		//Click on"How many full-time employees (Residents) do you expect to have on site to start"Field
		//		driver.findElement(By.xpath("//input[@formcontrolname='noOfFullEmp']")).clear();
		//		driver.findElement(By.xpath("//input[@formcontrolname='noOfFullEmp']")).sendKeys("20");
		//		Thread.sleep(2000);
		////
		//		//Click on "How many full-time employees do you expect to have on site in 6-12 months"Field
		//		driver.findElement(By.xpath("//input[@formcontrolname='empExpect12Months']")).clear();
		//		driver.findElement(By.xpath("//input[@formcontrolname='empExpect12Months']")).sendKeys("25");
		//		Thread.sleep(2000);
		////
		//		//Click on "How many of these full-time Residents will utilize our lab facilities to start" Field
		//		driver.findElement(By.xpath("//input[@formcontrolname='utilizeLab']")).clear();
		//		driver.findElement(By.xpath("//input[@formcontrolname='utilizeLab']")).sendKeys("30");
		//		Thread.sleep(2000);
		////
		//		//Click on "How many lab staff do you intend to have on site in 6-12 months"field
		//		driver.findElement(By.xpath("//input[@formcontrolname='expect12MonthsUtilizeLab']")).clear();
		//		driver.findElement(By.xpath("//input[@formcontrolname='expect12MonthsUtilizeLab']")).sendKeys("15");
		//		Thread.sleep(2000);
		////
		//		//Click on "When would you like to join BioLabs"(DropDown)Fields
		//	WebElement BioLabs_dropdown1=driver.findElement(By.xpath("//select[@formcontrolname='preferredMoveIn']"));
		//		Select BioLabs1=new Select( BioLabs_dropdown1);
		//		BioLabs1.selectByIndex(2);
		//		Thread.sleep(2000);
		////
		//		//Click on "What equipment and facilities do you plan to primarily use on site"Fields
		//		driver.findElement(By.xpath("//textarea[@formcontrolname='equipmentOnsite']")).clear();
		//		driver.findElement(By.xpath("//textarea[@formcontrolname='equipmentOnsite']")).sendKeys("Whether you’re a small practice or a hospital, A2Z BioLabs offers customized testing based on the medical needs of patients. ");
		//		Thread.sleep(2000);
		////
		//		//Click on "Update" Button
		driver.findElement(By.xpath("//button[text()=' Update ']")).click();
		//	// Thread.sleep(2000);

	}


}
