package Runner;
	

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.*;


//@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/java/Features"}, 
				plugin = {"pretty","html:target/Feature File Reports",
						  "json:target/cucumber.json"},
						  //"junit:target/cukes.xml"},
						  //"rerun:target/rerun.txt"},
                 glue= {"StepDefinition"},
                 //plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"},
                 monochrome = true)


@Test
public class TestRunner extends AbstractTestNGCucumberTests {	
	
}




