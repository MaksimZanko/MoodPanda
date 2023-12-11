package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.open;
import  static com.codeborne.selenide.Selenide.$;

public class FeedPage extends BasePage{
    By updateButton = By.id("LinkUpdate");
    @Override
    public FeedPage openPage() {
        open("https://moodpanda.com/feed/");
        return this;
    }

    @Override
    public FeedPage isPageOpened() {
        $(byText("Control my privacy")).shouldBe(Condition.visible, Duration.ofMillis(20000));
        return null;
    }
    public RateHapinessModal openRateHapinessModal (){
        $(updateButton).click();
        RateHapinessModal rateHapinessModal =new RateHapinessModal();
        rateHapinessModal.isModalOpened();
        return rateHapinessModal;
    }
}
