package examfor11;

import baseTest.AnswerTest;
import baseTest.BaseTest;
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

public class Boys11 extends BaseTest {

    public String text;
    List<String> integersFound;
    JavascriptExecutor js;
    AnswerTest test11;

    @BeforeClass
    public void setup(){
        js = (JavascriptExecutor) driver;

        driver.manage().timeouts().implicitlyWait(900, TimeUnit.SECONDS);
        test11 = new AnswerTest();
        test11.propertiesSetup();
    }

    @Test(priority = 1 , dataProvider="testData11Boys",dataProviderClass= testdata11boys.class)
    public void boys11(String rollno , String name, String fname) throws InterruptedException {
        driver.get(p.getProperty("test11"));
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
        driver.findElement(By.xpath("//input[@aria-labelledby='i23']")).sendKeys("10180401802");
        driver.findElement(By.xpath("//input[@aria-labelledby='i27']")).sendKeys("UHS SHAHPUR KHURD");
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
        Thread.sleep(900);
        String first= test11.answerProperty11.getProperty("1");
        driver.findElement(By.xpath("//span[text()='"+first+"']")).click();//1

        String second= test11.answerProperty11.getProperty("2");
        driver.findElement(By.xpath("//span[text()='"+second+"']")).click();
        //2
        String third= test11.answerProperty11.getProperty("3");
        driver.findElement(By.xpath("//span[text()='"+third+"']")).click();    //3

        String fourth= test11.answerProperty11.getProperty("4");
        driver.findElement(By.xpath("//span[text()='"+fourth+"']")).click();;//4

        String fifth= test11.answerProperty11.getProperty("5");
        driver.findElement(By.xpath("//span[text()='"+fifth+"']")).click();    //6

        String sixth= test11.answerProperty11.getProperty("6");
        driver.findElement(By.xpath("//span[text()='"+sixth+"']")).click();     //7

        String seventh= test11.answerProperty11.getProperty("7");
        driver.findElement(By.xpath("//span[text()='"+seventh+"']")).click();
        // Multiple Answer
        /*List<WebElement> eightopt = driver.findElements(By.xpath("//span[text()='"+seventh+"']"));
        eightopt.get(1).click();  *///8
        //8
        String eight= test11.answerProperty11.getProperty("8");
        List<WebElement> eightopt = driver.findElements(By.xpath("//span[text()='"+eight+"']"));
        eightopt.get(0).click();
        //9
        String ninth= test11.answerProperty11.getProperty("9");
        driver.findElement(By.xpath("//span[text()='"+ninth+"']")).click();//10

        String tenth= test11.answerProperty11.getProperty("10");
        driver.findElement(By.xpath("//span[text()='"+tenth+"']")).click();//10



        List<WebElement> wr1=driver.findElements(By.xpath("//label"));
        wr1.get(BaseTest.getSingleDigit()).click();
        List<WebElement> wr2=driver.findElements(By.xpath("//label"));
        wr2.get(BaseTest.getSingleDigit()).click();
        List<WebElement> wr3=driver.findElements(By.xpath("//label"));
        wr3.get(BaseTest.getSingleDigit()).click();
        List<WebElement> sub= driver.findElements(By.xpath("//div[@aria-label = 'Submit']"));
        sub.get(0).click();


        getViewScore();

    }
}

