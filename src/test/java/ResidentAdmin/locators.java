package ResidentAdmin;

import org.openqa.selenium.By;

public class locators {

	//Click on my company(BL_TC_01)
	public static By comapny= By.xpath("//a[text() = 'My Company']");

	//sitemembers(BL_TC_02)
	public static By site_members= By.xpath("//a[text()='Site Members']");

	//Biolabs_site_staff(BL_TC_03)
	public static By site_staff= By.xpath("	//a[text()= 'BioLabs Site Staff']");

	//sitecompanies(BL_TC_04)
	public static By sitecompanies= By.xpath("	//a[text()= 'Site Companies']");

	
	//Myprofilelocators(BL_TC_06)
	
	    //Click on My profile button
		public static By myprofile = By.xpath("//i[@title='My Profile']");

		//Click on Edit button
		public static By Editprofile = By.xpath("//button[text()='Edit Profile']")
				;
		//Click on first name 
		public static By firstname = By.xpath("//input[@formcontrolname='fName']");

		//Click on Last name	
		public static By lastname = By.xpath("//input[@formcontrolname='lName']");

		//Click on Title button
		public static By Title = By.xpath("//input[@formcontrolname='title']");

		//Click on Phone number	
		public static By phoneNumber = By.xpath("//input[@formcontrolname='phone']");

		
		//AdditionlInformation
		
		//click on "Onboarding information button
		public static By OnboardingInformation = By.xpath("//a[text()='Onboarding Information']");

		 //Click on My company button
		public static By Mycompany = By.xpath("//a[text()='My Company']");
		
		//Click on additionalinformation
		public static By Additionalinformation = By.xpath("//a[@class='btn btn-link collapsed accordion-label'] ");
		
		
		
		 //Companyprofilelocators(BL_TC_08)
		
		//click on"Application Information"button
		public static By ApplicationInformation = By.xpath("//a[text()=' Application Information ']");



			//Click on "Company name"
			public static By Companyname = By.xpath("//input[@formcontrolname='companyName']");



			//Click on Contact Name:
			public static By ContactName = By.xpath("//input[@type='text' and @formcontrolname ='name']");



			//Click on Contact Phone Number:
			public static By contactPhoneNumber = By.xpath("//input[@formcontrolname='contactPhoneNumber']");



			//click on email
			public static By email = By.xpath("//input[@type = 'email' and @formcontrolname = 'email']");



			//Click on company Website
			public static By companywebsite = By.xpath("//input[@type = 'text' and @formcontrolname = 'website']");



			//click on "How did you hear about BioLabs"button
			public static By BioLabs = By.xpath("//select[@formcontrolname='biolabsSources']");



			//click on "Briefly summarize your technology. What are your differentiators"
			public static By technology = By.xpath("//textarea[@formcontrolname='technology']");



			//click on "What is your R&D path & commercialization plan"
			public static By path = By.xpath("//textarea[@formcontrolname='rAndDPath']");



			//click on" When did you form your business?"
			static String exDay = "14";
			public static By Calender = By.xpath("//button[@class='btn btn-outline-secondary fa fa-calendar']");
			public static By year = By.xpath("//select[@title='Select year']");
			public static By month = By.xpath("//select[@title='Select month']");
			public static By date = By.xpath("//div[@class='btn-light ng-star-inserted' and text()="+exDay+"]");



			//click on "Where was your company founded?"
			public static By founded = By.xpath("//input[@formcontrolname='foundedPlace']");



			//click on "Company stage of development"
			public static By stage = By.xpath("//select[@formcontrolname='companyStage']");



			//click on "Primary Industry/ Sector"
			public static By sector = By.xpath("//label[text()=' Agriculture ']");

			//click on "Industry Modality"
			public static By modality = By.xpath("//label[contains(text(),'Small molecule')]");

			//Click on "Funding raised to-date"
			public static By funding = By.xpath("//input[@formcontrolname='funding']");

			//click on "Funding source"[DROPDOWN]
			public static By source = By.xpath("(//button[@type='button' and @class='dropdown-toggle btn'])[2]");
			public static By seed = By.xpath("//label[text()=' Seed-Funding ']");

			//click on"Does your company own intellectual property related to your technology? "
			public static By intellectual = By.xpath("//select[@formcontrolname='intellectualProperty']");

			//click on "Are your leadership team, IP, or publications affiliated with an institutional technology transfer office or tech venture office?"
			//public static By team = By.xpath("//select[@formcontrolname='isAffiliated']");

			//click on "Institution(s)"
			// public static By institution = By.xpath("//textarea[@formcontrolname='affiliatedInstitution']");

			//click on "How many full-time employees (Residents) do you expect to have on site to start" Field
			public static By employess = By.xpath("//input[@formcontrolname='noOfFullEmp']");

			//Click on "How many full-time employees do you expect to have on site in 6-12 months"Field
			public static By site = By.xpath("//input[@formcontrolname='empExpect12Months']");

			//Click on "How many of these full-time Residents will utilize our lab facilities to start" Field
			public static By lab = By.xpath("//input[@formcontrolname='utilizeLab']");

			//Click on "How many lab staff do you intend to have on site in 6-12 months?"
			public static By staff = By.xpath("//input[@formcontrolname='expect12MonthsUtilizeLab']");

			//Click on "When would you like to join BioLabs"(DropDown)Fields
			public static By join = By.xpath("//select[@formcontrolname='preferredMoveIn']");

			//Click on "What equipment and facilities do you plan to primarily use on site"Fields
			public static By plan = By.xpath("//textarea[@formcontrolname='equipmentOnsite']");

			//click on "update"field
			//public static By update = By.xpath("//textarea[@formcontrolname='equipmentOnsite']");

			//Click on "Invoicing"tab
			public static By Invoicing = By.xpath("(//li[@class='nav-item tab ng-star-inserted'])[2]");

		
		
		
}
		

