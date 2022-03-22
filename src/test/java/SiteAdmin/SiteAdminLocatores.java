package SiteAdmin;

import org.openqa.selenium.By;

public class SiteAdminLocatores {
      
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
	  
	  //ADD NEW RESIDENT ADMIN
	  public static By ADD_NEW_RESIDENT_ADMIN=By.xpath("//button[text()='ADD NEW RESIDENT ADMIN']");
	  
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
	  
	  //Invoicing/Waitlist
        public static By Invoicing_Waitlist=By.xpath("//a[text()='Invoicing/Waitlist']");
        
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
	     
	     
	  
	  
}
