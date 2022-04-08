package SiteAdmin;

import org.openqa.selenium.By;

public class SiteAdminLocatores {

	//Companies Title in Header
	public static By Companies=By.xpath("//a[text()='Companies']");

	//Manage Users Title in Header
	public static By Manage_Users=By.xpath("//a[text()='Manage Users']");

	//Invoicing/Waitlist Title in Header
	public static By Invoicing_Waitlist=By.xpath("//a[text()='Invoicing/Waitlist']");

	//Metrics Title in Header
	public static By Metrics=By.xpath("//a[text()='Metrics']");

	//Icons

	//Directory Icon
	public static By Directory=By.xpath("//i[@title='Directory']");

	//Sponsor View Icon
	public static By Sponsor_View=By.xpath("//i[@title='Sponsor View']");

	//Application Form Icon
	public static By Application_Form=By.xpath("//i[@title='Application Form']");



	//My Profile Icon
	public static By My_Profile=By.xpath("//i[@title='My Profile']");

	//Log Out Icon
	public static By Log_Out=By.xpath("//i[@title='Log Out']");

	//Manage Users
	public static By Manage_Users_header=By.xpath("//a[text()='Manage Users']");

	//ADD NEW ADMIN button
	public static By ADD_NEW_ADMIN_button=By.xpath("//button[text()='ADD NEW ADMIN']");

	//First Name
	public static By First_name=By.xpath("//input[@formcontrolname='fName']");

	//Last Name
	public static By Last_Name=By.xpath("//input[@formcontrolname='lName']");

	//Email
	public static By Email=By.xpath("//input[@formcontrolname='email']");

	//Phone Number
	public static By Phone_no=By.xpath("//input[@formcontrolname='phone']");

	//Title
	public static By Title=By.xpath("//input[@formcontrolname='title']");

	//Sites*
	public static By Sites=By.xpath("//button[@class='dropdown-toggle btn']");

	//Check box
	public static By check_Box=By.xpath("//input[@class='form-check-input ng-untouched ng-pristine ng-valid']");

	//User Type
	public static By User_Type=By.xpath("//select[@class='form-control ng-untouched ng-pristine ng-valid']");

	//Add User button
	public static By Add_User=By.xpath("//button[@class='btn biolabBtn' and text()=' Add User ']");

	//Resident Admin
	public static By Resident_Admin=By.xpath("//a[text()=' Resident Admin ']");
	
	//Resident User
	public static By Resident_User=By.xpath("//a[text()=' Resident User ']");

	//ADD NEW RESIDENT ADMIN
	public static By ADD_NEW_RESIDENT_ADMIN=By.xpath("//button[text()='ADD NEW RESIDENT ADMIN']");
	
	//ADD NEW RESIDENT USER
	public static By ADD_NEW_RESIDENT_USER=By.xpath("//button[text()='ADD NEW RESIDENT USER']");

	//company
	public static By company=By.xpath("//select[@formcontrolname='company']");

	//Company Card View
	public static By Company_Card_View=By.xpath("//i[@title='Company Card View']");

	//Lern More
	public static By LEARN_MORE=By.xpath("//h5[text()='Curecall']/../..//button[text()=' LEARN MORE ']");

	public static By LEARN_MORE1=By.xpath("//h5[text()='AdidasCompany']/../..//button[text()=' LEARN MORE ']");

	//Status
	public static By status=By.xpath("//div[@class='status']//div[@class='ng-star-inserted']");

	//Admin
	public static By Admin=By.xpath("//a[text()='Admin']");
	
	//Company Data
	public static By Company_Data=By.xpath("//a[text()='Company Data']");

	//company status
	public static By company_status=By.xpath("//select[@formcontrolname='companyStatus']");

	//Add Notes
	public static By Add_Notes=By.xpath("//strong[text()='Add Notes']");

	//text area
	public static By text_area=By.xpath("//textarea[@formcontrolname='notes']");

	//save button
	public static By Save_button=By.xpath("//strong[text()=' Save']");

	//update
	public static By update_button=By.xpath("//strong[text()='Update']");

