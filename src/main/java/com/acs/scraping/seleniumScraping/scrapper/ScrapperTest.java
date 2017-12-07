/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acs.scraping.seleniumScraping.scrapper;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

/**
 *
 * @author user_2
 */
@Component
public class ScrapperTest {

    static WebDriver driver;
    static Wait<WebDriver> wait;

    public static void testScrapper() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user_2\\Desktop\\chromedriver.exe");
        DesiredCapabilities dc = new DesiredCapabilities();
        driver = new ChromeDriver(dc);

        driver.get("http://bacalaureat.edu.ro/Pages/TaraRezultAlfa.aspx");
        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolderBody_ImageButtonDR1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolderBody_ImageButtonDR1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolderBody_ImageButtonDR1\"]")).click();

//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\user_2\\Desktop\\geckodriver.exe");
//
//        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//        capabilities.setCapability("marionette", true);
//        WebDriver driver = new FirefoxDriver(capabilities);
//        driver.get("http://www.toolsqa.com");
//
//        driver.quit();
    }

}
