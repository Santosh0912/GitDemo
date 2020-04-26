package StepDefinition;

import cucumber.api.java.After;

public class Hooks extends Base {
	
		
	@After
	public void CloseBrowser() {

		driver.close();
		driver=null;
	}

}
