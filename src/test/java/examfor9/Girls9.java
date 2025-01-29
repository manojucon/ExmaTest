package examfor9;

import baseTest.AnswerTest;
import baseTest.BaseTest;
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

public class Girls9 extends BaseTest {
    public String text;
    List<String> integersFound;
    JavascriptExecutor js ;
    AnswerTest test9;

    @BeforeClass
    public void setup(){
        js = (JavascriptExecutor) driver;

        driver.manage().timeouts().implicitlyWait(900, TimeUnit.SECONDS);
        test9 = new AnswerTest();
        test9.propertiesSetup();
    }




    @Test(priority = 1 , dataProvider="testData9Girls",dataProviderClass= testDataFor9Girls.class)
    public void girls9(String rollno , String name, String fname) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(900, TimeUnit.SECONDS);

        driver.get(p.getProperty("test9"));

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
        WebElement button = driver.findElement(By.xpath("//span[text()='09']"));
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

       /* Integer x = Integer.valueOf(rollno);
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
        Thread.sleep(900);
        String first= test9.answerProperty9.getProperty("1");
        driver.findElement(By.xpath("//span[text()='"+first+"']")).click();//1
        Thread.sleep(300);

        String second= test9.answerProperty9.getProperty("2");
        driver.findElement(By.xpath("//span[text()='"+second+"']")).click();
        Thread.sleep(300);
        //2
        String third= test9.answerProperty9.getProperty("3");
        driver.findElement(By.xpath("//span[text()='"+third+"']")).click();//3
        Thread.sleep(300);

        String fourth= test9.answerProperty9.getProperty("4");
        driver.findElement(By.xpath("//span[text()='"+fourth+"']")).click();
        Thread.sleep(300);

        String fifth= test9.answerProperty9.getProperty("5");
        driver.findElement(By.xpath("//span[text()='"+fifth+"']")).click();
        Thread.sleep(300);//6

       /* String sixth= test9.answerProperty9.getProperty("6");
        driver.findElement(By.xpath("//span[text()='"+sixth+"']")).click(); */    //7

        List<WebElement> sixthnew=driver.findElements(By.xpath("//label"));
        sixthnew.get(21).click();
        Thread.sleep(300);

        String seventh= test9.answerProperty9.getProperty("7");
        driver.findElement(By.xpath("//span[text()='"+seventh+"']")).click();
        Thread.sleep(300);
        // Multiple Answer
        String eight= test9.answerProperty9.getProperty("8");
        driver.findElement(By.xpath("//span[text()='"+eight+"']")).click();
        Thread.sleep(300);
        /*String eight= test9.answerProperty9.getProperty("8");
        driver.findElement(By.xpath("//span[text()='"+eight+"']")).click();*/
        //9
        String ninth= test9.answerProperty9.getProperty("9");
        driver.findElement(By.xpath("//span[text()='"+ninth+"']")).click();//10
        Thread.sleep(300);

       /* String tenth= "Function Keys";
        driver.findElement(By.xpath("//span[text()='"+tenth+"']")).click();*///10

        String tenth= test9.answerProperty9.getProperty("10");
        driver.findElement(By.xpath("//span[text()='"+tenth+"']")).click();
        Thread.sleep(300);
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










