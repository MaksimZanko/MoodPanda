package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MyDiaryPage extends BasePage{
    @Override
    public BasePage openPage() {
        return null;
    }

    @Override
    public BasePage isPageOpened() {
        $(By.id("ContentPlaceHolderContent_MyMoodPandaNav1_UserStats")).shouldBe(Condition.visible, Duration.ofMillis(20000));
        return this;
    }
}
