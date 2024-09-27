package baseTest;

import org.testng.annotations.BeforeSuite;

import java.io.*;
import java.net.URL;
import java.util.Properties;

public class AnswerTest extends BaseTest {

    public Properties answerProperty12;
    FileInputStream answer12;
    public Properties answerProperty11;
    FileInputStream answer11;
    public Properties answerProperty10;
    FileInputStream answer10;
    public Properties answerProperty9;
    FileInputStream answer9;
    public Properties answerProperty8;
    FileInputStream answer8;

    public Properties answerProperty7;
    FileInputStream answer7;

    public Properties answerProperty6;
    FileInputStream answer6;



    public void propertiesSetup() {
        try {
            answerProperty12 = new Properties();
            answerProperty11 = new Properties();
            answerProperty10 = new Properties();
            answerProperty9 = new Properties();
            answerProperty8 = new Properties();
            answerProperty7 = new Properties();
            answerProperty6 = new Properties();
            answerProperty9.load(new InputStreamReader(new FileInputStream("src/test/java/baseTest/testAnswer9.properties"),"UTF-8"));
            answerProperty10.load(new InputStreamReader(new FileInputStream("src/test/java/baseTest/testAnswer10.properties"),"UTF-8"));
            answerProperty11.load(new InputStreamReader(new FileInputStream("src/test/java/baseTest/testAnswer11.properties"),"UTF-8"));
            answerProperty12.load(new InputStreamReader(new FileInputStream("src/test/java/baseTest/testAnswer12.properties"),"UTF-8"));
            answerProperty6.load(new InputStreamReader(new FileInputStream("src/test/java/baseTest/testAnswer6.properties"),"UTF-8"));
            answerProperty7.load(new InputStreamReader(new FileInputStream("src/test/java/baseTest/testAnswer7.properties"),"UTF-8"));
            answerProperty8.load(new InputStreamReader(new FileInputStream("src/test/java/baseTest/testAnswer8.properties"),"UTF-8"));
            answer12 = new FileInputStream("src/test/java/baseTest/testAnswer12.properties");
            answer11 = new FileInputStream("src/test/java/baseTest/testAnswer11.properties");
            answer10 = new FileInputStream("src/test/java/baseTest/testAnswer10.properties");
            answer9 = new FileInputStream("src/test/java/baseTest/testAnswer9.properties");
            answer8 = new FileInputStream("src/test/java/baseTest/testAnswer8.properties");
            answer7 = new FileInputStream("src/test/java/baseTest/testAnswer7.properties");
            answer6 = new FileInputStream("src/test/java/baseTest/testAnswer6.properties");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            answerProperty12.load(answer12);
            answerProperty11.load(answer11);
            answerProperty10.load(answer10);
          /*  answerProperty9.load(answer9);*/
            answerProperty8.load(answer8);
            answerProperty7.load(answer7);
            answerProperty6.load(answer6);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

