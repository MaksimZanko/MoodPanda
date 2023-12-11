package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage extends BasePage{
    @Override
    public LoginPage openPage() {
        open("https://moodpanda.com/login");
        isPageOpened();
        return this;
    }

    @Override
    public LoginPage isPageOpened() {

        $("[alt='MoodPanda App on Google Play'").shouldBe(Condition.visible,Duration.ofMillis(20000));
        return this;
    }
    public FeedPage login(String email, String password){
        sleep(20000);
        $(By.id("ContentPlaceHolderContent_TextBoxEmail")).setValue(email);
        $(By.id("ContentPlaceHolderContent_TextBoxPassword")).setValue(password);
        $(By.id("ContentPlaceHolderContent_ButtonLogin")).click();
        FeedPage feedPage = new FeedPage();
        feedPage.isPageOpened();
        return feedPage;
    }
}
