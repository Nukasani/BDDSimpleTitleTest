package gluecode;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Utility;

public class Stepdef 
{
	Scenario s;
	WebDriver driver;
	Utility ut;
	
	
	@Before
	public void method1(Scenario s)
	{
		this.s=s;
	}
	
   @Given("^launch site using \"(.*)\"$") 
	public void method2(String bn) throws Exception
	{
		ut=new Utility();
		driver=ut.openBrowser(bn);
		ut.launchSite("https://www.google.com.tw/");
		Thread.sleep(5000);
	}
	
	@Then("^title should be \"(.*)\"$")
	public void method3(String et)
	{
		
		String at=driver.getTitle();
		if(et.equalsIgnoreCase(at))
		{
			s.write("Google title test passed");
		}
		else
		{
			s.write("title test failed");
		}
		
	}
	
	@When("^close site$")
	public void method4()
	{
		ut.closeSite();
	}
}
