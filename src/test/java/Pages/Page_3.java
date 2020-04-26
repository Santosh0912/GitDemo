package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Page_3 {
	WebDriver driver;
	
	
	public Page_3(WebDriver driver) {
		this.driver=driver;
	}
	
		
	//Magnifying Glass
	By MG=By.xpath("//*[@class='btr bt-search']");
	public void MagnifyingGlass()
	{
		driver.findElement(MG).click();
	}

	
	//Search
	By search=By.id("search-input");
	public void ContactUs(String T1)
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement PB = wait.until(ExpectedConditions.elementToBeClickable(search));
		PB.sendKeys(T1);
		PB.sendKeys(Keys.ENTER);

	}
	
	By SearchResults=By.xpath("//*[@class='row inner']/div");
	public void SearchResults()
	{
		int count=driver.findElements(SearchResults).size();	
		
		if (count>=1){
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
	
	
	
}
