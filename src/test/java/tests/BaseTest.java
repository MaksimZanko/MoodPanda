package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.LoginPage;


@Listeners(TestListener.class)
public class BaseTest {
    LoginPage loginPage;
    @BeforeMethod
    public void setupBrowser(){
        Configuration.headless=false;
        Configuration.browserSize="1600x900";
        Configuration.timeout=20000;
        Configuration.browser="chrome";
        Configuration.clickViaJs=false;
        loginPage=new LoginPage();

    }
    @AfterMethod (alwaysRun = true)
    public void closeBrowser(){
        Selenide.closeWebDriver();
    }



}