	//Company Onboarding
	public static By Company_Onboarding=By.xpath("//strong[text()='Company Onboarding:']/../..//select[@aria-label='.form-control-lg example']");

	//Company Visibility
	public static By Company_Visibility=By.xpath("//strong[text()='Company Visibility:']/../..//select[@aria-label='.form-control-lg example']");

	//Site
	public static By Site_drop=By.xpath("//select[@class='bioSelect ng-untouched ng-pristine ng-valid']");

	//Menu bar
	public static By All_menubar_items=By.xpath("//ul[@class='nav nav-tabs flex-row cus-tab tab-bar']");

	//VISIT WEBSITE
	public static By VISIT_WEBSITE=By.xpath("//div[@class='d-flex flex-row-reverse']//a[@target='_blank']");

	//Pitch Deck
	public static By Pitch_Deck=By.xpath("//strong[text()='Pitch Deck']");
	
	//Company Status:
	public static By Company_Status=By.xpath("//strong[text()=' Company Status:']/../..//select[@aria-label='.form-control-lg example']");
	
	//Committee Status
	public static By Committee_Status=By.xpath("//strong[text()='Committee Status:']/../..//select[@aria-label='.form-control-lg example']");
	
	//Onboarding Information
	public static By Onboarding_Information=By.xpath("//a[text()='Onboarding Information']");

	//uplode logo and pitch dech
	public static By uplode_logo_and_pitch_dech=By.xpath("//a[@id='upload-accordion']");

	//uplode button for company logo
	public static By uplode_button_company_logo=By.xpath("//input[@formcontrolname='deckLogo'  and @type='file' ]");

	//uplode button for pitch dech
	public static By uplode_button_pitch_dech=By.xpath("//input[@formcontrolname='pitchDeck' and @type='file']");

	//Company Growth
	public static By Company_Growth=By.xpath("//a[text()='Company Growth']");

	//Invoicing
	public static By Invoicing=By.xpath("//a[text()='Invoicing']");

	//add row

	public static By Add_row=By.xpath("//button[text()='Add Row']");

	//productName
	public static By productName=By.xpath("//input[@formcontrolname='productName']");

	//productDescription
	public static By productDescription=By.xpath("//textarea[@formcontrolname='productDescription']");

	//start date button
	public static By start_date_button=By.xpath("(//button[@class='btn btn-outline-secondary fa fa-calendar'])[1]");

	//end date button
	public static By end_date_button=By.xpath("(//button[@class='btn btn-outline-secondary fa fa-calendar'])[2]");

	//month
	public static  By Month_dropdown=By.xpath("//select[@title='Select month']");

	//year
	public static By Year_dropdown=By.xpath("//select[@title='Select year']");

	//Qty
	public static By qty=By.xpath("//input[@formcontrolname='quantity']");

	//cost
	public static By cost=By.xpath("//input[@formcontrolname='cost']");

	//right tick mark
	public static By right_tick_mark=By.xpath("//i[@class='fa fa-check ng-star-inserted']");

	//Edit
	public static By edit=By.xpath("//span[text()=' salman']/../..//li[@class='fa fa-edit']");

	//Delete
	public static By delete=By.xpath("//span[text()=' salman']/../..//li[@class='fa fa-trash']");

	//Configuration
	public static By Configuration=By.xpath("//i[@title='Configuration']");

	//name
	public static By Name=By.xpath("//input[@formcontrolname='name']");

	public static By right_tick_mark1=By.xpath("//i[@class='fa fa-check']");

	//Capacity
	public static By Capacity=By.xpath("//input[@formcontrolname='capacity']");

	//Space
	public static By Space=By.xpath("//input[@formcontrolname='space']");

	//Notes
	public static By Notes=By.xpath("//textarea[@formcontrolname='notes']");

	//Edit right tick mark
	public static By Edit_right_tick_mark=By.xpath("//li[@class='fa fa-check']");



	//Month
	public static By Month=By.xpath("//input[@type='month']");

	//CSV
	public static By CSV_button=By.xpath("//button[@class='dt-button buttons-csv buttons-html5']");

	//Profile
	public static By Profile=By.xpath("//i[@class='fas fa-user-circle icons']");

