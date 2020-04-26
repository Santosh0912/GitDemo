package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Page_2 {
	WebDriver driver;
	
	
	public Page_2(WebDriver driver) {
		this.driver=driver;
	}
	
		
	//HamBurger Menu
	By Ham=By.xpath("//*[@class='btr bt-bars trigger']");
	public void HamBurgerMenu()
	{
		driver.findElement(Ham).click();
	}

	
	//Contact us
	By Cus=By.xpath("//*[@id='menu-item-65']");
	public void ContactUs()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement PB = wait.until(ExpectedConditions.elementToBeClickable(Cus));
		PB.click();
	}
	
	
	//PwC
	By PWC=By.xpath("//*[text()='PwC']");
	public void PwC()
		{
			String PC=driver.findElement(PWC).getText();
			Assert.assertEquals("PwC",PC);
		}
	
	//Digital Pulse
	By DigitalPlus=By.xpath("//*[text()='Digital Pulse']");
	public void DigitalPlus()
		{
			String DP=driver.findElement(DigitalPlus).getText();
			Assert.assertEquals("Digital Pulse",DP);
		}
	
	
	
	//Careers at
	By CareerAT=By.xpath("//*[text()='Careers at']");
	public void CareerAT()
		{
			String CAT=driver.findElement(CareerAT).getText();
			Assert.assertEquals("Careers at",CAT);
		}
	
	
	
	//General
	By general=By.xpath("//*[text()='General']");
	public void General()
		{
			String Gen=driver.findElement(general).getText();
			Assert.assertEquals("General",Gen);
		}
	
	
}
