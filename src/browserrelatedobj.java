import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import junit.framework.TestCase;

import org.openqa.selenium.Keys;
import org.junit.*;


public class  browserrelatedobj extends TestCase {

	//String args="This is the test123";
	public static void main(String[] args){
		// ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY.get
    		// TODO Auto-generated method stub
		/* this i added form the local branchP/
	setup_test();
		//setup_test("erewr");
		}

   @Test
	public static void setup_test() { 
		String j="213132";
		System.out.println(j);
	System.setProperty("webdriver.chrome.driver", "C://Pratuesh_IMP_SOFTWARE//chromedriver.exe" );
		/*ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("window-size=1200x600");*/
		
		WebDriver chrm1 = new ChromeDriver();

	//	WebDriver chrm1 = new ChromeDriver();
		//WebDriver chrm2 = new ChromeDriver();

		 chrm1.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		 chrm1.findElement(By.id("button1")).click();
		 //String s = chrm1.getWindowHandle();
		 
		 //chrm1.manage().window().maximize();
		// chrm2.get("http://www.selenium.com"); 
		//chrm1.findElement(By.id("button1")).click();
		
	/*	Set<String> s1;

		s1= chrm1.getWindowHandles();
		
		String s2;
	    String s3;
		//System.out.println();
		s2=s1.iterator().next();
		s1.iterator().remove();
		System.out.println(s2);
		System.out.println(s1);*/

		//System.out.println(s1.iterator().next().charAt(1));
		//System.out.println(s1.iterator().next());

			//test.sendKeys(Keys.ENTER);
			//chrm1.close();
	     
	   // chrm1.switchTo().window(s);
	    //chrm1.findElement(By.id("e3")).click();
	      //WebElement test = chrm1.findElement(By.name("q"));
			//test.sendKeys("test");
			 //test.click();
			 
	      
		}
}
