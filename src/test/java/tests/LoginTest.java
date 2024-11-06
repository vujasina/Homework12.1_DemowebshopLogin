package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;

public class LoginTest extends BaseTest{

    private LoginPage loginPage;


    @BeforeMethod
    public void setUpLogin(){
        loginPage = new LoginPage(driver);
    }


    @Test
    public void loginUserTest(){
        loginPage.loginUser();
        Assert.assertTrue(loginPage.isUserLoggedIn());
    }


}