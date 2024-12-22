package com.avi.Selenium_2212_1745;

//import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class LaunchBrowser {

    /**
     * Rigorous Test :-)
     */
	@Test
    public void shouldAnswerWithTrue() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getTitle(), "Go1ogle");
        Thread.sleep(2000);
        driver.quit();
        	
    }
}
