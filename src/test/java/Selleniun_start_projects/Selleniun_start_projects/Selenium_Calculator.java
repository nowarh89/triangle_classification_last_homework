package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Calculator {
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
		      System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\geckodriver.exe");
		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			  String url="https://testpages.eviltester.com/styled/apps/calculator.html";
		      browser.get(url);
		
	  }
	 
	 @Test
		public void Test_for_plus_1() {
	    	
			
				browser.findElement(By.id("button08")).click();
				browser.findElement(By.id("buttonplus")).click();
				browser.findElement(By.id("button00")).click();
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				
				browser.findElement(By.id("buttonequals")).click();
				System.out.println("hello");
				
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "8";
				assertEquals(Expected,result);
				browser.close();
				
				
}
	 @Test
		public void Test_for_plus2() {
	    	
			
				browser.findElement(By.id("button00")).click();
				browser.findElement(By.id("buttonplus")).click();
				browser.findElement(By.id("button02")).click();
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				
				browser.findElement(By.id("buttonequals")).click();
				System.out.println("hello");
				
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "2";
				assertEquals(Expected,result);
				browser.close();
				
				
}
	 @Test
		public void Test1_for_minus() {
	    	
			
				browser.findElement(By.id("button00")).click();
				browser.findElement(By.id("buttonminus")).click();
				browser.findElement(By.id("button02")).click();
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				
				browser.findElement(By.id("buttonequals")).click();
				
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				String Expected= "-2";
				assertEquals(Expected,result);
				browser.close();
				
				
}
	 @Test
		public void Test2_for_minus() {
	
	
	browser.findElement(By.id("button08")).click();
	browser.findElement(By.id("buttonminus")).click();
	browser.findElement(By.id("button00")).click();
	try {
		  Thread.sleep(1000);
		} catch (InterruptedException e) {
		  Thread.currentThread().interrupt();
		}
	
	browser.findElement(By.id("buttonequals")).click();
	
	String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
	String Expected= "8";
	assertEquals(Expected,result);
	browser.close();
	
	
}
	 @Test
		public void Test1_for_multiply() {
	    	
			
				browser.findElement(By.id("button00")).click();
				browser.findElement(By.id("buttonmultiply")).click();
				browser.findElement(By.id("button09")).click();
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				
				browser.findElement(By.id("buttonmultiply")).click();				
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				String Expected= "0";
				assertEquals(Expected,result);
				browser.close();
				
				
}
	 @Test
		public void Test2_for_multiply() {
	    	
			
				browser.findElement(By.id("button07")).click();
				browser.findElement(By.id("buttonmultiply")).click();
				browser.findElement(By.id("button00")).click();
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				browser.findElement(By.id("buttonmultiply")).click();
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				String Expected= "0";
				assertEquals(Expected,result);
				browser.close();
				
				
}
	 @Test
		public void Test1_for_viding() {
	    	
			
				browser.findElement(By.id("button00")).click();
				browser.findElement(By.id("buttondivide")).click();
				browser.findElement(By.id("button03")).click();
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				
				browser.findElement(By.id("buttonequals")).click();				
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				String Expected= "0";
				assertEquals(Expected,result);
				browser.close();

				
				
}	 
	 @Test
		public void Test2_for_viding() {
	    	
			
				browser.findElement(By.id("button06")).click();
				browser.findElement(By.id("buttondivide")).click();
				browser.findElement(By.id("button00")).click();
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				browser.findElement(By.id("buttonequals")).click();				
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				String Expected= "error";
				assertEquals(Expected,result);
				browser.close();

				
				
}	 
}
