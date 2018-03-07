package com.usa.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UpsLoginFunctionality {
	
	WebDriver driver;
	
	@Given("^user able to open browser$")
	public void user_able_to_open_browser() throws Throwable {
		driver=new FirefoxDriver();
	   
	}

	@Given("^go to UPS home page$")
	public void go_to_UPS_home_page() throws Throwable {

		 driver.navigate().to("https://www.ups.com/us/en/Home.page?");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@When("^user navigate to login button link$")
	public void user_navigate_to_login_button_link() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='ups-navItems']/ul[2]/li[1]/a")).click();
	}

	@When("^User able to put valid user name-Sarower(\\d+)$")
	public void user_able_to_put_valid_user_name_Sarower(int arg1) throws Throwable {
		 driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("Sarower2017");
	}

	@When("^User able to put valid password- Ttech(\\d+)\\$$")
	public void user_able_to_put_valid_password_Ttech_$(int arg1) throws Throwable {
		driver.findElement(By.xpath(".//*[@id='pwd']")).sendKeys("Ttech123$");
	}

	@Then("^Login successfully$")
	public void login_successfully() throws Throwable {
		
		 driver.findElement(By.xpath(".//*[@id='submitBtn']")).click();
		 System.out.println("Test has been Passed");  
	}


}
