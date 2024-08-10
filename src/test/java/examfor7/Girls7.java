package examfor7;

import com.umasuraj.tutorailsninja.automation.testcases.GFG;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Girls7 {
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


    @Test(priority = 1 , dataProvider="testData7Girls",dataProviderClass= testDataFor7Girls.class)
    public void verifyLoginWithValidCredentials(String rollno , String name, String fname) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(900, TimeUnit.SECONDS);

        driver.get("https://forms.gle/mSauseVEGTZ8WCnm8");

        driver.findElement(By.xpath("//input[@jsname='YPqjbf']")).sendKeys("shahpurkhurdu@gmail.com");
       driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        Thread.sleep(900);

        WebElement sname=driver.findElement(By.xpath("//input[@aria-labelledby='i1']"));//
        // name
        sname.sendKeys(name);
        driver.findElement(By.xpath("//span[@class ='aDTYNe snByac OvPDhc OIC90c']")).click();
        WebElement fsname=driver.findElement(By.xpath("//input[@aria-labelledby='i15']"));// fathers name
        fsname.sendKeys(fname);
        Thread.sleep(100);
        List<WebElement> m = driver.findElements(By.xpath("//span[text()='BOO']"));
        Thread.sleep(100);
        m.get(1).click();
        Thread.sleep(100);
        driver.findElement(By.xpath("//input[@aria-labelledby='i23']")).sendKeys("10180401801");
        driver.findElement(By.xpath("//input[@aria-labelledby='i27']")).sendKeys("UMS SHAHPUR KHURD");
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

        driver.findElement(By.xpath("//span[text()='Microphone']")).click();   //1

        driver.findElement(By.xpath("//span[text()='Operating system']")).click();  //2

        driver.findElement(By.xpath("//span[text()='10111']")).click();      //3

        driver.findElement(By.xpath("//span[text()='2']")).click();//4


        driver.findElement(By.xpath("//span[text()='Universal Automatic Computers']")).click();    //5

        driver.findElement(By.xpath("//span[text()='Machine language']")).click();    //6

        driver.findElement(By.xpath("//span[text()='Trobleshooting']")).click();     //7

        driver.findElement(By.xpath("//span[text()='way a computer operator works.']")).click();
        //8
        //8
        driver.findElement(By.xpath("//span[text()='Ctrl + X']")).click();
        //9
        driver.findElement(By.xpath("//span[text()='Alt + Tab']")).click();//10

        List<WebElement> sub= driver.findElements(By.xpath("//div[@aria-label = 'Submit']"));
        sub.get(0).click();
        driver.navigate().refresh();














    }
}

