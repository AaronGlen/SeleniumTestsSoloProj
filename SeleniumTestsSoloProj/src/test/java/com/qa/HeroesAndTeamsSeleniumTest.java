package com.qa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Beta;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeroesAndTeamsSeleniumTest {
    private ChromeDriver driver;

    @Before
    public void setUp(){
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\aagle\\Documents\\soloproj\\SeleniumTestsSoloProj\\src\\test\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void openingWebPage() throws InterruptedException{
        driver.manage().window().maximize();
        driver.get( "http://35.222.59.218/SoloProject/heros.html");
        Thread.sleep(2000);
    }

    @Test
    public void searchingWebPage() throws InterruptedException{
        driver.manage().window().maximize();
        driver.get( "http://35.222.59.218/SoloProject/heros.html");
        Thread.sleep(2000);

    }

}
