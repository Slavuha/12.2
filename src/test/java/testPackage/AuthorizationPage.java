package testPackage;
import com.github.javafaker.Faker;
import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AuthorizationPage extends TestBaseBro  {

    public By navigationPanelLocator = By.cssSelector("span.navigation_page");
    private final By emailField = By.xpath("//input [@class= 'is_required validate account_input form-control']");
    private final By buttunCreateAcaunt = By.xpath("//i [@class=\"icon-user left\"]");
    private final By name = By.xpath("//*[@name=\"customer_firstname\"]");
    private final By lastName = By.xpath("//*[@name=\"customer_lastname\"]");
    private final By pasword = By.xpath("//*[@name=\"passwd\"]");
    private final By radioButton = By.xpath("//*[@id=\"id_gender1\"]");
    private final By addres = By.xpath("//*[@name=\"address1\"]");
    private final By city = By.xpath("//*[@name=\"city\"]");
    private final By cityClick = By.xpath("//*[@name=\"id_state\"]//*[@value=\"1\"]");
    private final By mobile = By.xpath("//*[@id=\"phone_mobile\"]");
    private final By zip = By.xpath("//*[@class=\"form-control uniform-input text\"]");
    private final By registerButtonFinal = By.xpath("//*[text()=\"Register\"]");

Faker faker = new Faker();
String email = faker.internet().emailAddress();
String nameFake = faker.name().firstName();


    public AuthorizationPage(WebDriver driver) {

    }

        public AuthorizationPage checkOnPage() {
            WebElement navigationPanel = driver.findElement(navigationPanelLocator);
            Assertions.assertTrue(navigationPanel.isDisplayed());
            Assertions.assertEquals("Authentication", navigationPanel.getText());
            return this;
        }

        public AuthorizationPage enterEmail() {
         driver.findElement(emailField).sendKeys(email);
            return new AuthorizationPage(driver);

    }
    public PageEnterData clickButtonRegistrAccount () {
        driver.findElement(buttunCreateAcaunt).click();
        return new PageEnterData(driver);

    }

    public AuthorizationPage enterName() {
        driver.findElement(name).sendKeys((faker.name().firstName()));
        return new AuthorizationPage(driver);
    }
    public AuthorizationPage enterLastName() {
        driver.findElement(lastName).sendKeys(faker.name().lastName());
        return new AuthorizationPage(driver);
    }
    public AuthorizationPage enterPassword() {
        driver.findElement(pasword).sendKeys(faker.internet().password());
        return new AuthorizationPage(driver);
    }

    public AuthorizationPage clickRadioButton() {
        driver.findElement(radioButton).click();
        return new AuthorizationPage(driver);
    }

    public AuthorizationPage enterAdress() {
        driver.findElement(addres).sendKeys(faker.address().city());
        return new AuthorizationPage(driver);
    }

    public AuthorizationPage enterCity() {
        driver.findElement(city).sendKeys(faker.address().city());
        return new AuthorizationPage(driver);
    }

    public AuthorizationPage cityClick() {
        driver.findElement(cityClick).click();
        return new AuthorizationPage(driver);
    }

    public AuthorizationPage enterMobile() {
        driver.findElement(mobile).sendKeys("0681988449");
        return new AuthorizationPage(driver);
    }


    public AuthorizationPage zipInput() {
        driver.findElement(zip).sendKeys("61242");
        return new AuthorizationPage(driver);
    }

    public AuthorizationPage clickFinalRegistr() {
        driver.findElement(registerButtonFinal).click();
        return new AuthorizationPage(driver);
    }




    /*WebElement sekondnameinput = driver.findElement(By.name("Last name"));
    sekondnameinput.sendKeys("Mazur");

    WebElement paswwordinput = driver.findElement(By.name("Paswword"));
    paswwordinput.sendKeys("777777");
    */}




/*
    private static String pageURL= "http://automationpractice.com/";
    private static WebDriver driver;
    Fairy fairy = Fairy.create();
    Person person = fairy.person();
    public By signInLocator = By.xpath();
    public By emailInputLocator = By.xpath();
    public By passwordInputLocator = By.xpath();

    public static AuthorizationPage navigateHere(WebDriver driverIn){
        driver=driverIn;
        driver.navigate().to(pageURL);
        return new AuthorizationPage();
    }
    public void doAuthorize(){
        WebElement emailInput = driver.findElement(emailInputLocator);
    //person.getEmail();
        emailInput.sendKeys("12345@gmail.com");

        WebElement passInput = driver.findElement(passwordInputLocator);
        passInput.sendKeys("12345");

        WebElement signInButton = driver.findElement(signInLocator);
        signInButton.click();
    }

    /*public void testExampl1Chrome() throws InterruptedException {
        driver.get("http://automationpractice.com/");
        WebElement singInButton = driver.findElement(By.xpath("//a [@class='login']"));
        singInButton.click();
        WebElement fieldEnterEmail = driver.findElement(By.xpath("//input [@class= 'is_required validate account_input form-control']"));
        fieldEnterEmail.sendKeys("12346@gmail.com");

        WebElement singInButtonToRegistry = driver.findElement(By.xpath("//i [@class=\"icon-user left\"]"));
        singInButtonToRegistry.click();
        //this time we are on the page with registri fields.

        // this wait bro    WebElement radioButtonMale = driver.findElement(By.xpath("//i [@class=\"icon-user left\"]"));
        // radioButtonMale.click();
        WebElement emailinput = driver.findElement(By.name("email"));
        emailinput.sendKeys("12346@gmail.com");
        WebElement nameinput = driver.findElement(By.xpath("//*[@name=\"customer_firstname\"]"));
        nameinput.sendKeys("Slavik");

    }
    */

