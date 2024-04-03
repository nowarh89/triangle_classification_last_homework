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
	    	
			
				browser.findElement(By.id("button01")).click();
				browser.findElement(By.id("buttonplus")).click();
				browser.findElement(By.id("button02")).click();
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				
				browser.findElement(By.id("buttonequals")).click();
				
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "3";
				assertEquals(Expected,result);
				browser.close();
				
				
} @Test
		public void Test_for_plus2() {
	
    browser.findElement(By.id("button03")).click();
	browser.findElement(By.id("buttonplus")).click();
		browser.findElement(By.id("button04")).click();


	try {
		  Thread.sleep(1000);
		} catch (InterruptedException e) {
		  Thread.currentThread().interrupt();
		}
	
	browser.findElement(By.id("buttonequals")).click();
	
	String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
	System.out.println(result);	
	String Expected= "7";
	assertEquals(Expected,result);
	browser.close();
	
	
}
	 @Test
		public void Test_for_plus3() {
	    	
			
				browser.findElement(By.id("button05")).click();
				browser.findElement(By.id("buttonplus")).click();
				browser.findElement(By.id("button00")).click();
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				
				browser.findElement(By.id("buttonequals")).click();
				
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "5";
				assertEquals(Expected,result);
				browser.close();
				
				
}
	 
	 @Test
		public void Test_for_plus4() {
	    	
			
				browser.findElement(By.id("button00")).click();
				browser.findElement(By.id("buttonplus")).click();
				browser.findElement(By.id("button09")).click();
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				
				browser.findElement(By.id("buttonequals")).click();
				
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "9";
				assertEquals(Expected,result);
				browser.close();
				
				
}
	 
	 
	
	 @Test
		public void Test_for_plus5() {
	    	
		        browser.findElement(By.id("button00")).click();
				browser.findElement(By.id("buttonplus")).click();
					browser.findElement(By.id("button00")).click();


				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				
				browser.findElement(By.id("buttonequals")).click();
				
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "0";
				assertEquals(Expected,result);
				browser.close();
				
				
}
	 @Test
		public void Test_for_minus_1() {
	
	
	browser.findElement(By.id("button02")).click();
	browser.findElement(By.id("buttonminus")).click();
	browser.findElement(By.id("button04")).click();
	try {
		  Thread.sleep(1000);
		} catch (InterruptedException e) {
		  Thread.currentThread().interrupt();
		}
	
	browser.findElement(By.id("buttonequals")).click();
	
	String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
	System.out.println(result);	
	String Expected= "-2";
	assertEquals(Expected,result);
	browser.close();
	
	
}
		 @Test
			public void Test_for_minus_2() {
		
		
		browser.findElement(By.id("button06")).click();
		browser.findElement(By.id("buttonminus")).click();
		browser.findElement(By.id("button04")).click();
		try {
			  Thread.sleep(1000);
			} catch (InterruptedException e) {
			  Thread.currentThread().interrupt();
			}
		
		browser.findElement(By.id("buttonequals")).click();
		
		String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);	
		String Expected= "2";
		assertEquals(Expected,result);
		browser.close();
		
		
	}
@Test
public void Test_for_minus3() {


	browser.findElement(By.id("button06")).click();
	browser.findElement(By.id("buttonminus")).click();
	browser.findElement(By.id("button00")).click();
	try {
		  Thread.sleep(1000);
		} catch (InterruptedException e) {
		  Thread.currentThread().interrupt();
		}
	
	browser.findElement(By.id("buttonequals")).click();
	
	String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
	System.out.println(result);	
	String Expected= "6";
	assertEquals(Expected,result);
	browser.close();
	
	
}
@Test
public void Test_for_minus4() {


	browser.findElement(By.id("button00")).click();
	browser.findElement(By.id("buttonminus")).click();
	browser.findElement(By.id("button03")).click();
	try {
		  Thread.sleep(1000);
		} catch (InterruptedException e) {
		  Thread.currentThread().interrupt();
		}
	
	browser.findElement(By.id("buttonequals")).click();
	
	String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
	System.out.println(result);	
	String Expected= "-3";
	assertEquals(Expected,result);
	browser.close();
	
	
}


@Test
public void Test_for_minus5() {

    browser.findElement(By.id("button00")).click();
	browser.findElement(By.id("buttonminus")).click();
		browser.findElement(By.id("button00")).click();


	try {
		  Thread.sleep(1000);
		} catch (InterruptedException e) {
		  Thread.currentThread().interrupt();
		}
	
	browser.findElement(By.id("buttonequals")).click();
	
	String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
	System.out.println(result);	
	String Expected= "0";
	assertEquals(Expected,result);
	browser.close();
	
	
}



