package Testing_Project.Maven_Testing_Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class TestClassNew {
 
	WebDriver driver;
	
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver", "C:\\selenium3.0.1\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("http://www.google.com");
	  
  }

  @Test
  public void SignUpLink() {
	  WebElement ele = driver.findElement(By.id("gb_70"));
	  ele.click();
  }
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
}