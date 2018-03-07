package com.usa.fblogintest.sum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FbLoginFunctionalityTest {

	public static void main(String[] args) {



System.setProperty("webdriver.chrome.driver", 
               "./Driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
		
		
		driver.navigate().to("https://www.facebook.com/");

	}

}