	//Edit_button
	public static By Edit_button=By.xpath("//button[@class='btn biolabBtn float-right ng-star-inserted']");

	//Update Profile
	public static By Update_profile_button=By.xpath("//button[@class='btn biolabBtn float-right mr-2']");

	//Profile photo 
	public static By update_photo=By.xpath("//div[@class='image-upload-parent']");

	//Resident Table View
	public static By Resident_Table_View=By.xpath("//i[@title='Resident Table View']");

	//Resident Last Name
	public static By Resident_Last_Name=By.xpath("//th[text()='Resident Last Name']");

	//Company Profile
	public static By Company_Profile=By.xpath("//a[text()='Company Profile']");

	//Change Request
	public static By Change_Request=By.xpath("//a[text()='Change Request']");

	//Privacy
	public static By Privacy=By.xpath("//a[text()='Privacy']"); 

	//Additional Application Information
	public static By Additional_Application_Information=By.xpath("//a[text()=' Additional Application Information ']");

	//Would you like your company logo to be included in our member wall?
	public static By your_company_logo=By.xpath("//select[@formcontrolname='logoOnWall']");

	//Would you like your company logo on your licensed space (desk/lab bench)?
	public static By your_licensed_space=By.xpath("//select[@formcontrolname='logoOnLicensedSpace']");

	//What assistance are you most interested in tapping into within the BioLabs community?
	public static By most_interested_in=By.xpath("//textarea[@formcontrolname='bioLabsAssistanceNeeded']");

	//Have you published any papers related to your technology?
	public static By published_any_papers=By.xpath("//select[@formcontrolname='technologyPapersPublished']");

	//How many patents have you filed?
	public static By patentsFiled=By.xpath("//input[@formcontrolname='patentsFiled']");

	//patentsGranted
	public static By patentsGranted=By.xpath("//input[@formcontrolname='patentsGranted']");

	//activeClinicalTrials
	public static By activeClinicalTrials=By.xpath("//input[@formcontrolname='activeClinicalTrials']");

	//clinicalTrialParticipants
	public static By clinicalTrialParticipants=By.xpath("//input[@formcontrolname='clinicalTrialParticipants']");

	//Leadership/Management Team
	public static By Leadership_Management_Team=By.xpath("//strong[text()='Leadership/Management Team']");

	//Leadership/Management Team Add button
	public static By Leadership_Management_Team_Add_button=By.xpath("//strong[text()='Leadership/Management Team']/../../../..//strong[text()='ADD']");

	//Leadership/Management Team Team Member button
	public static By Leadership_Management_Team_Member_button=By.xpath("(//strong[text()='Leadership/Management Team']/../../../..//strong[text()=' Team Member   '])[1]");

	//Leadership Management Team Name
	public static By Leadership_Management_Team_Name=By.xpath("(//strong[text()='Leadership/Management Team']/../../../..//input[@formcontrolname='name'])[1]");

	//Leadership Management Team Title
	public static By Leadership_Management_Team_Title=By.xpath("(//strong[text()='Leadership/Management Team']/../../../..//input[@formcontrolname='title'])[1]");

	//Leadership Management Team Phone
	public static By Leadership_Management_Team_Phone=By.xpath("(//strong[text()='Leadership/Management Team']/../../../..//input[@formcontrolname='phone'])[1]");

	//Leadership Management Team Email
	public static By Leadership_Management_Team_Email=By.xpath("(//strong[text()='Leadership/Management Team']/../../../..//input[@formcontrolname='email'])[1]");

	//Leadership Management Team linkedinLink
	public static By Leadership_Management_Team_linkedinLink=By.xpath("(//strong[text()='Leadership/Management Team']/../../../..//input[@formcontrolname='linkedinLink'])[1]");

	//Leadership Management Team publications
	public static By Leadership_Management_Team_publications=By.xpath("(//strong[text()='Leadership/Management Team']/../../../..//input[@formcontrolname='publications'])[1]");

	//Leadership Management Team academicAffiliation
	public static By Leadership_Management_Team_academicAffiliation=By.xpath("(//strong[text()='Leadership/Management Team']/../../../..//input[@formcontrolname='academicAffiliation'])[1]");

