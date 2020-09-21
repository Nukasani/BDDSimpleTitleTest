package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility 
{
	
		public WebDriver driver;
		
		public WebDriver openBrowser(String bn)
		{
			if(bn.equalsIgnoreCase("chrome"))
			{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			}
			return(driver);
			
		}
		
		public void launchSite(String x)
		{
			driver.get(x);
		}
		
		public void closeSite()
		{
			driver.close();
		}

	}


