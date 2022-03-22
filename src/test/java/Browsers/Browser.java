package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public static WebDriver driver;
    
	//Chrome Browser
	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	//FireFox Browser
	public static void firefoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}

	//EdgeBrowser
	public static void edgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	}

	//InternetExplorer Browser
	public static void internetexplorerBrowser() {
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
	}
}
