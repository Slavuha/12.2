package testPackage;

import io.codearte.jfairy.Fairy;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Class whithout test it simple test Base with setings to next test/code lice Main))
public class TestBaseBro {
    //created WebDriver
    protected static WebDriver driver;
//let single try start with crome)
/*
    public void setUp() {
        String browser = PropertyReader.BROWSER;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
*/


    //created Fairy
  //  Fairy fairy = Fairy.create(); let freeze it)

    @BeforeEach
    public void setUp() {
        String browser = PropertyReader.BROWSER;
        switch (browser) {
            case ("chrome"): {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            }
            case ("firefox"): {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            }
            default:
                throw new InvalidArgumentException("can not initialize driver available options: chrome, firefox");
        }
    }


//Close driver bro
//    @AfterEach
//    public void treedown(){
//        driver.close();
//    }
}