	//Leadership Management Team joiningAsMember
	public static By Leadership_Management_Team_joiningAsMember=By.xpath("(//strong[text()='Leadership/Management Team']/../../../..//select[@formcontrolname='joiningAsMember'])[1]");

	//Leadership Management Team mainExecutivePOC
	public static By Leadership_Management_Team_mainExecutivePOC=By.xpath("(//strong[text()='Leadership/Management Team']/../../../..//select[@formcontrolname='mainExecutivePOC'])[1]");

	//Leadership Management Team laboratoryExecutivePOC
	public static By Leadership_Management_Team_laboratoryExecutivePOC=By.xpath("(//strong[text()='Leadership/Management Team']/../../../..//select[@formcontrolname='laboratoryExecutivePOC'])[1]");

	//Leadership Management Team invoicingExecutivePOC
	public static By Leadership_Management_Team_invoicingExecutivePOC=By.xpath("(//strong[text()='Leadership/Management Team']/../../../..//select[@formcontrolname='invoicingExecutivePOC'])[1]");

	//Advisory Board: (Board of Directors and/or Scientific Advisory Board)
	public static By Advisory_Board=By.xpath("//strong[text()='Advisory Board: (Board of Directors and/or Scientific Advisory Board)']");

	//Company Advisor
	public static By Advisory_Board_Company_Advisor=By.xpath("(//strong[text()='Advisory Board: (Board of Directors and/or Scientific Advisory Board)']/../../../..//strong[text()=' Company Advisor   '])[1]");

	//Advisory Board Name
	public static By Advisory_Board_Name=By.xpath("(//strong[text()='Advisory Board: (Board of Directors and/or Scientific Advisory Board)']/../../../..//input[@formcontrolname='name'])[1]");

	//Advisory Board Title
	public static By Advisory_Board_Title=By.xpath("(//strong[text()='Advisory Board: (Board of Directors and/or Scientific Advisory Board)']/../../../..//input[@formcontrolname='title'])[1]");

	//Advisory Board organization
	public static By Advisory_Board_organization=By.xpath("(//strong[text()='Advisory Board: (Board of Directors and/or Scientific Advisory Board)']/../../../..//input[@formcontrolname='organization'])[1]");

	//Technical/Laboratory/Business Team
	public static By Technical_Laboratory_Business_Team=By.xpath("//strong[text()='Technical/Laboratory/Business Team']");

	//Add button
	public static By Technical_Laboratory_Business_Team_Add_button=By.xpath("//strong[text()='Technical/Laboratory/Business Team']/../../../..//strong[text()='ADD']");

	//Team Member button
	public static By Technical_Laboratory_Business_Team_Team_Member=By.xpath("(//strong[text()='Technical/Laboratory/Business Team']/../../../..//strong[text()=' Team Member   '])[1]");

	//Technical/Laboratory/Business Team Name
	public static By Technical_Laboratory_Business_Team_Name=By.xpath("(//strong[text()='Technical/Laboratory/Business Team']/../../../..//input[@formcontrolname='name'])[1]");

	//Technical/Laboratory/Business Team Title
	public static By Technical_Laboratory_Business_Team_Title=By.xpath("(//strong[text()='Technical/Laboratory/Business Team']/../../../..//input[@formcontrolname='title'])[1]");

	//Technical/Laboratory/Business Team Email
	public static By Technical_Laboratory_Business_Team_Email=By.xpath("(//strong[text()='Technical/Laboratory/Business Team']/../../../..//input[@formcontrolname='email'])[1]");

	//Technical/Laboratory/Business Team Phone
	public static By Technical_Laboratory_Business_Team_Phone=By.xpath("(//strong[text()='Technical/Laboratory/Business Team']/../../../..//input[@formcontrolname='phone'])[1]");

	//Technical/Laboratory/Business Team LinkedIn link
	public static By Technical_Laboratory_Business_Team_linkedinLink=By.xpath("(//strong[text()='Technical/Laboratory/Business Team']/../../../..//input[@formcontrolname='linkedinLink'])[1]");

