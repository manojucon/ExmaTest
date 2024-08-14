package examfor6;

import baseTest.AnswerTest;
import baseTest.BaseTest;
import com.umasuraj.tutorailsninja.automation.testcases.GFG;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Boys6 extends BaseTest {

    GFG gf = new GFG();
    public String text;
    List<String> integersFound;
    WebDriver driver;
    JavascriptExecutor js;
    AnswerTest test6;

    @BeforeClass
    public void setup(){
        ChromeOptions options = new ChromeOptions();
        options.setCapability("browserVersion", "124.0.6367.79");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Manoj\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        js = (JavascriptExecutor) driver;

        driver.manage().timeouts().implicitlyWait(900, TimeUnit.SECONDS);
        test6 = new AnswerTest();
        test6.propertiesSetup();
    }

    @Test(priority = 1 , dataProvider="testData6Boys",dataProviderClass= testdata6boys.class)
    public void verifyLoginWithValidCredentials(String rollno , String name, String fname) throws InterruptedException {
        driver.get(p.getProperty("test6"));
        Thread.sleep(400);
        driver.findElement(By.xpath("//input[@jsname='YPqjbf']")).sendKeys("shahpurkhurdu@gmail.com");
        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        Thread.sleep(400);
        driver.findElement(By.xpath("//input[@aria-labelledby='i1']")).isEnabled();
        Thread.sleep(800);
        WebElement sname=driver.findElement(By.xpath("//input[@aria-labelledby='i1']"));//
        // name
        sname.sendKeys(name);
        driver.findElement(By.xpath("//span[@class ='aDTYNe snByac OvPDhc OIC90c']")).click();
        WebElement fsname=driver.findElement(By.xpath("//input[@aria-labelledby='i15']"));// fathers name
        fsname.sendKeys(fname);
        driver.findElement(By.xpath("//div[@jsname= 'd9BH4c']")).click();
        Thread.sleep(500);
        List<WebElement> m = driver.findElements(By.xpath("//span[text()='BOO']"));
        Thread.sleep(300);
        m.get(1).click();
        Thread.sleep(300);
        driver.findElement(By.xpath("//input[@aria-labelledby='i23']")).sendKeys("10180401801");
        driver.findElement(By.xpath("//input[@aria-labelledby='i27']")).sendKeys("UMS SHAHPUR KHURD");
        WebElement button = driver.findElement(By.xpath("//label[@for='i35']"));
        js.executeScript("arguments[0].click();", button);

        // ROLL   NO ROLL     BUM     ROLLL
        driver.findElement(By.xpath("//input[@aria-labelledby='i38']")).sendKeys(rollno);

        // roll number
        List<WebElement> drop=driver.findElements(By.xpath("//span[text()='Choose']"));
        Thread.sleep(500);
        drop.get(1).click();
        Thread.sleep(300);
        List<WebElement> dropdown=driver.findElements(By.xpath("//span[text()='VAISHALI']"));
        Thread.sleep(400);
        dropdown.get(1).click();
        Thread.sleep(300);
        List<WebElement> next1 = driver.findElements(By.xpath("//div[@jsname='OCpkoe']"));
        Thread.sleep(200);
        next1.get(0).click();


        /*----------------------------------------------------------------*/
        /*ANSWER to the Questions */

        String first= test6.answerProperty6.getProperty("1");
        driver.findElement(By.xpath("//span[text()='"+first+"']")).click();//1

        String second= test6.answerProperty6.getProperty("2");
        driver.findElement(By.xpath("//span[text()='"+second+"']")).click();
        //2
        String third= test6.answerProperty6.getProperty("3");
        driver.findElement(By.xpath("//span[text()='"+third+"']")).click();      //3

        String fourth= test6.answerProperty6.getProperty("4");
        List<WebElement> fouropt = driver.findElements(By.xpath("//span[text()='"+fourth+"']"));//4
        fouropt.get(1).click();

        String fifth= test6.answerProperty6.getProperty("5");
        driver.findElement(By.xpath("//span[text()='"+fifth+"']")).click();    //6

        String sixth= test6.answerProperty6.getProperty("6");
        driver.findElement(By.xpath("//span[text()='"+sixth+"']")).click();     //7

        String seventh= test6.answerProperty6.getProperty("7");
        driver.findElement(By.xpath("//span[text()='"+seventh+"']")).click();
        // Multiple Answer
        /*List<WebElement> eightopt = driver.findElements(By.xpath("//span[text()='"+seventh+"']"));
        eightopt.get(1).click();  *///8
        //8
        String eight= test6.answerProperty6.getProperty("8");
        driver.findElement(By.xpath("//span[text()='"+eight+"']")).click();
        //9
        String ninth= test6.answerProperty6.getProperty("9");
        driver.findElement(By.xpath("//span[text()='"+ninth+"']")).click();//10

       /* String tenth= "Function Keys";
        driver.findElement(By.xpath("//span[text()='"+tenth+"']")).click();*///10

        String tenth= test6.answerProperty6.getProperty("10");
        List<WebElement> tenthopt = driver.findElements(By.xpath("//span[text()='"+tenth+"']"));
        tenthopt.get(0).click();

        List<WebElement> sub= driver.findElements(By.xpath("//div[@aria-label = 'Submit']"));
        sub.get(0).click();

        driver.navigate().refresh();

    }
}
