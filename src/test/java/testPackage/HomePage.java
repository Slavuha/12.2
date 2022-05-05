package testPackage;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

public final WebDriver driver;
private final String pageURL = PropertyReader.BASEURL;
private final By signInButton = By.xpath("//*[@class=\"login\"]");

public HomePage(WebDriver driver) {
       this.driver = driver;
    }

    public HomePage open() {
        driver.navigate().to(pageURL);
        return checkOnPage();
    }

    public HomePage checkOnPage() {
        Assertions.assertEquals("My Store", driver.getTitle(), "This is not Home Page" +
                " current page is: " + driver.getCurrentUrl());
        return this;
    }

    public HomePage waitOnPage() {
        WebDriverWait wait = new WebDriverWait(driver, 200);
        wait.pollingEvery(Duration.ofSeconds(10));
        wait.withTimeout(Duration.ofSeconds(300));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.elementToBeClickable(signInButton));
        return this;
    }
    public AuthorizationPage clickSignIn() {
        driver.findElement(signInButton).click();
        return new AuthorizationPage(driver);
    }



}
