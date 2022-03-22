package Sponsor;
import org.openqa.selenium.By;

public class locators {

	//Click on search field
	public static By search= By.xpath("//input[@type='search']");
	
	//click on select an industry
	public static By industry = By.xpath("//label[text()=' Digital Health ']/..//input[@type='checkbox']");
	
	//click on search button
	public static By search_button = By.xpath("(//button[@class='btn biolabBtn search-btn'])");
	
	//select diagonistics/biomakers
	public static By biomakers = By.xpath("//label[text()=' Diagnostics/Biomarkers ']/..//input[@type='checkbox']");

	//select a Modality(Antibody)
	public static By Antibody = By.xpath("//label[text()=' Antibody ']/..//input[@type='checkbox']");
	
	//select a Modality(Drug Delivery)
	public static By Drug = By.xpath("(//input[@class='form-check-input ng-untouched ng-pristine ng-valid'])[5]");

	//select a Modality(gene therapy)
		public static By Gene = By.xpath("//label[text()=' Gene therapy ']/..//input[@type='checkbox']");



}
