package testRunner;

import cucumber.api.CucumberOptions;

@CucumberOptions(
		
		plugin= {"pretty","html:target/cucumber", "json:target/cucumber.json"},
	
	
		features= {"src/test/resources/upsLogin.feature/LoginFunctionTest.feature"},
		glue= {"com.usa.stepdef"}
				
		)

public class TestNGRunner extends AbstractTestNGCucumberTests{
	

}
