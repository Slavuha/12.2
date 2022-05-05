package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageEnterData extends AuthorizationPage{

    private final By name = By.xpath("//*[@name=\"customer_firstname\"]");
    private final By lastName = By.xpath("//*[@name=\"customer_lastname\"]");


    public PageEnterData(WebDriver driver) {
        super(driver);
    }

    public AuthorizationPage enterName() {
        driver.findElement(name).sendKeys((faker.name().firstName()));
        return new AuthorizationPage(driver);
    }
    public AuthorizationPage enterLastName() {
        driver.findElement(lastName).sendKeys(faker.name().lastName());
        return new AuthorizationPage(driver);
    }


}
