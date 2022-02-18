package testPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExampleTest {
    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        String browser = PropertyReader.BROWSER;
        switch (browser) {
            case ("chrome"):
            {
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



/*    @Test
    public void testExampl2Firefox() throws InterruptedException {

        System.setProperty("webdriver.firefox.driver", "C:\\Users\\Мазури\\IdeaProjects\\12.1\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://automationpractice.com/");
    }
}*/
/*
        WebElement singInButtom = driver.findElement(By.xpath("//a [@title='Contact Us']"));
        singInButtom.click();
 */   /*    WebElement navigathion = driver.findElement(By.xpath("//textarea[@class='form-control']"));
        driver.close();*/


    @Test
    public void testExampl1Chrome() throws InterruptedException {
        driver.get("http://automationpractice.com/");
        WebElement singInButtom = driver.findElement(By.xpath("//a [@title='Contact Us']"));
        singInButtom.click();
        WebElement navigathion = driver.findElement(By.xpath("//span [@class= \"shop-phone\"]"));
        // WebElement navigathion2 = driver.findElement(By.xpath("//h1 [@class= \"page-heading bottom-indent\"]\n"));

        assertTrue(driver.getCurrentUrl().contains("/index.php?controller=contact"));
        assertTrue(driver.findElement(By.xpath("//textarea[@class='form-control']")).isDisplayed());

        Thread.sleep(1800);
        driver.close();
    }
}

