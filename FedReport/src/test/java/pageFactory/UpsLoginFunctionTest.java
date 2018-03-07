package pageFactory;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpsLoginFunctionTest {
	public static void main(String[] args) {
		
		
	 System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe"); 
	               
	 WebDriver driver=new ChromeDriver();

    driver.navigate().to("https://www.ups.com/us/en/Home.page?");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
    driver.findElement(By.xpath(".//*[@id='ups-navItems']/ul[2]/li[1]/a")).click();
    
    driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("Sarower2017");
    
    driver.findElement(By.xpath(".//*[@id='pwd']")).sendKeys("Ttech123$");
    
    driver.findElement(By.xpath(".//*[@id='submitBtn']")).click();


    System.out.println("Test has been Passed by Sumon"); 
    //driver.quit();
	}

}