	//Technical/Laboratory/Business Team Publications
	public static By Technical_Laboratory_Business_Team_publications=By.xpath("(//strong[text()='Technical/Laboratory/Business Team']/../../../..//input[@formcontrolname='publications'])[1]");

	//Technical/Laboratory/Business Team Joining as a member?
	public static By Technical_Laboratory_Business_Team_joiningAsMember=By.xpath("(//strong[text()='Technical/Laboratory/Business Team']/../../../..//select[@formcontrolname='joiningAsMember'])[1]");

	//Technical/Laboratory/Business Team Laboratory POC for Company?
	public static By Technical_Laboratory_Business_Team_laboratoryExecutivePOC=By.xpath("(//strong[text()='Technical/Laboratory/Business Team']/../../../..//select[@formcontrolname='laboratoryExecutivePOC'])[1]");

	//Technical/Laboratory/Business Team Emergency POC for Company?
	public static By Technical_Laboratory_Business_Team_emergencyExecutivePOC=By.xpath("(//strong[text()='Technical/Laboratory/Business Team']/../../../..//select[@formcontrolname='emergencyExecutivePOC'])[1]");

	//Technical/Laboratory/Business Team Purchasing POC for Company?
	public static By Technical_Laboratory_Business_Team_invoicingExecutivePOC=By.xpath("(//strong[text()='Technical/Laboratory/Business Team']/../../../..//select[@formcontrolname='invoicingExecutivePOC'])[1]");

	//Have any of your founders started a business in this industry before?
	public static By founders_started_business=By.xpath("//select[@formcontrolname='foundersBusinessIndustryBefore']");

	//Does your company currently have any recognized partnerships with academia?
	public static By partnerships_with_academia=By.xpath("//select[@formcontrolname='academiaPartnerships']");

	//Does your company currently have any recognized partnerships with industry?
	public static By partnerships_with_industry=By.xpath("//select[@formcontrolname='industryPartnerships']");

	//Total Employees?
	public static By Total_Employees=By.xpath("//input[@formcontrolname='companySize']");

	//Would you like us to announce the fact that you’re joining us on our social media accounts and newsletters?
	public static By accounts_and_newsletters=By.xpath("//select[@formcontrolname='newsletters']");

	//What is your power statement (elevator pitch) about your company?
	public static By elevator_pitch=By.xpath("//textarea[@formcontrolname='elevatorPitch']");

	//Application Information
	public static By Application_Information=By.xpath("//a[text()=' Application Information ']");

	//Application Information Contact Phone Number:*
	public static By Application_Information_Contact_Phone_Number=By.xpath("//a[text()=' Application Information ']/../../..//input[@formcontrolname='contactPhoneNumber']");

	//Please provide names of business
	public static By provide_names_of_business=By.xpath("//input[@formcontrolname='foundersBusinessIndustryName']");

	//Which institution/institutions?
	public static By institution_institutions=By.xpath("//input[@formcontrolname='academiaPartnershipDetails']");

	//Which company/companies?
	public static By company_companies=By.xpath("//input[@formcontrolname='industryPartnershipsDetails']");

    //update button
	public static By update_button1=By.xpath("//button[text()=' Update ']");
	
	//CSV Button
	public static By csv_button1=By.xpath("(//button[@class='dt-button buttons-csv buttons-html5']//span[text()='CSV'])[1]");

	//print Button
	public static By Print_button=By.xpath("(//button[@class='dt-button buttons-print']//span[text()='Print'])[1]");
	
	//Company Table View
	public static By Company_Table_View=By.xpath("//i[@title='Company Table View']");
	
	//Clear
	public static By Clear=By.xpath("//button[@class='btn biolabBtn drop-font marg']");
	
	//forward application
	public static By forwar_application_button=By.xpath("//button[@data-target='#forwardapplication']");
	
	//CREATE CHANGE REQUEST
	public static By CREATE_CHANGE_REQUEST_Button=By.xpath("//button[text()='CREATE CHANGE REQUEST']");
	
	//Waitlist
	public static By Waitlist=By.xpath("//a[text()='Waitlist']");
	
}
