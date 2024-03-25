package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Triangle_Classification_Test {
	
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
		      browser.get("https://testpages.eviltester.com/styled/apps/triangle/triangle001.html");
		
	  }
	@Test
	public void Test1() {
   	
		
			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("1");
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("2");
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("3");
	        String initialType = browser.findElement(By.id("triangle-type")).getText();
	        WebElement button = browser.findElement(By.id("identify-triangle-action"));
	        button.click();
	        String actualType = browser.findElement(By.id("triangle-type")).getText();
	        assertEquals("Error: Not a Triangle", actualType);
   }
	@Test
	public void Test2() {
   	
		
			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("2");
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("1");
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("1");
	        String initialType = browser.findElement(By.id("triangle-type")).getText();
	        WebElement button = browser.findElement(By.id("identify-triangle-action"));
	        button.click();
	        String actualType = browser.findElement(By.id("triangle-type")).getText();
	        assertEquals("Error: Not a Triangle", actualType);
   }

	@Test
	public void Test3() {
   	
		
			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("3");
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("6");
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("3");
	        String initialType = browser.findElement(By.id("triangle-type")).getText();
	        WebElement button = browser.findElement(By.id("identify-triangle-action"));
	        button.click();
	        String actualType = browser.findElement(By.id("triangle-type")).getText();
	        assertEquals("Error: Not a Triangle", actualType);
   }
	@Test
	public void Test4() {
   	
		
			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("2");
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("2");
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("4");
	        String initialType = browser.findElement(By.id("triangle-type")).getText();
	        WebElement button = browser.findElement(By.id("identify-triangle-action"));
	        button.click();
	        String actualType = browser.findElement(By.id("triangle-type")).getText();
	        assertEquals("Error: Not a Triangle", actualType);
   }
	@Test
	public void Test5() {
   	
		
			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("2");
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("3");
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("4");
	        String initialType = browser.findElement(By.id("triangle-type")).getText();
	        WebElement button = browser.findElement(By.id("identify-triangle-action"));
	        button.click();
	        String actualType = browser.findElement(By.id("triangle-type")).getText();
	        assertEquals("Scalene", actualType);
   }
	@Test
	public void Test6() {
   	
		
			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("1");
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("3");
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("3");
	        String initialType = browser.findElement(By.id("triangle-type")).getText();
	        WebElement button = browser.findElement(By.id("identify-triangle-action"));
	        button.click();
	        String actualType = browser.findElement(By.id("triangle-type")).getText();
	        assertEquals("Isosceles", actualType);
   }
	@Test
	public void Test7() {
   	
		
			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("5");
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("2");
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("5");
	        String initialType = browser.findElement(By.id("triangle-type")).getText();
	        WebElement button = browser.findElement(By.id("identify-triangle-action"));
	        button.click();
	        String actualType = browser.findElement(By.id("triangle-type")).getText();
	        assertEquals("Isosceles", actualType);
   }
	@Test
	public void Test8() {
   	
		
			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("2");
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("2");
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("1");
	        String initialType = browser.findElement(By.id("triangle-type")).getText();
	        WebElement button = browser.findElement(By.id("identify-triangle-action"));
	        button.click();
	        String actualType = browser.findElement(By.id("triangle-type")).getText();
	        assertEquals("Isosceles", actualType);
   }
	@Test
	public void Test9() {
   	
		
			WebElement textBox = browser.findElement(By.id("side1"));
			textBox.sendKeys("3");
			textBox = browser.findElement(By.id("side2"));
			textBox.sendKeys("3");
			textBox = browser.findElement(By.id("side3"));
			textBox.sendKeys("3");
	        String initialType = browser.findElement(By.id("triangle-type")).getText();
	        WebElement button = browser.findElement(By.id("identify-triangle-action"));
	        button.click();
	        String actualType = browser.findElement(By.id("triangle-type")).getText();
	        assertEquals("Equilateral", actualType);
   }
}
