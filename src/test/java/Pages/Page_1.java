package Pages;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@SuppressWarnings("unused")
public class Page_1 {
	WebDriver driver;
	
	
	public Page_1(WebDriver driver) {
		this.driver=driver;
	}
	
	//Next Button
	By NN=By.xpath("//*[@class='flex-next']");
	public void NextButton()
		{
			WebDriverWait wait = new WebDriverWait(driver, 60);
			WebElement NB = wait.until(ExpectedConditions.elementToBeClickable(NN));
			NB.click();
		}
	
	
	//Checking Image1
	By IM1=By.xpath("//*[@alt='2020 predictions']");
	boolean present;
	public void Image1()
	{
		try {
			present=true;
		}catch(NoSuchElementException e){
			present=false;
		}
		
	}
	
	
	
	//Previous Button
	By pb=By.xpath("//*[@class='flex-prev']");	
	public void PreviousButton() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement PB = wait.until(ExpectedConditions.elementToBeClickable(pb));
		PB.click();
	}

	
	
}
