package StepDefinition;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

//import java.util.logging.Logger;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import Pages.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Test_1 extends Base{
	
	public static WebDriver driver;
	
	private static Logger logger = Logger.getLogger(Test_1.class);
	
	
	Date now = new Date();	
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd_MMMM_yyyy - hh-mm-ss aa");
	String FolderName = dateFormat.format(now);	        
	File dir = new File(".\\Screenshots\\"+FolderName+"_PWC");
	
	
	Page_1 P1;
	Page_2 P2;
	Page_3 P3;

	@Given("^I navigate to the PwC Digital Pulse website$")
	public void i_navigate_to_the_PwC_Digital_Pulse_website() throws Throwable 
	{
		dir.mkdir();
		
		//Get the driver from BaseClass
		driver=Base.getdriver();
		
		//driver.get("https://www.digitalpulse.pwc.com.au");
		logger.info("Website opened successfully");
		
		
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File source=ts.getScreenshotAs(OutputType.FILE);    
	    FileHandler.copy(source,new File(dir+"\\Page_1.jpeg"));
	    System.out.println("Making changes by Person 1.1");
	}


	@Then("^I am presented with a carousel displaying (\\d+) featured articles$")
	public void i_am_presented_with_a_carousel_displaying_featured_articles(int arg1) throws Throwable {
		P1=new Page_1(driver);	
		P1.Image1();
		logger.info("Checking Carousel is dispalyed");
		
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File source=ts.getScreenshotAs(OutputType.FILE);    
	    FileHandler.copy(source,new File(dir+"\\Page_2.jpeg"));
	    System.out.println("Making changes by Person 1.2");
		
	}

		
	@Given("^Clicking the 'Next' button on the carousel will load the next_featured articles$")
	public void clicking_the_Next_button_on_the_carousel_will_load_the_next_featured_articles() throws Throwable {
		P1=new Page_1(driver);	
		P1.NextButton();
		logger.info("Clicked on 'Next' button/link");
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File source=ts.getScreenshotAs(OutputType.FILE);    
	    FileHandler.copy(source,new File(dir+"\\Page_3.jpeg"));
	    System.out.println("Making changes by Person 1.3");
	}

	@Given("^Clicking the 'Previous' button on the carousel will load the previous_featured articles$")
	public void clicking_the_Previous_button_on_the_carousel_will_load_the_previous_featured_articles() throws Throwable {
		P1=new Page_1(driver);	
		P1.PreviousButton();
		logger.info("Clicked on 'Previous' button/link");
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File source=ts.getScreenshotAs(OutputType.FILE);    
	    FileHandler.copy(source,new File(dir+"\\Page_4.jpeg"));
	    System.out.println("Making changes by Person 1.4");
	}
	
	@When("^I am viewing the 'Home' page$")
	public void i_am_viewing_the_Home_page() throws Throwable {
		System.out.println("Making changes by Person 1.5");
	}

	
	@When("^I select 'Contact us' from the hamburger menu$")
	public void i_select_Contact_us_from_the_hamburger_menu() throws Throwable {
		P2=new Page_2(driver);
		P2.HamBurgerMenu();
		logger.info("Clicked on 'HamBurger' Menu");
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File source=ts.getScreenshotAs(OutputType.FILE);    
	    FileHandler.copy(source,new File(dir+"\\Page_5.jpeg"));
		P2.ContactUs();
		logger.info("Clicked on 'Contact us' Menu");
		System.out.println("Making changes by Person 1.6");
	}

	@Then("^I am taken to the 'Contact us' page$")
	public void i_am_taken_to_the_Contact_us_page() throws Throwable {
		P2.PwC();
		P2.DigitalPlus();
		P2.CareerAT();
		P2.General();
		logger.info("Checking 'PWC','Digital Plus','CareerAT','General' Tabs");
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File source=ts.getScreenshotAs(OutputType.FILE);    
	    FileHandler.copy(source,new File(dir+"\\Page_6.jpeg"));
	    System.out.println("Making changes by Person 1.7");

	}

	@Then("^I am presented with the below options for contacts$")
	public void i_am_presented_with_the_below_options_for_contacts() throws Throwable {
		System.out.println("Making changes by Person 1.8");
	}
	
	
	
	@When("^I click on the 'Magnifying glass' icon to perform a search$")
	public void i_click_on_the_Magnifying_glass_icon_to_perform_a_search() throws Throwable {
		P3=new Page_3(driver);
		P3.MagnifyingGlass();
		logger.info("Clicked on 'Magnifying glass' Menu");
		System.out.println("Making changes by Person 1.9");
	}

	@When("^I enter the text 'Single page applications' in \"([^\"]*)\"$")
	public void i_enter_the_text_Single_page_applications_in(String text1) throws Throwable {
		P3.ContactUs(text1);
		logger.info("Enter 'Single Page Applications' in text box");
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File source=ts.getScreenshotAs(OutputType.FILE);    
	    FileHandler.copy(source,new File(dir+"\\Page_7.jpeg"));
	    System.out.println("Making changes by Person 2.0");
	}
	
	
	@When("^I submit the search$")
	public void i_submit_the_search() throws Throwable {
		System.out.println("Making changes by Person 2.1");
	}

	@Then("^I am taken to the search results page$")
	public void i_am_taken_to_the_search_results_page() throws Throwable {
		System.out.println("Making changes by Person 2.2");
	}

	@Then("^I am presented with at least one search result$")
	public void i_am_presented_with_at_least_one_search_result() throws Throwable {
		P3.SearchResults();
	    TakesScreenshot ts=(TakesScreenshot)driver;
	    File source=ts.getScreenshotAs(OutputType.FILE);    
	    FileHandler.copy(source,new File(dir+"\\Page_8.jpeg"));
		logger.info("Checking Search results");
		System.out.println("Making changes by Person 2.3");
	}
	

}
