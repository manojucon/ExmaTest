package examfor12;

import baseTest.BaseTest;

import com.umasuraj.tutorailsninja.automation.testcases.GFG;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Girls12 extends BaseTest {
    GFG gf = new GFG();
    public String text;
    List<String> integersFound;
    WebDriver driver;
    JavascriptExecutor js ;

    @BeforeClass
    public void setup(){
        ChromeOptions options = new ChromeOptions();
        options.setCapability("browserVersion", "124.0.6367.79");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Manoj\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        js = (JavascriptExecutor) driver;

        driver.manage().timeouts().implicitlyWait(900, TimeUnit.SECONDS);
    }

    @AfterClass
    public void cleanup(){
        driver.quit();
    }


    @Test(priority = 1 , dataProvider="testData12Girls",dataProviderClass=testDataFor12Girls.class)
    public void verifyLoginWithValidCredentials(String rollno , String name, String fname) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(900, TimeUnit.SECONDS);

        driver.get(p.getProperty("test12"));

        driver.findElement(By.xpath("//input[@jsname='YPqjbf']")).sendKeys("shahpurkhurdu@gmail.com");
       driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        Thread.sleep(900);

        WebElement sname=driver.findElement(By.xpath("//input[@aria-labelledby='i1']"));//
        // name
        sname.sendKeys(name);
        driver.findElement(By.xpath("//span[text()='Female']")).click();
        WebElement fsname=driver.findElement(By.xpath("//input[@aria-labelledby='i15']"));// fathers name
        fsname.sendKeys(fname);
        Thread.sleep(100);
        List<WebElement> m = driver.findElements(By.xpath("//span[text()='BOO']"));
        Thread.sleep(100);
        m.get(1).click();
        Thread.sleep(100);
        driver.findElement(By.xpath("//input[@aria-labelledby='i23']")).sendKeys("10180401802");
        driver.findElement(By.xpath("//input[@aria-labelledby='i27']")).sendKeys("UHS SHAHPUR KHURD");
        WebElement button=driver.findElement(By.xpath("//label[@for='i35']"));
        js.executeScript("arguments[0].click();", button);
        driver.findElement(By.xpath("//input[@aria-labelledby='i38']")).sendKeys(rollno);     // roll number
        List<WebElement> drop=driver.findElements(By.xpath("//span[text()='Choose']"));
        Thread.sleep(100);
        drop.get(1).click();
        Thread.sleep(100);
        List<WebElement> dropdown=driver.findElements(By.xpath("//span[text()='VAISHALI']"));
        Thread.sleep(100);
        dropdown.get(1).click();
        Thread.sleep(100);
        List<WebElement> next1 = driver.findElements(By.xpath("//div[@jsname='OCpkoe']"));
        Thread.sleep(100);
       next1.get(0).click();


       /*----------------------------------------------------------------*/
        /*ANSWER to the Questions */
     /*   Integer x = Integer.valueOf(rollno);
        if(x>=5 && x<=10){

        }
        else
        {

        }
        if(x>=10 && x<=20){

        }
        else
        {

        }*/

        String first= "Both A and B";
        driver.findElement(By.xpath("//span[text()='"+first+"']")).click();//1

        String second= "All of the above";
        driver.findElement(By.xpath("//span[text()='"+second+"']")).click();
        //2
        String third= "Automation";
        driver.findElement(By.xpath("//span[text()='"+third+"']")).click();      //3

        String fourth= "TRUE";
        List<WebElement> fouropt = driver.findElements(By.xpath("//span[text()='"+fourth+"']"));//4
        fouropt.get(1).click();

        String fifth= "None of the above";
        driver.findElement(By.xpath("//span[text()='"+fifth+"']")).click();    //6

        String sixth= "Uninterruptible Power System";
        driver.findElement(By.xpath("//span[text()='"+sixth+"']")).click();     //7

        String seventh= "Computer network";
        driver.findElement(By.xpath("//span[text()='"+seventh+"']")).click();
        // Multiple Answer
        /*List<WebElement> eightopt = driver.findElements(By.xpath("//span[text()='"+seventh+"']"));
        eightopt.get(1).click();  *///8
        //8
        String eight= "TRUE";
        driver.findElement(By.xpath("//span[text()='"+eight+"']")).click();
        //9
        String ninth= "B. Typing Keys";
        driver.findElement(By.xpath("//span[text()='"+ninth+"']")).click();//10

        String tenth= "Function Keys";
        driver.findElement(By.xpath("//span[text()='"+tenth+"']")).click();//10

        List<WebElement> sub= driver.findElements(By.xpath("//div[@aria-label = 'Submit']"));
        sub.get(0).click();

        driver.navigate().refresh();

    }
}

