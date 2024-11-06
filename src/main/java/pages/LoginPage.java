package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //relativni
    private By loginLink = By.cssSelector(".ico-login");
//    private By gender = By.xpath("//label[text()='Male']");
//    private By firstNameField = By.cssSelector(".inputs>label[for='FirstName'] + input");
//    private By lastNameField = By.xpath("//div/label[@for='LastName']/following-sibling::input");
    private By emailNameField = By.id("Email");
    private By passwordField = By.id("Password");
//    private By confirmPasswordField = By.id("ConfirmPassword");
    private By loginButton = By.cssSelector("input[value='Log in']");

    private By accountInfo = By.cssSelector(".account");


    //apsolutni
    ///html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[2]/input


    public void loginUser(){
        driver.findElement(loginLink).click();
//        driver.findElement(gender).click();
//        driver.findElement(firstNameField).sendKeys("John");
//        driver.findElement(lastNameField).sendKeys("Smith");
        driver.findElement(emailNameField).sendKeys("randomEmail1332123213@email.com");
        driver.findElement(passwordField).sendKeys("Test1234");
//        driver.findElement(confirmPasswordField).sendKeys("Test1234");
        driver.findElement(loginButton).click();
    }

    public boolean isUserLoggedIn(){
        String actualText = driver.findElement(accountInfo).getText();
        String expectedText = "randomEmail1332123213@email.com";
        return expectedText.equals(actualText.trim());
    }



}
