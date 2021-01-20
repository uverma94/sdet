package testNGTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
   
  WebDriver driver;
	
  @Test
  public void testpage() {
	  String title = driver.getTitle();
	  System.out.println("Title of Page: " + title);
	  Assert.assertEquals("Training Support", title);
	  driver.findElement(By.id("about-link")).click();
	  System.out.println("Page title is: " + driver.getTitle());
	  Assert.assertEquals(driver.getTitle(), "About Training Support");
  }
   
  @BeforeMethod
  public void beforemethod() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\UdayVerma\\Desktop\\SDET\\geckodriver-v0.29.0-win64\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net");
	  //driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
  }
  
  @AfterMethod
  public void aftermethod() {
	  
	  driver.quit();
	  driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	  
  }

}

