package testNGTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity9 {
	
  WebDriver driver;
  
  @Test(priority=0)
  public void simpleAlertTestCase() {
	  Reporter.log("simpleAlertTestCase() started |");
	  driver.findElement(By.id("simple")).click();
	  Reporter.log("Simple Alert opened |");
	  Alert simpleAlert = driver.switchTo().alert();
	  Reporter.log("Switched foucs to alert |");
	  String alertText = simpleAlert.getText();
	  Reporter.log("Alert text is: " + alertText + " |");
	  Assert.assertEquals("This is a JavaScript Alert!", alertText);
	  simpleAlert.accept();
      Reporter.log("Alert closed");
      Reporter.log("Simple Alert Test case ended |");
  }
  
  @Test(priority=1)
  public void confirmAlertTestCase() {
	  Reporter.log("confirmAlertTestCase() started |");
	  driver.findElement(By.id("confirm")).click();
	  Reporter.log("Confirm Alert opened |");
      Alert confirmAlert = driver.switchTo().alert();
      Reporter.log("Switched foucs to alert |");
      String alertText = confirmAlert.getText();
      Reporter.log("Alert text is: " + alertText + " |");
      Assert.assertEquals("This is a JavaScript Confirmation!", alertText);
      confirmAlert.accept();
      Reporter.log("Alert closed |");  	
      Reporter.log("confrimalert Test case ended |");
  }
  
  @Test(priority=2)
  public void promptAlertTestCase() {
	  Reporter.log("promptAlertTestCase() started |");
	  driver.findElement(By.id("prompt")).click();
	  Reporter.log("Prompt Alert opened |");
	  Alert promptAlert = driver.switchTo().alert();
	  Reporter.log("Switched foucs to alert |");
	  String alertText = promptAlert.getText();
	  Reporter.log("Alert text is: " + alertText + " |");
	  promptAlert.sendKeys("Awesome!");
	  Reporter.log("Text entered in prompt alert |");
      Assert.assertEquals("This is a JavaScript Prompt!", alertText);  	
      promptAlert.accept();
      Reporter.log("Alert closed |");  	
      Reporter.log("Promptalert Test case ended |");
  }
  
  @BeforeTest
  public void beforetest() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\UdayVerma\\Desktop\\SDET\\geckodriver-v0.29.0-win64\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  Reporter.log("Test is Starting --");
	  driver.get("https://www.training-support.net/selenium/javascript-alerts");
	  Reporter.log("Browser is Opened now -- ");
	  Reporter.log("Page title is " + driver.getTitle() + " |");	  
  }
  
  @AfterClass
  public void afterclass() {
	  Reporter.log("Test Case Ended |");
	  driver.close();  
  }
  
  @BeforeMethod
  public void beforemethod() {
	 
	  driver.switchTo().defaultContent();
  }
}
