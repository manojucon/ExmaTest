package examfor12;

import baseTest.AnswerTest;
import baseTest.BaseTest;

import org.openqa.selenium.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Girls12 extends BaseTest {
    public String text;
    List<String> integersFound;
    JavascriptExecutor js ;
    AnswerTest test12;

    @BeforeClass
    public void setup(){
        js = (JavascriptExecutor) driver;

        test12 = new AnswerTest();
        test12.propertiesSetup();
    }

    @AfterClass
    public void cleanup(){
        driver.quit();
    }


    @Test(priority = 1 , dataProvider="testData12Girls",dataProviderClass=testDataFor12Girls.class)
    public void verifyLoginWithValidCredentials(String rollno , String name, String fname) throws InterruptedException {
        driver.get(p.getProperty("test12"));
        driver.findElement(By.xpath("//input[@jsname='YPqjbf']")).sendKeys("shahpurkhurdu@gmail.com");
        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        Thread.sleep(400);
        WebElement sname=driver.findElement(By.xpath("//input[@jsname='YPqjbf']"));
        sname.sendKeys(name);
        driver.findElement(By.xpath("//span[text()='Female']")).click();
        List<WebElement> textFields =driver.findElements(By.xpath("//input[@jsname='YPqjbf']"));// fathers name
        textFields.get(1).sendKeys(fname);
        Thread.sleep(200);
        textFields.get(2).sendKeys("10180401802");
        Thread.sleep(200);
        textFields.get(3).sendKeys("UHS SHAHPUR KHURD");
        Thread.sleep(200);
        driver.findElement(By.xpath("//div[@jsname= 'd9BH4c']")).click();
        Thread.sleep(300);
        List<WebElement> m = driver.findElements(By.xpath("//span[text()='BOO']"));
        Thread.sleep(300);
        m.get(1).click();
        Thread.sleep(300);
        WebElement button = driver.findElement(By.xpath("//span[text()='12']"));
        js.executeScript("arguments[0].click();", button);

        textFields.get(4).sendKeys(rollno);
        Thread.sleep(200);
        List<WebElement> drop=driver.findElements(By.xpath("//span[text()='Choose']"));
        Thread.sleep(100);
        drop.get(1).click();
        Thread.sleep(400);
        List<WebElement> dropdown=driver.findElements(By.xpath("//span[text()='VAISHALI']"));
        Thread.sleep(600);
        dropdown.get(1).click();
        Thread.sleep(300);
        List<WebElement> next1 = driver.findElements(By.xpath("//div[@jsname='OCpkoe']"));
        Thread.sleep(200);
        next1.get(0).click();
        Thread.sleep(400);
       /*----------------------------------------------------------------*/
        /*ANSWER to the Questions */

        String first= test12.answerProperty12.getProperty("1");
        driver.findElement(By.xpath("//span[text()='"+first+"']")).click();

        String second= test12.answerProperty12.getProperty("2");
        driver.findElement(By.xpath("//span[text()='"+second+"']")).click();
        String third= test12.answerProperty12.getProperty("3");
        driver.findElement(By.xpath("//span[text()='"+third+"']")).click();



       /* String first= test12.answerProperty12.getProperty("1");
        driver.findElement(By.xpath("//span[text()='"+first+"']")).click();*///1

       /* String second= test12.answerProperty12.getProperty("2");
        driver.findElement(By.xpath("//span[text()='"+second+"']")).click();*/
        //2
       /* String third= test12.answerProperty12.getProperty("3");
        driver.findElement(By.xpath("//span[text()='"+third+"']")).click();*/     //3

        String fourth= test12.answerProperty12.getProperty("4");
        driver.findElement(By.xpath("//span[text()='"+fourth+"']")).click();//4


        String fifth= test12.answerProperty12.getProperty("5");
        driver.findElement(By.xpath("//span[text()='"+fifth+"']")).click();    //6

        String sixth= test12.answerProperty12.getProperty("6");
        driver.findElement(By.xpath("//span[text()='"+sixth+"']")).click();    //7

        String seventh= test12.answerProperty12.getProperty("7");
        driver.findElement(By.xpath("//span[text()='"+seventh+"']")).click();
        // Multiple Answer
       /* String eight= test12.answerProperty12.getProperty("8");
        List<WebElement> eightopt = driver.findElements(By.xpath("//span[text()='"+eight+"']"));
        eightopt.get(1).click();*/
        //8
        String eight= test12.answerProperty12.getProperty("8");
        driver.findElement(By.xpath("//span[text()='"+eight+"']")).click();
        //9
        String ninth= test12.answerProperty12.getProperty("9");
        driver.findElement(By.xpath("//span[text()='"+ninth+"']")).click();

       /* String tenth= "Function Keys";
        driver.findElement(By.xpath("//span[text()='"+tenth+"']")).click();*///10

        String tenth= test12.answerProperty12.getProperty("10");
        driver.findElement(By.xpath("//span[text()='"+tenth+"']")).click();
       /* List<WebElement> w=driver.findElements(By.xpath("//label"));
        w.get(36).click();*/

        List<WebElement> wr1=driver.findElements(By.xpath("//label"));
        wr1.get(BaseTest.getSingleDigit()).click();
        List<WebElement> wr2=driver.findElements(By.xpath("//label"));
        wr2.get(BaseTest.getSingleDigit()).click();
        /*List<WebElement> wr3=driver.findElements(By.xpath("//label"));
        wr3.get(BaseTest.getSingleDigit()).click();*/
        List<WebElement> sub= driver.findElements(By.xpath("//div[@aria-label = 'Submit']"));
        sub.get(0).click();
        getViewScore();
    }
}

