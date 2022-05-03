package ApplicationForm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



import Browsers.Browser;


public class ApplicationForm extends Browser{
	
         public static void createApplication() throws Exception 
           {
        	     //click on apply to Biolab
			     driver.findElement(ApplicationLocatores.Apply_to_BioLabs).click(); 
			     
			     driver.manage().timeouts().implicitlyWait(30000,TimeUnit.SECONDS);
			     Thread.sleep(5000);
			     //Company Name
			     driver.findElement(ApplicationLocatores.CompanyName).sendKeys("Biolab");
			     Thread.sleep(1000);
			     
			     //Contact name
			     driver.findElement(ApplicationLocatores.Contact_name).sendKeys("Salman");
			     Thread.sleep(1000);
			     
			     //contact phone no
			     driver.findElement(ApplicationLocatores.ContactPhoneNumber).sendKeys("9852451263");
			     Thread.sleep(1000);
			     
			     //Email
			     driver.findElement(ApplicationLocatores.Email).sendKeys("salmanshaikh843@gmail.com");
			     Thread.sleep(1000);
			     
			     //Company website
			     driver.findElement(ApplicationLocatores.CompanyWebsite).sendKeys("www.Biolab.com");
			     Thread.sleep(2000);
			     
			     Actions act=new Actions(driver);
			     
			     //About Biolab
			     WebElement about_Biolab_dropdown=driver.findElement(ApplicationLocatores.AboutBioLabs);
			     
			     act.click(about_Biolab_dropdown).perform();
			     act.sendKeys(Keys.ARROW_DOWN).perform();
			     act.sendKeys(Keys.ARROW_DOWN).perform();
			     act.sendKeys(Keys.ENTER).perform();
			     Thread.sleep(1000);
			     
			     //Which site apply to
			     WebElement Which_site_dropdown=driver.findElement(ApplicationLocatores.Which_site);
			     
			     act.click(Which_site_dropdown).perform();
			     act.sendKeys(Keys.ARROW_DOWN).perform();
			     act.sendKeys(Keys.ARROW_DOWN).perform();
			     act.sendKeys(Keys.ENTER).perform();
			     Thread.sleep(1000);
			     
			     //Additional site(s) you are applying to
			     driver.findElement(ApplicationLocatores.Additional_site).click();
			     Thread.sleep(1000);
			     
			     //select check box
			     driver.findElement(ApplicationLocatores.Additional_site_checkbox).click();
			     Thread.sleep(1000);
			     
			     //Briefly summarize your technology. What are your differentiators
			     driver.findElement(ApplicationLocatores.Briefly_summarize).sendKeys("Demo Test");
			     Thread.sleep(1000);
			     
			     //What is your R&D path & commercialization plan
			     driver.findElement(ApplicationLocatores.commercialization_plan).sendKeys("QA Test");
			     Thread.sleep(1000);
			     
			     //Calender
			     
			     driver.findElement(ApplicationLocatores.Calender_button).click();
			     Thread.sleep(1000);
			     
			     //month
			     WebElement calender_month=driver.findElement(ApplicationLocatores.Month_dropdown);
			     
			     act.click(calender_month).perform();
			     act.sendKeys(Keys.ARROW_UP).perform();
			     act.sendKeys(Keys.ENTER).perform();
			     Thread.sleep(1000);
			     
			     //year
			     WebElement calender_year=driver.findElement(ApplicationLocatores.Year_dropDown);
			     
			     act.click(calender_year).perform();
			     act.sendKeys(Keys.ARROW_DOWN).perform();
			     act.sendKeys(Keys.ARROW_DOWN).perform();
			     act.sendKeys(Keys.ENTER).perform();
			     Thread.sleep(1000);
			     
			     //date
			     int i=23;
			     driver.findElement(By.xpath("(//div[text()='"+i+"'])[1]")).click();
			     Thread.sleep(1000);
			     
			     //Where was your company founded
			     driver.findElement(ApplicationLocatores.company_founded).sendKeys("Pune");
			     Thread.sleep(1000);
			     
			     //Company stage of development
			     WebElement stage_of_development_dropdown=driver.findElement(ApplicationLocatores.stage_of_development);
			     
			     act.click(stage_of_development_dropdown).perform();
			     act.sendKeys(Keys.ARROW_DOWN).perform();
			     act.sendKeys(Keys.ARROW_DOWN).perform();
			     act.sendKeys(Keys.ENTER).perform();
			     Thread.sleep(1000);
			     
			     //Primary Industry/ Sector*
			     driver.findElement(ApplicationLocatores.Primary_Industry).click();
			     Thread.sleep(1000);
			     
			     //Additional Industry/ Sectors
			     
			     driver.findElement(ApplicationLocatores.Diagnostics).click();
			     Thread.sleep(1000);
			     
			     driver.findElement(ApplicationLocatores.Research_Tools).click();
			     Thread.sleep(1000);
			     
			     //Industry Modality
			     
			     driver.findElement(ApplicationLocatores.Small_molecule).click();
			     Thread.sleep(1000);
			     
			     driver.findElement(ApplicationLocatores.Synthetic_biology).click();
			     Thread.sleep(1000);
			     
			     //Funding raised to-date:
			     driver.findElement(ApplicationLocatores.funding).sendKeys("10000");
			     Thread.sleep(1000);
			     
			     //Funding source
			     driver.findElement(ApplicationLocatores.Funding_source).click();
			     Thread.sleep(1000);
			     
			     driver.findElement(ApplicationLocatores.Funding_source_checkbox1).click();
			     Thread.sleep(1000);
			     
			     driver.findElement(ApplicationLocatores.Funding_source_checkbox2).click();
			     Thread.sleep(1000);
			     
			     //Does your company own intellectual property related to your technology?
			     WebElement intellectual_property_dropdown=driver.findElement(ApplicationLocatores.intellectual_property);
			     
			     act.click(intellectual_property_dropdown).perform();
			     act.sendKeys(Keys.ARROW_DOWN).perform();
			     act.sendKeys(Keys.ARROW_DOWN).perform();
			     act.sendKeys(Keys.ENTER).perform();
			     Thread.sleep(1000);
			     
			     //Are your leadership team, IP, or publications affiliated with an institutional technology transfer office or tech venture office
			     WebElement leadership_team_dropdown=driver.findElement(ApplicationLocatores.leadership_team);
			     
			     act.click(leadership_team_dropdown).perform();
			     act.sendKeys(Keys.ARROW_DOWN).perform();
			     act.sendKeys(Keys.ENTER).perform();
			     Thread.sleep(1000);
			     
			     //Institution(s)*
			     driver.findElement(ApplicationLocatores.Institution).sendKeys("200");
			     Thread.sleep(2000);
			     
			     //How many full-time employees (Residents) do you expect to have on site to start?*
			     driver.findElement(ApplicationLocatores.full_time_employees).sendKeys("20");
			     Thread.sleep(2000);
			     
			     //How many full-time employees do you expect to have on site in 6-12 months?
			     driver.findElement(ApplicationLocatores.full_time_employees_12).sendKeys("15");
			     Thread.sleep(1000);
			     
			     //How many of these full-time Residents will utilize our lab facilities to start?*
			     driver.findElement(ApplicationLocatores.full_time_Residents).sendKeys("18");
			     Thread.sleep(2000);
			     
			     //How many lab staff do you intend to have on site in 6-12 months?*
			     driver.findElement(ApplicationLocatores.lab_staff_12).sendKeys("8");
			     Thread.sleep(1000);
			     
			     //When would you like to join BioLabs
			     
			     WebElement Join_BioLabs_dropdown=driver.findElement(ApplicationLocatores.Join_BioLabs);
			     
			     act.click(Join_BioLabs_dropdown).perform();
			     act.sendKeys(Keys.ARROW_DOWN).perform();
			     act.sendKeys(Keys.ARROW_DOWN).perform();
			     act.sendKeys(Keys.ENTER).perform();
			     Thread.sleep(2000);
			     
			     //What equipment and facilities do you plan to primarily use on site?
			     driver.findElement(ApplicationLocatores.equipment_and_facilities).sendKeys("Test Demo");
			     Thread.sleep(1000);
			     
			     //I agree to the Terms & Agreement
			     driver.findElement(ApplicationLocatores.Terms_and_Agreement).click();
			     
			     
			     //Submit button
			     driver.findElement(By.xpath("//button[@class='btn biolabBtn']")).click();
			     
			     
			     
			     
			     
			     
			     
			    
		   }
}
