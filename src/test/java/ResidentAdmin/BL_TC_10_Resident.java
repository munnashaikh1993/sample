package ResidentAdmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Browsers.Browser;

public class BL_TC_10_Resident extends Browser {
	
public static void change() throws Exception {
	System.out.println("***************************BL_TC_10_Resident_Admin****************************************");

		//MyCompany
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='My Company']")).click();
		Thread.sleep(2000);



		//Change Request
		driver.findElement(By.xpath("(//a[@class='nav-link font-weight-bold'])[3]")).click();
		Thread.sleep(2000);



		//Create change request
		driver.findElement(By.xpath("//button[text()='CREATE CHANGE REQUEST']")).click();
		Thread.sleep(2000);



		//Members Desired QTY
		driver.findElement(By.xpath("(//input[@formcontrolname='desiredQty'])[1]")).sendKeys("12");
		//Lab Bench
		driver.findElement(By.xpath("(//input[@formcontrolname='desiredQty'])[2]")).sendKeys("15");
		//WorkStation
		driver.findElement(By.xpath("(//input[@formcontrolname='desiredQty'])[3]")).sendKeys("18");
		//Private Office
		driver.findElement(By.xpath("(//input[@formcontrolname='desiredQty'])[4]")).sendKeys("11");
		//Private Lab
		driver.findElement(By.xpath("(//input[@formcontrolname='desiredQty'])[5]")).sendKeys("20");



		//Please briefly describe your request and add any important details :*



		driver.findElement(By.xpath("//textarea[@id='exampleFormControlTextarea1']")).sendKeys("I want to add some more important points");
		Thread.sleep(2000);



		// Desired Effective Change Date:*


		 driver.findElement(By.xpath("//input[@placeholder='DD Mon YYYY']")).sendKeys("12 Jan 2022");
		 Thread.sleep(2000);



		//calender



		selectDate("12", "Jan", "2025");
		}



		//@Test
		public static void selectDate(String exDay, String exMonth, String exYear) throws Exception {




		WebElement calender = driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary fa fa-calendar']"));
		calender.click();
		Thread.sleep(2000);


		// Select Year



		Select year = new Select(driver.findElement(By.xpath("//select[@title='Select year']")));
		year.selectByVisibleText(exYear);
		Thread.sleep(2000);



		// Select Month



		
		Select month = new Select(driver.findElement(By.xpath("//select[@title='Select month']")));
		month.selectByVisibleText(exMonth);
		Thread.sleep(2000);



		// Select Date



		WebElement date = driver.findElement(By.xpath("//div[contains(text(),'12')]"));
		date.click();
		Thread.sleep(2000);




		//Next
		driver.findElement(By.xpath("(//button[text()='Next'])[1]")).click();
		Thread.sleep(2000);



		// Funding raised to-date:*
		driver.findElement(By.xpath("//input[@formcontrolname='funding']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='funding']")).sendKeys("66");
		Thread.sleep(2000);



		// Funding source(checkbox)



		driver.findElement(By.xpath("//button[@class='dropdown-toggle btn']")).click();
		driver.findElement(By.xpath("//label[text()=' Public Company ']")).click(); //checkbox path
		driver.findElement(By.xpath("//button[@class='dropdown-toggle btn']")).click();
		Thread.sleep(2000);



		// Company stage of development:



		driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']")).click();
		WebElement stage_dropdown=driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		Select stage =new Select( stage_dropdown);
		stage.selectByIndex(6);
		driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']")).click();
		Thread.sleep(2000);



		//Total Employees
		driver.findElement(By.xpath("//input[@formcontrolname='companySize']")).clear();
		driver.findElement(By.xpath("//input[@formcontrolname='companySize']")).sendKeys("66");
		Thread.sleep(2000);
		//Next
		driver.findElement(By.xpath("(//button[text()='Next'])[2]")).click();
		Thread.sleep(2000);
		//Back
		driver.findElement(By.xpath("(//button[text()='Back'])[2]")).click();
		Thread.sleep(2000);



		//Next
		driver.findElement(By.xpath("(//button[text()='Next'])[2]")).click();
		Thread.sleep(2000);



		//submit Request



		driver.findElement(By.xpath("//button[text()=' Submit Request ']")).click();
		Thread.sleep(2000);





		//Thank u
		driver.findElement(By.xpath("//a[text()='TAKE ME TO UPDATE MY COMPANY INFORMATION']")).click();
		Thread.sleep(2000);



		//Change req.
		driver.findElement(By.xpath("//a[text()='Change Request']")).click();
		Thread.sleep(2000);



		//Delete
		driver.findElement(By.xpath("//tbody/tr[1]/td[7]/label[2]/li[1]")).click();
		Thread.sleep(2000);
		//Delete popup



		driver.findElement(By.xpath("//button[text()='Cancel request']")).click();
		Thread.sleep(2000);
	
	}

}
