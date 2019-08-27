package com.Roopa.GitPractice.simpleEclipseProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestAmazonHome {
	WebDriver driver;
  @Test
  public void testTitle() {
	  String searchFor="backpack";
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchFor);
	  driver.findElement(By.className("nav-input")).click();
	  System.out.println("Our page title is :: "+ driver.getTitle());
	//  assertThat(this.driver.getTitle()).isEqualTo("Confirm Log Out?");
	  Assert.assertTrue(driver.getTitle().contains(searchFor), "Amazon title doesnt contains  BAckpack");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "/Users/sapai/tools/chromedriver");
	  driver =new ChromeDriver();
	  driver.get("https://www.amazon.com");	  
  }

  @AfterMethod
  public void afterMethod() {
  driver.quit();
  }


}
