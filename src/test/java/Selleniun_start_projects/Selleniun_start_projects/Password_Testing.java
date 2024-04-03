package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertEquals;


public class Password_Testing {

	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
		      browser.get("https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html");
		
	  }
	 @Test
		public void Test_succesful_password() {
	   	
			    //in case of succesful passwords
				WebElement textBox = browser.findElement(By.name("characters"));
				textBox.sendKeys("Nowa123");
		        WebElement button = browser.findElement(By.name("validate"));
		        button.click();
		        String actualResult = browser.findElement(By.name("validation_message")).getAttribute("value");
		        assertEquals("Valid Value", actualResult);
	   }@Test
		public void correct_password() {
		   	
		    //in case of password have less than 7 elements
			WebElement textBox = browser.findElement(By.name("characters"));
			textBox.sendKeys("Mhm12*");
	        WebElement button = browser.findElement(By.name("validate"));
	        button.click();
	        String actualResult = browser.findElement(By.name("validation_message")).getAttribute("value");
	        assertEquals("Invalid Value", actualResult);
	        browser.close();

  }
	@Test
	public void correct_password2() {
  	
		    //in case of password have more than 7 elements
			WebElement textBox = browser.findElement(By.name("characters"));
			textBox.sendKeys("Nowarh10");
	        WebElement button = browser.findElement(By.name("validate"));
	        button.click();
	        String actualResult = browser.findElement(By.name("validation_message")).getAttribute("value");
	        assertEquals("Invalid Value", actualResult);
	        browser.close();

  }
	@Test
	public void test4() {
   	//במקרה של אותיות לא מתאימות
			WebElement textBox = browser.findElement(By.name("characters"));
			textBox.sendKeys("Nowar1!)");
	        WebElement button = browser.findElement(By.name("validate"));
	        button.click();
	        String actualResult = browser.findElement(By.name("validation_message")).getAttribute("value");
	        assertEquals("Invalid Value", actualResult);
	        browser.close();
   }
	@Test
	public void test5() {
	   	//במקרה של אותיות לא מתאימות
			WebElement textBox = browser.findElement(By.name("characters"));
			textBox.sendKeys("Lkgg%11");
	        WebElement button = browser.findElement(By.name("validate"));
	        button.click();
	        String actualResult = browser.findElement(By.name("validation_message")).getAttribute("value");
	        assertEquals("Invalid Value", actualResult);
	        browser.close();

   }
	@Test
	public void test6() {
	   	//במקרה של אותיות לא מתאימות
			WebElement textBox = browser.findElement(By.name("characters"));
			textBox.sendKeys("@@ahmad");
	        WebElement button = browser.findElement(By.name("validate"));
	        button.click();
	        String actualResult = browser.findElement(By.name("validation_message")).getAttribute("value");
	        assertEquals("Invalid Value", actualResult);
	        browser.close();

   }
}
