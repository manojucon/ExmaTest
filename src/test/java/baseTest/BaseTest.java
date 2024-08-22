package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.PublicKey;
import java.util.Properties;
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
        FileInputStream reader= null;
        try {
            reader = new FileInputStream("src/test/java/baseTest/urlTest.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
         p=new Properties();
        try {
            p.load(reader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        url12=p.getProperty("test12");
        url11=p.getProperty("test11");
        url10=p.getProperty("test10");
        url9=p.getProperty("test9");
        url8=p.getProperty("test8");
        url7=p.getProperty("test7");
        url6=p.getProperty("test6");

    }
}