@Test
public void Test_for_multiply_1() {


browser.findElement(By.id("button02")).click();
browser.findElement(By.id("buttonmultiply")).click();
browser.findElement(By.id("button09")).click();
try {
  Thread.sleep(1000);
} catch (InterruptedException e) {
  Thread.currentThread().interrupt();
}

browser.findElement(By.id("buttonequals")).click();

String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
System.out.println(result);	
String Expected= "18";
assertEquals(Expected,result);
browser.close();


}
@Test
public void Test_for_multiply_2() {


browser.findElement(By.id("button03")).click();
browser.findElement(By.id("buttonmultiply")).click();
browser.findElement(By.id("button07")).click();
try {
  Thread.sleep(1000);
} catch (InterruptedException e) {
  Thread.currentThread().interrupt();
}

browser.findElement(By.id("buttonequals")).click();

String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
System.out.println(result);	
String Expected= "21";
assertEquals(Expected,result);
browser.close();


}
@Test
public void Test_for_multiply3() {


browser.findElement(By.id("button04")).click();
browser.findElement(By.id("buttonmultiply")).click();
browser.findElement(By.id("button00")).click();
try {
  Thread.sleep(1000);
} catch (InterruptedException e) {
  Thread.currentThread().interrupt();
}

browser.findElement(By.id("buttonequals")).click();

String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
System.out.println(result);	
String Expected= "0";
assertEquals(Expected,result);
browser.close();


}
@Test
public void Test_for_multipy4() {


browser.findElement(By.id("button00")).click();
browser.findElement(By.id("buttonmultiply")).click();
browser.findElement(By.id("button06")).click();
try {
  Thread.sleep(1000);
} catch (InterruptedException e) {
  Thread.currentThread().interrupt();
}

browser.findElement(By.id("buttonequals")).click();

String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
System.out.println(result);	
String Expected= "0";
assertEquals(Expected,result);
browser.close();


}


@Test
public void Test_for_multiply5() {

browser.findElement(By.id("button00")).click();
browser.findElement(By.id("buttonmultiply")).click();
browser.findElement(By.id("button00")).click();


try {
  Thread.sleep(1000);
} catch (InterruptedException e) {
  Thread.currentThread().interrupt();
}

browser.findElement(By.id("buttonequals")).click();

String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
System.out.println(result);	
String Expected= "0";
assertEquals(Expected,result);
browser.close();


}


@Test
public void Test_for_divide_1() {


browser.findElement(By.id("button02")).click();
browser.findElement(By.id("buttondivide")).click();
browser.findElement(By.id("button04")).click();
try {
  Thread.sleep(1000);
} catch (InterruptedException e) {
  Thread.currentThread().interrupt();
}

browser.findElement(By.id("buttonequals")).click();

String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
System.out.println(result);	
String Expected= "0.5";
assertEquals(Expected,result);
browser.close();


}@Test
public void Test_for_divide_2() {


browser.findElement(By.id("button08")).click();
browser.findElement(By.id("buttondivide")).click();
browser.findElement(By.id("button04")).click();
try {
  Thread.sleep(1000);
} catch (InterruptedException e) {
  Thread.currentThread().interrupt();
}

browser.findElement(By.id("buttonequals")).click();

String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
System.out.println(result);	
String Expected= "2";
assertEquals(Expected,result);
browser.close();


}
@Test
public void Test_for_divide3() {


browser.findElement(By.id("button04")).click();
browser.findElement(By.id("buttondivide")).click();
browser.findElement(By.id("button00")).click();
try {
  Thread.sleep(1000);
} catch (InterruptedException e) {
  Thread.currentThread().interrupt();
}

browser.findElement(By.id("buttonequals")).click();

String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
System.out.println(result);	
String Expected= "error";
assertEquals(Expected,result);
browser.close();


}
@Test
public void Test_for_divide4() {


browser.findElement(By.id("button00")).click();
browser.findElement(By.id("buttondivide")).click();
browser.findElement(By.id("button07")).click();
try {
  Thread.sleep(1000);
} catch (InterruptedException e) {
  Thread.currentThread().interrupt();
}

browser.findElement(By.id("buttonequals")).click();

String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
System.out.println(result);	
String Expected= "0";
assertEquals(Expected,result);
browser.close();


}
@Test
public void Test_for_divide5() {

browser.findElement(By.id("button00")).click();
browser.findElement(By.id("buttondivide")).click();
browser.findElement(By.id("button00")).click();


try {
  Thread.sleep(1000);
} catch (InterruptedException e) {
  Thread.currentThread().interrupt();
}

browser.findElement(By.id("buttonequals")).click();

String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
System.out.println(result);	
String Expected= "NaN";
assertEquals(Expected,result);
browser.close();


}

	  
}
