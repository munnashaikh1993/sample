package Sponsor;

import org.openqa.selenium.By;

public class SponsorLocators {
	
	//BioLabs Network
   public static By BioLabsNetworklink=By.xpath("//a[text()='BioLabs Network']");
   
   //Resident Companies
   public static By ResidentCompanieslink=By.xpath("//a[text()='Resident Companies']");
   
   //BioLabs Global Network
   public static By BioLabsGlobalNetwork=By.xpath("//strong[text()=' BioLabs Global Network']");
   
   //BioLabs By Site
   public static By BioLabsBySite=By.xpath("//strong[text()=' BioLabs By Site']");
   
   //Recently joined BioLabs
   public static By RecentlyjoinedBioLabs=By.xpath("//strong[text()='Recently joined BioLabs']");
   
   //BioLabs Global Network div
   public static By BiolabGlobaldiv=By.xpath("//div[@class='row bg-light text-dark']");
   
   //Map image 
   public static By Map_image=By.xpath("//img[@alt='Biolab Locations']");
  
   //Alert massage
   public static By poppupmsg=By.xpath("//div[@class='modal-body text-center']");
   
   //Resident Companies
   public static By ResidentCompanies=By.xpath("//a[text()='Resident Companies']");
   
   //Location
   public static By Location=  By.xpath("(//div[@class='mt-2']//ngx-dropdown-treeview[@class='biolab-outline'])[1]");
   
   //Checkbox
   public static By checkbox=By.xpath("//label[text()=' Servier Incubator ']");
   
   //Location title
   public static By Locationtitle=By.xpath("//strong[text()='Location']");
   
   //Nirvana Theraputics Learn More button
   public static By  NirvanaTheraputicsLearnMore =By.xpath("(//div[@class='card-body']//button[text()='Learn More'])[1]");
   
   //Company Growth button
   public static By CompanyGrowth=By.xpath("//a[text()='Company Growth']");
   
   //Nirvana Theraputics Text
   public static By NirvanaTheraputicsText=By.xpath("(//div[@class='col-md-6 col-sm-6'])[1]");
   
   //Nirvana Theraputics Graph
   public static By NirvanaTheraputicsGraph=By.xpath("(//div[@class='col-md-6 col-sm-6'])[2]");
   
   //Financials
   public static By FinancialsText=By.xpath("(//div[@class='col-md-6 col-sm-6'])[3]");
   
   //Financials Graph
   public static By FinancialsGraph=By.xpath("(//div[@class='col-md-6 col-sm-6'])[4]");
   
   //Timeline Text
   public static By TimelineText=By.xpath("(//div[@class='col-md-6 col-sm-6'])[5]");
   
   //Timeline Graph
   public static By TimelineGraph=By.xpath("(//div[@class='col-md-6 col-sm-6'])[6]");
}
