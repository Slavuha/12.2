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
    private static WebDriver driver(){
        WebDriver driverChrome = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        WebDriver driverFirefox = new FirefoxDriver();
        WebDriverManager.firefoxdriver().setup();

    return  driver();}
    @Test
    public void testExampl1Chrome() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/");
        WebElement singInButtom = driver.findElement(By.xpath("//a [@title='Contact Us']"));
        singInButtom.click();
        assertTrue(driver.findElement(By.xpath("//textarea[@class='form-control']")).isDisplayed());
        assertTrue(driver.getCurrentUrl().contains("/index.php?controller=contact"));
        Thread.sleep(1800);
        driver.close();
    }
/*   @Test
    public void testExampl2Firefox () throws InterruptedException {
       System.setProperty("webdriver.firefox.driver", "C:\\Users\\Мазури\\IdeaProjects\\12.1\\geckodriver.exe");
       WebDriver driver = new FirefoxDriver();
       driver.get("http://automationpractice.com/");
       WebElement singInButtom = driver.findElement(By.xpath("//a [@title='Contact Us']"));
       singInButtom.click();
       assertTrue(driver.findElement(By.xpath("//textarea[@class='form-control']")).isDisplayed());
       assertTrue(driver.getCurrentUrl().contains("/index.php?controller=contact"));
       driver.close();
   }*/

    @BeforeAll
  public static void setUp() {
      String browser = PropertyReader.BROWSER;
      switch (browser) {
          case ("chrome"):
              ChromeDriver driver;
          {
              WebDriverManager.chromedriver().setup();
              driver = new ChromeDriver();
              break;
       /*   }
          case ("firefox"): {
              WebDriverManager.firefoxdriver().setup();
              driver = new ChromeDriver();
              break;
       */   }
          default:
              throw new InvalidArgumentException("can not initialize driver available options: chrome, firefox");
      }
  }

    }

