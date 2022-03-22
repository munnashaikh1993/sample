package ApplicationForm;

import org.openqa.selenium.By;

public class ApplicationLocatores 
{
     //Apply to BioLabs    
	  public static By Apply_to_BioLabs=By.xpath("//button[text()='Apply to BioLabs']");
	  
	  //CompanyName
	  public static By CompanyName=By.xpath("//input[@formcontrolname='companyName']");
	  
	  //Contact Name
	  public static By Contact_name=By.xpath("//input[@formcontrolname='name']");
	  
	  //Contact Phone Number
	  public static By ContactPhoneNumber=By.xpath("//input[@formcontrolname='contactPhoneNumber']");
	  
	  //Email
	  public static By Email=By.xpath("//input[@formcontrolname='email']");
	  
	  //Web site
	  public static By CompanyWebsite=By.xpath("//input[@formcontrolname='website']");
	  
	  // about BioLabs
	  public static By AboutBioLabs=By.xpath("//select[@formcontrolname='biolabsSources']");
	  
	  //Which site are you applying to
	  public static By Which_site=By.xpath("//select[@formcontrolname='primarySite']");
	  
	  //Additional site(s) you are applying to?
	  public static By Additional_site=By.xpath("(//button[@class='dropdown-toggle btn'])[1]");
	  
	  //Additional site check box
	  public static By Additional_site_checkbox=By.xpath("(//input[@class='form-check-input ng-untouched ng-pristine ng-valid'])[2]");
	  
	  //Briefly summarize your technology. What are your differentiators?
	  public static By Briefly_summarize=By.xpath("//textarea[@formcontrolname='technology']");
	  
	 
	  
	  //What is your R&D path & commercialization plan?
	  public static By commercialization_plan=By.xpath("//textarea[@formcontrolname='rAndDPath']");
	  
	  //Calendar Button
	  public static By Calender_button=By.xpath("//button[@class='btn btn-outline-secondary fa fa-calendar']");
	  
	  //Month
	  public static By Month_dropdown=By.xpath("//select[@class='custom-select' and @aria-label='Select month']");
	  
	  //Year
	  public static By Year_dropDown=By.xpath("//select[@class='custom-select' and @aria-label='Select year']");
	  
	  //Date
	  public static By Date=By.xpath("//div[text()='14' and @class='btn-light text-muted outside ng-star-inserted']");
	  
	  //Where was your company founded
	  public static By company_founded=By.xpath("//input[@formcontrolname='foundedPlace']");
	  
	  //Company stage of development*
	  public static By stage_of_development=By.xpath("//select[@formcontrolname='companyStage']");
	  
	  //Primary Industry/ Sector
	  public static By Primary_Industry=By.xpath("(//input[@class='form-check-input ng-untouched ng-pristine ng-valid ng-star-inserted'])[1]");
	  
	  //
	  //Diagnostics/Biomarkers
	  public static By Diagnostics=By.xpath("(//input[@class='form-check-input ng-untouched ng-pristine ng-valid ng-star-inserted'])[7]");
	  
	  //Lab/Research Tools
	  public static By Research_Tools=By.xpath("(//input[@class='form-check-input ng-untouched ng-pristine ng-valid ng-star-inserted'])[7]");
	  
	  //Industry Modality
	  //Small molecule
	  public static By Small_molecule=By.xpath("(//div[@class='form-check']//input[@class='form-check-input ng-untouched ng-pristine ng-valid'])[20]");
	  
	  //Synthetic biology
	  public static By Synthetic_biology=By.xpath("(//div[@class='form-check']//input[@class='form-check-input ng-untouched ng-pristine ng-valid'])[21]");
	  
	  //Funding raised to-date:
	  public static By funding=By.xpath("//input[@formcontrolname='funding']");
	  
	  //Funding source
	  public static By Funding_source=By.xpath("(//button[@class='dropdown-toggle btn'])[2]");
	  
	  //check box
	  public static By Funding_source_checkbox1=By.xpath("(//input[@class='form-check-input ng-untouched ng-pristine ng-valid'])[31]");
	  
	  public static By Funding_source_checkbox2=By.xpath("(//input[@class='form-check-input ng-untouched ng-pristine ng-valid'])[32]");

      //Does your company own intellectual property related to your technology
	  public static By intellectual_property=By.xpath("//select[@formcontrolname='intellectualProperty']");
	  
	  //Are your leadership team, IP, or publications affiliated with an institutional technology transfer office or tech venture office
	  public static By leadership_team=By.xpath("//select[@formcontrolname='isAffiliated']");
	  
	  //Institution(s)
	  public static By Institution=By.xpath("//textarea[@formcontrolname='affiliatedInstitution']");
	  
	  //How many full-time employees (Residents) do you expect to have on site to start
	  public static By full_time_employees=By.xpath("//input[@formcontrolname='noOfFullEmp']");
	  
	  //How many full-time employees do you expect to have on site in 6-12 months
	  public static By full_time_employees_12=By.xpath("//input[@formcontrolname='empExpect12Months']");
	  
	  //How many of these full-time Residents will utilize our lab facilities to start
	  public static By full_time_Residents=By.xpath("//input[@formcontrolname='utilizeLab']");
	  
	  //How many lab staff do you intend to have on site in 6-12 months
	  public static By lab_staff_12=By.xpath("//input[@formcontrolname='expect12MonthsUtilizeLab']");
	  
	  //When would you like to join BioLabs
	  public static By Join_BioLabs=By.xpath("//select[@formcontrolname='preferredMoveIn']");

      //What equipment and facilities do you plan to primarily use on site
	  public static By equipment_and_facilities=By.xpath("//textarea[@formcontrolname='equipmentOnsite']");
	  
	  //Terms & Agreement
	  public static By Terms_and_Agreement=By.xpath("//input[@formcontrolname='acceptTerms']");




}
