package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import java.io.*;
import java.security.PublicKey;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static String url12;
    public static String url11;
    public static String url10;
    public static String url9;
    public static String url8;
    public static String url7;
    public static String url6;
    public Properties p;
    public WebDriver driver;

    @BeforeSuite
    public void propertiesSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(900, TimeUnit.SECONDS);
        FileInputStream reader = null;
        try {
            reader = new FileInputStream("src/test/java/baseTest/urlTest.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        p = new Properties();
        try {
            p.load(reader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        url12 = p.getProperty("test12");
        url11 = p.getProperty("test11");
        url10 = p.getProperty("test10");
        url9 = p.getProperty("test9");
        url8 = p.getProperty("test8");
        url7 = p.getProperty("test7");
        url6 = p.getProperty("test6");

    }

  /*  @AfterMethod
    public void getOutput() throws IOException, InterruptedException {
        Thread.sleep(900);
        String parent=driver.getWindowHandle();
        driver.findElement(By.xpath("//span[text()='View score']")).click();
        Thread.sleep(400);
        Set<String>s=driver.getWindowHandles();

// Now iterate using Iterator
        Iterator<String> I1= s.iterator();

        while(I1.hasNext()) {

            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
            }
        }

        getScreenshoot();
        driver.close();
        driver.switchTo().window(parent);
    }*/


    public void getScreenshoot() throws IOException {
        Random rand = new Random();

        // Generate random integers in range 0 to 999
        Double rand_int1 = rand.nextDouble(10000000);
        TakesScreenshot screenshot = (TakesScreenshot) driver;
//Saving the screenshot in desired location
        File source = screenshot.getScreenshotAs(OutputType.FILE);
//Path to the location to save screenshot
        FileUtils.copyFile(source, new File("./SeleniumScreenshots/" + rand_int1 + "Screen.png"));

    }

    public static int getSingleDigit(){
        Random rand = new Random();
        int rand_int1 = rand.nextInt(10);
        return (rand_int1);

    }
}

