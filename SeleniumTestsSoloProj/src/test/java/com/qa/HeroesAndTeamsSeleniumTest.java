package com.qa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Beta;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeroesAndTeamsSeleniumTest {
    private ChromeDriver driver;

    @Before
    public void setUp(){
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\Admin\\Documents\\SoloProj\\seleniumTests\\SeleniumTestsSoloProj\\src\\test\\java\\resources\\chromedriver.exe");
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
    public void switchingWebPage() throws InterruptedException{
        driver.manage().window().maximize();
        driver.get( "http://35.222.59.218/SoloProject/heros.html");
        Thread.sleep(2000);
        WebElement showMessage = driver.findElement(By.xpath("/html/body/div/div[1]/button[2]"));
        showMessage.click();
        Thread.sleep(5000);

    }

}
