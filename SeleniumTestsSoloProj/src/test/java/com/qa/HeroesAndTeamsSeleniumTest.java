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
                "C:\\Users\\aagle\\Documents\\soloProgSeleniumTests\\SeleniumTestsSoloProj\\src\\test\\java\\resources\\chromedriver.exe");
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
    public void changingWebPageTest() throws InterruptedException{
        driver.manage().window().maximize();
        driver.get( "http://35.222.59.218/SoloProject/heros.html");
        Thread.sleep(2000);
        WebElement teamsPage = driver.findElement(By.xpath("/html/body/div/div[1]/button[2]"));
        teamsPage.click();
        Thread.sleep(5000);

    }
    @Test
    public void searchForHeroTest()throws InterruptedException{
        driver.manage().window().maximize();
        driver.get( "http://35.222.59.218/SoloProject/heros.html");
        Thread.sleep(3000);
        WebElement search = driver.findElement(By.xpath("//*[@id=\"nameHero\"]"));
        search.sendKeys("Captain America");
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
    @Test
    public void deleteHeroTest() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get( "http://35.222.59.218/SoloProject/heros.html");
        Thread.sleep(2000);
        WebElement dropBox = driver.findElement(By.xpath("//*[@id=\"deleteHeroId\"]"));
        dropBox.sendKeys("35");
        Thread.sleep(3000);
        WebElement delete = driver.findElement(By.xpath("//*[@id=\"deleteHeroButton\"]"));
        delete.click();
        Thread.sleep(3000);
    }
    @Test
    public void updateHeroTest() throws InterruptedException{
        driver.manage().window().maximize();
        driver.get( "http://35.222.59.218/SoloProject/heros.html");
        Thread.sleep(3000);
        WebElement dropbox = driver.findElement(By.xpath("//*[@id=\"updateHeroId\"]"));
        dropbox.sendKeys("26");
        Thread.sleep(3000);
        WebElement update = driver.findElement(By.xpath("//*[@id=\"heroIdUpdateForm\"]/button"));
        update.click();
        Thread.sleep(3000);
        WebElement heroName = driver.findElement(By.xpath("//*[@id=\"heroNameUpdate\"]"));
        heroName.sendKeys("Captain Britain");
        Thread.sleep(2000);
        WebElement issueOne = driver.findElement(By.xpath("//*[@id=\"issueOneUpdate\"]"));
        issueOne.sendKeys("Captain Britain#1");
        Thread.sleep(2000);
        WebElement description = driver.findElement(By.xpath("//*[@id=\"descriptionUpdate\"]"));
        description.sendKeys("magic soldier, british hero");
        Thread.sleep(2000);
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"heroUpdateForm\"]/button"));
        submit.click();
        Thread.sleep(5000);
    }

    @Test
    public void searchForTeamTest()throws InterruptedException{
        driver.manage().window().maximize();
        driver.get( "http://35.222.59.218/SoloProject/teams.html");
        Thread.sleep(3000);
        WebElement search = driver.findElement(By.xpath("//*[@id=\"nameTeam\"]"));
        search.sendKeys("West");
        Thread.sleep(5000);

    }
    @Test
    public void createTeamTest() throws InterruptedException{
        driver.manage().window().maximize();
        driver.get( "http://35.222.59.218/SoloProject/teams.html");
        Thread.sleep(2000);
        WebElement create = driver.findElement(By.xpath("/html/body/div/div[4]/div/div[1]/button"));
        create.click();
        Thread.sleep(2000);
        WebElement teamName = driver.findElement(By.xpath("//*[@id=\"teamName\"]"));
        teamName.sendKeys("fantastic four");
        Thread.sleep(2000);
        WebElement issueOne = driver.findElement(By.xpath("//*[@id=\"issueOne\"]"));
        issueOne.sendKeys("ff#1");
        Thread.sleep(2000);
        WebElement description = driver.findElement(By.xpath("//*[@id=\"description\"]"));
        description.sendKeys("marvels first family");
        Thread.sleep(2000);
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"teamForm\"]/button"));
        submit.click();
        Thread.sleep(5000);
    }
    @Test
    public void deleteTeamTest() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get( "http://35.222.59.218/SoloProject/teams.html");
        Thread.sleep(2000);
        WebElement dropBox = driver.findElement(By.xpath("//*[@id=\"deleteTeamId\"]"));
        dropBox.sendKeys("8");
        Thread.sleep(3000);
        WebElement delete = driver.findElement(By.xpath("//*[@id=\"deleteTeamButton\"]"));
        delete.click();
        Thread.sleep(3000);
    }
    @Test
    public void updateTeamTest() throws InterruptedException{
        driver.manage().window().maximize();
        driver.get( "http://35.222.59.218/SoloProject/teams.html");
        Thread.sleep(3000);
        WebElement dropbox = driver.findElement(By.xpath("//*[@id=\"updateTeamId\"]"));
        dropbox.sendKeys("10");
        Thread.sleep(3000);
        WebElement update = driver.findElement(By.xpath("//*[@id=\"teamIdUpdateForm\"]/button"));
        update.click();
        Thread.sleep(3000);
        WebElement teamName = driver.findElement(By.xpath("//*[@id=\"teamNameUpdate\"]"));
        teamName.sendKeys("future foundation");
        Thread.sleep(2000);
        WebElement issueOne = driver.findElement(By.xpath("//*[@id=\"issueOneUpdate\"]"));
        issueOne.sendKeys("futuref#1");
        Thread.sleep(2000);
        WebElement description = driver.findElement(By.xpath("//*[@id=\"descriptionUpdate\"]"));
        description.sendKeys("team of scientists");
        Thread.sleep(2000);
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"teamEditForm\"]/button"));
        submit.click();
        Thread.sleep(5000);
    }

}
