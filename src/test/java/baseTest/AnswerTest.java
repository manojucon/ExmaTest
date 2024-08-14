package baseTest;

import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
            answer12 = new FileInputStream("src/test/java/baseTest/testAnswer12.properties");
            answer11 = new FileInputStream("src/test/java/baseTest/testAnswer11.properties");
            answer10 = new FileInputStream("src/test/java/baseTest/testAnswer10.properties");
            answer9 = new FileInputStream("src/test/java/baseTest/testAnswer9.properties");
            answer8 = new FileInputStream("src/test/java/baseTest/testAnswer8.properties");
            answer7 = new FileInputStream("src/test/java/baseTest/testAnswer7.properties");
            answer6 = new FileInputStream("src/test/java/baseTest/testAnswer6.properties");
            answerProperty12 = new Properties();
            answerProperty11 = new Properties();
            answerProperty10 = new Properties();
            answerProperty9 = new Properties();
            answerProperty8 = new Properties();
            answerProperty7 = new Properties();
            answerProperty6 = new Properties();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            answerProperty12.load(answer12);
            answerProperty11.load(answer11);
            answerProperty10.load(answer10);
            answerProperty9.load(answer9);
            answerProperty8.load(answer8);
            answerProperty7.load(answer7);
            answerProperty6.load(answer6);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

