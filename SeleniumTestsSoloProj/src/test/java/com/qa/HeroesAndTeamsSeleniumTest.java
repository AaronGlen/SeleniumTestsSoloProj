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
    public void openingWebPageTest() throws InterruptedException{
        driver.manage().window().maximize();
        driver.get( "http://35.222.59.218/SoloProject/heros.html");
        Thread.sleep(2000);
    }

    @Test
    public void searchingWebPageTest() throws InterruptedException{
        driver.manage().window().maximize();
        driver.get( "http://35.222.59.218/SoloProject/heros.html");
        Thread.sleep(2000);
        WebElement teamsPage = driver.findElement(By.xpath("/html/body/div/div[1]/button[2]"));
        teamsPage.click();
        Thread.sleep(5000);

    }
    @Test
    public void createHeroTest() throws InterruptedException{
        driver.manage().window().maximize();
        driver.get( "http://35.222.59.218/SoloProject/heros.html");
        Thread.sleep(2000);
        WebElement create = driver.findElement(By.xpath("/html/body/div/div[4]/div/div[1]/button"));
        create.click();
        Thread.sleep(2000);
        WebElement heroName = driver.findElement(By.xpath("//*[@id=\"heroName\"]"));
        heroName.sendKeys("Captain America");
        Thread.sleep(2000);
        WebElement issueOne = driver.findElement(By.xpath("//*[@id=\"issueOne\"]"));
        issueOne.sendKeys("Captain America#1");
        Thread.sleep(2000);
        WebElement description = driver.findElement(By.xpath("//*[@id=\"description\"]"));
        description.sendKeys("super soldier, first avenger");
        Thread.sleep(2000);
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"heroForm\"]/button"));
        submit.click();
        Thread.sleep(5000);


    }

}
