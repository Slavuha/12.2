package testPackage;


import org.junit.jupiter.api.Test;

public class NashTestBro extends TestBaseBro {
@Test


public void vseZanovoBro() {

    driver.get(PropertyReader.BASEURL);
    HomePage homePage = new HomePage(driver).waitOnPage();
    AuthorizationPage authorizationPage = homePage.clickSignIn();
    authorizationPage.checkOnPage();
    authorizationPage.enterEmail();
    authorizationPage.clickButtonRegistrAccount();
    PageEnterData pageEnterData = new PageEnterData(driver);
   authorizationPage.enterName();
    pageEnterData.enterName();
    pageEnterData.enterLastName();
    authorizationPage.enterName();
    authorizationPage.enterLastName();
    authorizationPage.enterPassword();
    authorizationPage.clickRadioButton();
    authorizationPage.enterAdress();
    authorizationPage.enterCity();
    authorizationPage.cityClick();
    authorizationPage.enterMobile();
    authorizationPage.zipInput();
    authorizationPage.clickFinalRegistr();



}





   /* @Test
    public void testExampl1Chrome() throws InterruptedException {
        driver.get("http://automationpractice.com/");
        WebElement singInButton = driver.findElement(By.xpath("//a [@class='login']"));
        singInButton.click();
        WebElement fieldEnterEmail = driver.findElement(By.xpath("//input [@class= 'is_required validate account_input form-control']"));
        fieldEnterEmail.sendKeys("12346@gmail.com");
      //  Person person = fairy.person();
        //person.getEmail();
       // fieldEnterEmail.sendKeys((CharSequence) person);


        WebElement singInButtonToRegistry = driver.findElement(By.xpath("//i [@class=\"icon-user left\"]"));
        singInButtonToRegistry.click();

     //   assertTrue(driver.findElement(By.xpath("//textarea[@class='form-control']")).isDisplayed());
    //    assertTrue(driver.getCurrentUrl().contains("/index.php?controller=contact"));
        Thread.sleep(3800);
        driver.close();
    }
   @Test
    public void testExampl2Firefox () throws InterruptedException {

      driver.get("http://automationpractice.com/");
       WebElement singInButtom = driver.findElement(By.xpath("//a [@title='Contact Us']"));
       singInButtom.click();
      //// assertTrue(driver.findElement(By.xpath("//textarea[@class='form-control']")).isDisplayed());
     //  assertTrue(driver.getCurrentUrl().contains("/index.php?controller=contact"));
       driver.close();
   }
*/
    }

