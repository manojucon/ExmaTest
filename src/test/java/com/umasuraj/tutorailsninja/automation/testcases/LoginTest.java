package com.umasuraj.tutorailsninja.automation.testcases;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginTest {
    GFG gf=new GFG();
    public String text;
    List<String> integersFound;
    WebDriver driver;
    @Test(priority = 1)
    public void verifyLoginWithValidCredentials() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setCapability("browserVersion", "124.0.6367.79");
         System.setProperty("webdriver.gecko.driver", "C:\\Users\\Manoj\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
         driver= new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        driver.get("https://eshikshakosh.bihar.gov.in/");
        Thread.sleep(100);
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ESCAPE).build().perform();
        driver.findElement(By.xpath("//input[@name='userType']")).click();

        driver.findElement(By.xpath("//input[@placeholder='Enter School UDISE Code']")).sendKeys("10180401801");

        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Esks@4321");


        text = driver.findElement(By.xpath("//label[@class='capcha__head']")).getText();
        String[] arr =text.split(":");
        String sec=arr[1];
       String[] ns=sec.split(" * ");
       String f1=ns[1];
       String f2=ns[3];
       int i1=Integer.parseInt(f1);
       int i2 =Integer.parseInt(f2);
       int num= i1*i2;

        WebElement ele=driver.findElement(By.xpath("//input[@placeholder='Enter User Captcha']"));
        ele.sendKeys( "\"" + num + "\"");
        driver.findElement(By.xpath("//input[@class='submit__btn']")).click();
        Thread.sleep(100);
       //driver.quit();
    }

    @Test(priority = 2)
    public void addStudentsRecord(){
        driver.findElement(By.xpath("//a[@class='ng-star-inserted'][1]")).click();
        driver.findElement(By.xpath("//li[@class='ng-star-inserted active']/a")).click();
        

    }
}
