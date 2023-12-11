package tests;

import org.testng.annotations.Test;


public class MoodPandaTest extends BaseTest {
    @Test(invocationCount = 5)
    public void login(){
        loginPage
                 .openPage()
                 .login("email"," password")
                 .openRateHapinessModal()
                 .updateMood(9)
                 .goTomyDiary();

    }
}
