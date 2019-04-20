package testNGTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample123 {
static WebDriver driver;
		  @BeforeMethod
		  public void LaunchBrowser(){
		  	System.setProperty("webdriver.chrome.driver", "C://Users/USER/Downloads/chromedriver.exe");
		  	driver = new ChromeDriver();
		  	driver.manage().window().maximize();
		  	System.out.println("Browser Launched - Passed");
		  }
		  @AfterMethod
		  public void CloseBrowser(){
		  driver.close();
		  }
	  @Test(priority = 1)
	  public void VerifyGoogleTitle(){
	  driver.get("https://www.google.com");
	  Assert.assertEquals("Google", driver.getTitle());
	  }
	  @Test(priority = 2)
	  public void VerifyYahooTitle(){
	  driver.get("https://in.yahoo.com");	
	  Assert.assertEquals("Yahoo", driver.getTitle());
	  }
	  @Test(priority = 3)
	  public void VerifyBankofAmericaTitle(){
	  	driver.get("https://www.bankofamerica.com/");	
	      Assert.assertEquals("Bank of America - Banking, Credit Cards, Home Loans and Auto Loans", driver.getTitle());	
	  }

	  }

